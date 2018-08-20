package com.barts.resourcesmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.barts.resourcesmanager.entity.User;
import com.barts.resourcesmanager.service.UserService;

@Controller
public class WelcomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String showLoginPage(ModelMap model) {
		
		User activeUser = userService.getLoggedinUser();
		model.put("name", activeUser.getFirstName() + " " + activeUser.getLastName());

		return "welcome";
	}
}
