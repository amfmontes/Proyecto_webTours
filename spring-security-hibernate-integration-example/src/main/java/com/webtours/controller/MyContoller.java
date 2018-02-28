package com.webtours.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyContoller {

  @GetMapping("/")
  public String in(Model model, Principal principal) {
//    model.addAttribute("message", "You are logged in as " + principal.getName());
    return "index";
  }
  
@GetMapping("/login")
public String login(Model model, Principal principal) {
//  model.addAttribute("message", "You are logged in as " + principal.getName());
  return "login";
}
  
//  @GetMapping("/in")
//  public String in(Model model, Principal principal) {
//    model.addAttribute("message", "You are logged in as " + principal.getName());
//    return "in";
//  }
}
