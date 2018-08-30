package com.maxu.mychat.model;

import java.util.HashSet;
import java.util.Set;

/**
 * 用于存储在线的用户ID
 * @author MaXU
 *
 */
public class OnlineUser {
  public static Set<Integer> onlineUsers = new HashSet<>();
  
  /**
   * 用于判断id为userId的用户是否在线
   * @param userId  待判断的用户ID
   * @return 如果用户在线就返回true,否则就返回false
   */
  public static boolean isOnline(int userId) {
    if(onlineUsers.contains(userId)) {
      return true;
    }else {
      return false;
    }
  }
  
  /**
   * 添加在线的用户
   * @param userId  待添加的用户id
   */
  public static void addUser(int userId) {
    onlineUsers.add(userId);
  }
  
  /**
   * 删除一个在线的用户
   * @param userId  待删除的用户id
   * @return 如果该用户已经不在线就返回false,否则就删除并返回true
   */
  public static boolean removeUser(int userId) {
    if(onlineUsers.contains(userId)) {
      onlineUsers.remove(userId);
      return true;
    }else {
      return false;
    }
    
  }
}
