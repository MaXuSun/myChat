package com.maxu.mychat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxu.mychat.dao.UserMapper;
import com.maxu.mychat.model.User;
import com.maxu.mychat.model.UserExample;
import com.maxu.mychat.model.UserExample.Criteria;

@Service
public class UserService {
  
  private static UserService newUserService;

  @Autowired
  UserMapper userMapper;
  
  /**
   * 返回nickname 为username 的用户
   * 
   * @param username
   * @return
   */
  public List<User> getUserByName(String username) {
    UserExample example = new UserExample();
    Criteria criteria = example.createCriteria();
    criteria.andUsernicknameEqualTo(username);
    List<User> result = userMapper.selectByExample(example);
    return result;
  }
  
  public User getUserById(int userId) {
    UserExample example = new UserExample();
    Criteria criteria = example.createCriteria();
    criteria.andUseridEqualTo(userId);
    return (User) userMapper.selectByExample(example);
  }
  
  public void addUserSelective(User user) {
    userMapper.insertSelective(user);
  }

  public void addUser(User user) {
    userMapper.insert(user);
  }

}
