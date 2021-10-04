package com.bean.taleem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class GatewayController {

	@GetMapping("/dbFallback")
	public String dbFallBackMethod() {
		return "Database has some issues";
	}

	@GetMapping("/clientFallback")
	public String clientFallBack() {
		return "Database has some issues";
	}
	
	 @GetMapping("/logout")
	 public String logout(){
	        return "logout";
	 }
}