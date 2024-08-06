package com.example.fullstack_springboot_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.fullstack_springboot_backend.model.User;
import com.example.fullstack_springboot_backend.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/getallusers")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping("/createuser")
	public User createUser(@RequestBody User createUser) {
		return userRepository.save(createUser);
	}
}
