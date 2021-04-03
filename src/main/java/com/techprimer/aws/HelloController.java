package com.techprimer.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class HelloController {
	
	@GetMapping
	public String hello(){
		return "Hello, Welcome to Code Pipeline";
	}
}
