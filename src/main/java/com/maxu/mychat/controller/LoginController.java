package com.maxu.mychat.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.maxu.mychat.model.TipMsg;
import com.maxu.mychat.model.User;
import com.maxu.mychat.service.UserService;

/**
 * 处理登陆界面的请求
 * @author MaXU
 *
 */
@Controller
public class LoginController {
  
  UserService userService;
  
  /**
   * 登陆成功后跳转到聊天主页
   * @param username
   * @param password
   * @param request
   * @return
   */
  @RequestMapping("/chat")
  public ModelAndView getChat(String username,String password,HttpServletRequest request) {
    System.out.println(username);
    ModelAndView mav = new ModelAndView("chat");
    List<User> users = userService.getUser(username);
    if(users.size() == 0) {
      TipMsg msg = TipMsg.fail().add("fail", "不存在改用户名");
      mav.addObject("msg",msg);
      return mav;
    }else {
      for(User user:users) {
        if(user.getUsernickname().equals(password)) {
          TipMsg msg = TipMsg.success().add("success", user);
          mav.addObject("msg", msg);
        }
      }
    }
    System.out.println(password);
    return mav;
  }
}
