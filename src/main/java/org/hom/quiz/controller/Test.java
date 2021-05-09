package org.hom.quiz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/test")
public class Test {

	
	

	@GetMapping("/ping")
	public String ping() {
		return "Pong";
	}

	
}
