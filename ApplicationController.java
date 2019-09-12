package com.demo;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	@RequestMapping("")
	public String homes() {
		return "404 Page Not Found";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "Hello World!!";
	}
	
	
	@RequestMapping("/users")
	public List<UserDetails> getCustomListDetails(){
		return UserDetails.customList;
	}
}
