package com.webtours.controller;

import java.security.Principal;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webtours.dao.UsuarioDao;
import com.webtours.model.Usuario;
import com.webtours.service.UsuarioService;
import com.webtours.service.UsuarioServiceImp;


@Controller
public class MyContoller {

  //private UsuarioDao usuarioDao;
  
  @Autowired
  private UsuarioService usuarioService;
  
  @GetMapping("/")
  public String in(Model model, Principal principal) {
//    model.addAttribute("message", "You are logged in as " + principal.getName());
    return "index";
  }
  @RequestMapping("/usuario")
  public String setupForm(Map<String, Object> map) {
	  Usuario usuario = new Usuario();
	  map.put("usuario", usuario);
	  
	  return "usuario";
  }

 @RequestMapping(value="/usuario.do",method=RequestMethod.POST)
  public String doActions(@ModelAttribute Usuario usuario, BindingResult result,@RequestParam String action, Map<String, Object>map) {
	  Usuario usuarioResult= new Usuario();
	  switch(action.toLowerCase()){
	  case "add":
	 	usuarioService.add(usuario);
	usuarioResult = usuario;
	break;
	  }
	map.put("usuario", usuarioResult);
	  return "usuario";
  }
	  




//@GetMapping("/login")
//public String login(Model model, Principal principal) {
////  model.addAttribute("message", "You are logged in as " + principal.getName());
//  return "login";
//}
//  
//  @GetMapping("/in")
//  public String in(Model model, Principal principal) {
//    model.addAttribute("message", "You are logged in as " + principal.getName());
//    return "in";
//  }
}
