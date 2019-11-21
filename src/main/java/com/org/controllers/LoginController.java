package com.org.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.models.User;
import com.org.repository.UserRepository;

@RestController
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/")
	public String AngularProject() {
		return "Adding Angular Project with Java Spring boot";
	}
	
	@RequestMapping("/list")
	public List<User> listUsers(){
		return userRepository.findAll();
	}
}
