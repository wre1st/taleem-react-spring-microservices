package com.bean.taleem.model;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

	private Integer userId;
	private String username;
	private String password;
	private String email;
	private String contact;
	private String address;
    private UserType userType;


}