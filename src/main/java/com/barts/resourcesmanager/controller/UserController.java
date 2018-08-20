package com.barts.resourcesmanager.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.barts.resourcesmanager.entity.User;
import com.barts.resourcesmanager.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/list-users")
	public String showUsers(ModelMap model) {
		model.put("users", service.retrieveUsers());
		
		return "list-users";
	}
	
	@GetMapping("/add-user")
	public String showAddUser(ModelMap model) {
		model.addAttribute("user", new User("", "", "", "", ""));
		return "add-user";
	}
	
	@PostMapping("/add-user")
	public String addUser(@Valid User user, BindingResult bindingResult) {
		if(bindingResult.hasErrors())
			return "add-user";
		
		service.addUser(user);
		
		return "redirect:list-users";
	}
	
	@GetMapping("/delete-user")
	public String deleteUser(@RequestParam long id) {
		service.deleteUser(id);
		
		return "redirect:list-users";
	}
}
