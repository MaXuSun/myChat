package com.maxu.mychat.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.maxu.mychat.dao.UserMapper;
import com.maxu.mychat.model.User;

/**
 * 测试dao层的工作
 * @author MaXU
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring/spring.xml"})
public class MapperTest {
  @Autowired
  UserMapper userMapper;
  
  @Test
  public void testCRUD() {
    User user = new User();
    user.setUserage(20);
    user.setUsernickname("admin");
    user.setUserpassword("123456");
    userMapper.insertSelective(user);
  }
}
