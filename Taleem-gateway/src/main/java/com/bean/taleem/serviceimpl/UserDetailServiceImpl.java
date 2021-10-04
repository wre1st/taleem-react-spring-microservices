package com.bean.taleem.serviceimpl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bean.taleem.clients.ClientUserService;
import com.bean.taleem.model.User;

import lombok.extern.slf4j.Slf4j;

@Service(value = "userDetailsService")
@Slf4j
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private ClientUserService clientUserService;

    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = clientUserService.getByEmail(email);
        log.info("loadUserByUsername===>"+user);
               if(user == null){
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), getAuthority());
    }

    private List<SimpleGrantedAuthority> getAuthority() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }
}
