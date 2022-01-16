package com.harshsengar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/greet")
	public String sayHelloWorld() {
		return "Hello World";
	}

}