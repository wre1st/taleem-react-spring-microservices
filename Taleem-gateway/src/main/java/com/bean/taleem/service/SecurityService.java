package com.bean.taleem.service;

import org.springframework.stereotype.Service;

import com.bean.taleem.model.User;

@Service
public interface SecurityService {
    
	    String findLoggedInEmail();
	    User findCurrentLoggedInUser();

}