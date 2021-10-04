package com.bean.taleem.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bean.taleem.clients.ClientUserService;
import com.bean.taleem.config.JwtTokenUtil;
import com.bean.taleem.model.User;
import com.bean.taleem.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private ClientUserService clientUserService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public String signUp(User user) {
        User dbUser = clientUserService.getByEmail(user.getEmail());
        log.info("sign up----");
        if (dbUser != null) {
            throw new RuntimeException("User already exist.");
        }
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        clientUserService.save(user);
        return jwtTokenUtil.generateToken(user);
    }
}
