package br.com.webnize.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.webnize.service.UserService;

@Controller
public class UserController {
  
  @Autowired
  private UserService userService;
  
  @RequestMapping("/users")
  public String findAll(Model model){
    model.addAttribute("users", userService.findAll());
    return "users";    
  }
  
}
