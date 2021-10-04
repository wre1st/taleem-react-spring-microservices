package com.bean.taleem.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.bean.taleem.clients.ClientUserService;
import com.bean.taleem.config.Constants;
import com.bean.taleem.model.User;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/auth")
@Slf4j
public class AuthController {

    @Autowired
    private ClientUserService clientUserService;

    @GetMapping("/custom-login")
    public String loadLoginPage(){
    	   log.info("================ login ==========");
    	return "login";
    }

    @PostMapping("/signup")
    public String login(@ModelAttribute("signup") User user){
        String token = clientUserService.save(user);
        log.info("================ Hitting login =========="+token);
        return UriComponentsBuilder.fromUriString(Constants.homeUrl)
                .queryParam("auth_token", token)
                .build().toUriString();
    }

    
   

    
}
