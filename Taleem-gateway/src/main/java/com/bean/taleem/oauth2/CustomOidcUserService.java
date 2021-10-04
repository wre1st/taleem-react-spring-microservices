package com.bean.taleem.oauth2;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserRequest;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;

import com.bean.taleem.clients.ClientUserService;
import com.bean.taleem.model.GoogleOAuth2UserInfo;
import com.bean.taleem.model.User;
import com.bean.taleem.model.UserType;

@Service
public class CustomOidcUserService extends OidcUserService {

    @Autowired
    private ClientUserService clientUserService;

    @Override
    public OidcUser loadUser(OidcUserRequest userRequest) throws OAuth2AuthenticationException {
        OidcUser oidcUser = super.loadUser(userRequest);
        Map<String, Object> attributes = oidcUser.getAttributes();
        GoogleOAuth2UserInfo userInfo = new GoogleOAuth2UserInfo();
        userInfo.setEmail((String) attributes.get("email"));
        userInfo.setId((String) attributes.get("sub"));
        userInfo.setImageUrl((String) attributes.get("picture"));
        userInfo.setName((String) attributes.get("name"));
        updateUser(userInfo);

        return oidcUser;
    }

    private void updateUser(GoogleOAuth2UserInfo userInfo) {
    	
        User user = clientUserService.getByEmail(userInfo.getEmail());
        if(user == null) {
            user = new User();
        }
        user.setEmail(userInfo.getEmail());
//        user.setImageUrl(userInfo.getImageUrl());
        user.setUsername(userInfo.getName());
        user.setUserType(UserType.google);
        clientUserService.save(user);
    }
}
