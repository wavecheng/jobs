package com.citrix.apac.recruiting.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String index(ModelMap model){
	      Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String name = auth.getName(); //get logged in username			
	      model.addAttribute("username", name);

		return "index";
	}
	
	@RequestMapping(value="/login")
	public void login(){

	}
	
	@RequestMapping(value="/admin")
	public String admin(){
		return "admin";
	}
}
