package com.bean.taleem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.taleem.clients.ClientBundleService;
import com.bean.taleem.entity.Bundle;
import com.bean.taleem.entity.User;
import com.bean.taleem.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	ClientBundleService clientBundleService;
	
	@GetMapping("/user/{userId}")
	public User getUser(@PathVariable("userId") String userId) {
		log.info("getting user from db service "+userId);
		User user=userService.getById(Integer.parseInt(userId));
		return user;
	}

	@PostMapping("/save")
	public void saveUser(@RequestBody User user) {
		log.info("Saving user from db service");
		userService.save(user);
	}

	
	@GetMapping("/bundles/{bundleId}")
	public Bundle getSubscribedUsers(@PathVariable("bundleId") String bundleId) {
		log.info("getting bundle from db service "+bundleId);
		Bundle bundle =clientBundleService.bundle(bundleId);
		return bundle;
	}
}