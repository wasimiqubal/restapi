package com.iqubal.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class HelloWorld {
	
	@GetMapping("/hello")
	
	public String helloWorld() {
		
		return " Hello World Jenkins Testing";
	}

}
