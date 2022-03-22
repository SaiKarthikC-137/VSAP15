package com.vsap.fantasydress;

import java.util.List;

import com.vsap.fantasydress.models.UserModel;
import com.vsap.fantasydress.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class Controller {
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String home()
	{
		String str= "home";
		return str;
	}

	@PostMapping(value="/add")
	public void addUser(@RequestBody UserModel user) {
		userService.addUser(user);
		
	}

	@GetMapping(value="/all")
	public List<UserModel> getAllUsers() {
		return userService.getAllUsers();
	}
	
	
}