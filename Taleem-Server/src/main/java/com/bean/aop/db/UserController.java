package com.bean.aop.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.bean.aop.db.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

//	@Autowired
//	WebClient webClient;
	
	@PostMapping("/save")
	public void save(User user) {
//		System.out.println(webClient.get().uri("http://localhost:8081").accept(MediaType.APPLICATION_JSON).retrieve());
	}
}