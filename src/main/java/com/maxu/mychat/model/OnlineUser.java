package com.maxu.mychat.model;

import java.util.HashMap;

import com.maxu.mychat.service.UserService;

/**
 * 用于存储在线的用户ID
 * @author MaXU
 *
 */
public class OnlineUser {
  //用于存储在线用户的id
  public static HashMap<Integer, User> onlineUsers = new HashMap<>();
  
  /**
   * 用于判断id为userId的用户是否在线
   * @param userId  待判断的用户ID
   * @return 如果用户在线就返回true,否则就返回false
   */
  public static boolean isOnline(int userId) {
    if(onlineUsers.containsKey(userId)) {
      return true;
    }else {
      return false;
    }
  }

  /**
   * 添加在线的用户
   * @param userId 在线用户的id
   * @param user   在线用户
   */
  public static void addUser(int userId,User user) {
    onlineUsers.put(userId,user);
  }
  
  /**
   * 添加在线用户
   * @param userId  待添加的用户id
   */
  public static void addUser(int userId) {
    onlineUsers.put(userId, new UserService().getUserById(userId));
  }
  
  /**
   * 添加在线用户
   * @param user  待添加的用户
   */
  public static void addUser(User user) {
    onlineUsers.put(user.getUserid(), user);
  }
  
  /**
   * 删除一个在线的用户
   * @param userId  待删除的用户id
   * @return 如果该用户已经不在线就返回false,否则就删除并返回true
   */
  public static boolean removeUser(int userId) {
    if(onlineUsers.containsKey(userId)) {
      onlineUsers.remove(userId);
      return true;
    }else {
      return false;
    }
  }
  
  public static User getOnlineUserById(int userId) {
    return onlineUsers.get(userId);
  }
}
