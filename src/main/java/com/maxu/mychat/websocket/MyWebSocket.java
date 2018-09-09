package com.maxu.mychat.websocket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.servlet.http.HttpSession;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.web.socket.server.standard.SpringConfigurator;

import com.maxu.mychat.model.User;
import com.maxu.mychat.service.UserService;


@ServerEndpoint(value = "/websocket", configurator = SpringConfigurator.class)
public class MyWebSocket {
  // 静态变量，用来记录当前在线连接数。应该设计成线程安全的
  private static int onlineCount = 0;
  private static List<Integer> onlineListId = new ArrayList<>(); //记录该聊天室在线用户
  private static Map<Integer,Session> routertab = new HashMap<Integer, Session>(); //记录用户对应的路由表
  // concurent包的线程安全set，用来存放每个客户端对应的mywebsocket对象
  // 若要实现服务端与单一客户端通信的话，可以使用map来存放，其中key可以为用户标识
  private static CopyOnWriteArraySet<MyWebSocket> webSocketSet = new CopyOnWriteArraySet<>();

  // 与客户端的连接会话，通过它来给客户端发送数据
  private Session session;
  private User user;
  private HttpSession requestSession;  //request的session

  /**
   * 连接建立成功调用的方法
   * 
   * @param session
   *          可选的参数，session为与某个客户端的连接会话，需要通过它来给客户端发送数据
   */
  @OnOpen
  public void onOpen(Session session,EndpointConfig config) {
    this.session = session;
    webSocketSet.add(this);   //将该客户端加入到该服务器中
    addOnlineCount();         //在线人数加1
    this.requestSession = (HttpSession)config.getUserProperties().get(HttpSession.class.getName());
    //这里获得user可以通过下面代码
    //this.user = OnlineUser.getOnlineUserById(userId);
    //因为登陆的用户都维护在里面了
    this.user = new UserService().getUserById((int) requestSession.getAttribute("userid")); //获取当前用户
    onlineListId.add(user.getUserid());   //将用户id添加进在线列表
    routertab.put(user.getUserid(), session);   //将用户id与session绑定到路由表
    broadcast(createMessage("系统消息",user.getUsernickname()+"已经上线"));   //进行广播
  }
  
  /**
   * 关闭连接时调用的方法
   */
  @OnClose
  public void onClose() {
    webSocketSet.remove(this);
    subOnlineCount();
    onlineListId.remove(this.user.getUserid());
    broadcast(createMessage("系统消息", user.getUsernickname()+"已经下线"));
  }
  
  /**
   * 姐搜客户端的message,对消息进行广播
   * @param message  客户端发送来的消息
   */
  @OnMessage
  public void onMessage(String message) {
    //将消息推送到整个群
    broadcast(createMessage(user.getUsernickname(),message));
  }
  /**
   * 广播，向每一个用户都发送消息
   * @param message
   */
  public void broadcast(String message) {
    for(MyWebSocket socket:MyWebSocket.webSocketSet) {
      try {
        socket.session.getBasicRemote().sendText(message);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  /**
   * 向某一个用户发送消息
   * @param message
   * @param session
   */
  public void sendMessage(String message,Session session) {
    try {
      session.getBasicRemote().sendText(message);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public String createMessage(String obj,String message) {
    return "["+obj+" :"+message+"]";
  }

  public int getOnlineCount() {
    return onlineCount;
  }

  public void addOnlineCount() {
    MyWebSocket.onlineCount++;
  }

  public void subOnlineCount() {
    MyWebSocket.onlineCount--;
  }
}
