package com.springboot.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/simple")
public class SimpleRestController {
	
	@GetMapping
	public String simpleRestGetMapping() {
		return "Simple Spring Boot Application";
	}

}
