package com.sudipto.onlineretailstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
	
	

	@GetMapping("/users")
	public String findAll() {
		return "Hi Babun and Sudipto";
	}


}
