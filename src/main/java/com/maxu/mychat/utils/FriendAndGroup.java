package com.maxu.mychat.utils;

import java.util.HashMap;

/**
 * 用来记录一个用户的好友和群组功能，因为在数据库中User类不具备记录好友和群组的功能
 * 所以借助这个类来记录
 * @author MaXU
 *
 */
public class FriendAndGroup {
  
  public static HashMap<Integer, FriendAndGroup> recorder = new HashMap<>();
  
  private HashMap<Integer, String> friend = new HashMap<>();
  
  private HashMap<Integer, String> group = new HashMap<>();
  

  public void addFriend(int userId,String nickName) {
    this.friend.put(userId, nickName);
  }
  
  public void removeFriend(int userId,String nickName) {
    this.friend.remove(userId,nickName);
  }
  
  public void addGroup(int groupId,String groupName) {
    this.group.put(groupId, groupName);
  }
  
  public void removeGroup(int groupId,String groupName) {
    this.group.remove(groupId,groupName);
  }
}
