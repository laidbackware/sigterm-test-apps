package com.example.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot + Tanzu!";
	}

	@RequestMapping("/sleep")
	public String sleeper() throws InterruptedException{
		Thread.sleep(20000);
		return "Greetings from Spring Boot + Tanzu!";
	}

}