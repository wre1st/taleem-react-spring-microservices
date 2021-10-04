package com.bean.taleem.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.taleem.model.User;

@FeignClient(value = "dbservice", url = "http://localhost:1767")
public interface ClientUserService {
	
	@GetMapping("/users/user/{email}")
	User getByEmail(@PathVariable String pathVariable);


	@PostMapping("/users/user")
	String save(User user);


}