package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;


@RestController
public class UserController {
	
	
	@Autowired
	private UserRepository repository;
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user)
	{
		return repository.save(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteUser(Long id)
	{
		repository.deleteById(id);
	}
	
	@GetMapping("/user")
	public List<User> getUsers(){
		return repository.findAllUsers();
	} 
	

	


}
