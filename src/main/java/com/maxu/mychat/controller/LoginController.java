package com.maxu.mychat.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.maxu.mychat.model.OnlineUser;
import com.maxu.mychat.model.User;
import com.maxu.mychat.service.UserService;
import com.maxu.mychat.utils.TipMsg;

/**
 * 处理登陆，注册和退出。
 * @author MaXU
 *
 */
@Controller
public class LoginController {
  @Autowired
  UserService userService;
  
  ObjectMapper objectmapper = new ObjectMapper();
  
  /**
   * 登陆成功后跳转到聊天主页
   * @param username
   * @param password
   * @return
   * @throws JsonProcessingException 
   */
  @RequestMapping("/chat")
  public String getChat(String username,String password,HttpSession session,HttpServletResponse response) throws JsonProcessingException {
    //System.out.println(username);
    List<User> users = userService.getUser(username);
    session.removeAttribute("msg");
    String string;
    if(users == null||users.size() == 0) {
    }else {
      for(User user:users) {
       // System.out.println(user.getUserpassword());
        if(user.getUserpassword().equals(password)) {
          response.addIntHeader("userId", user.getUserid());
          return "chat";
        }
      }
    }
    //System.out.println(password);
    TipMsg msg = TipMsg.fail().add("fail", "用户名或密码错误");
    string = objectmapper.writeValueAsString(msg);
    System.out.println(string);
    session.setAttribute("msg", string);
    return "redirect:index.jsp";
  }
  
  @RequestMapping("/loginout")
  public String loginOut(HttpSession session) {
    OnlineUser.removeUser( ((User) session.getAttribute("user")).getUserid());
    session.removeAttribute("user");
    session.removeAttribute("msg");
    return "redirect:index.jsp";
  }
  
  @RequestMapping("/signup")
  @ResponseBody
  public TipMsg signup(String username,String password) {
    System.out.println(username);
    System.out.println(password);
    List<User> users = userService.getUser(username);
    if(users == null||users.size() == 0) {
     User user = new User();
     user.setUsernickname(username);
     user.setUserpassword(password);
     userService.addUserSelective(user);
     return TipMsg.success().add("success", "注册成功"); 
    }else {
      return TipMsg.fail().add("fail", "该用户名已经存在");
    }
  }
}
