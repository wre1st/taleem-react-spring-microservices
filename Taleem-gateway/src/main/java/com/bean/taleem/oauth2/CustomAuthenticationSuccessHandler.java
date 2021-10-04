package com.bean.taleem.oauth2;



import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import com.bean.taleem.clients.ClientUserService;
import com.bean.taleem.config.Constants;
import com.bean.taleem.config.JwtTokenUtil;
import com.bean.taleem.model.User;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CustomAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {


    @Autowired
    private ClientUserService clientUserService;

    
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        log.info("on success");
    	if (response.isCommitted()) {
            return;
        }

    	DefaultOidcUser oidcUser = (DefaultOidcUser) authentication.getPrincipal();
        Map<String, Object> attributes = oidcUser.getAttributes();
        String email = (String) attributes.get("email");
        User user = clientUserService.getByEmail(email);
        String token = jwtTokenUtil.generateToken(user);
        String redirectionUrl = UriComponentsBuilder.fromUriString(Constants.homeUrl)
                .queryParam("auth_token", token)
                .build().toUriString();
        
        log.info("Request:"+request+" Response:"+response+" RedirectionUrl:"+redirectionUrl);
        
        getRedirectStrategy().sendRedirect(request, response, redirectionUrl);
    }

}
