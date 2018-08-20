package com.barts.resourcesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.barts.resourcesmanager.entity.User;
import com.barts.resourcesmanager.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> retrieveUsers(){
		return repository.findAll();
	}
	
	public User getLoggedinUser() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		if (principal instanceof UserDetails)
			return repository.findByUsername(((UserDetails) principal).getUsername());
		else return null;
	}
	
	public void addUser(User user) {
		repository.save(user);
	}
	
	public void deleteUser(long id) {
		repository.deleteById(id);
	}
}
