package com.locostatmanager.busines.service;

import com.locostatmanager.busines.dao.entities.UserEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by anatoliy on 02.06.14.
 */
public class CustomAuthenticationProvider implements AuthenticationProvider, Serializable {

    private UserAuthManager authManager;

    public void setAuthManager(UserAuthManager authManager) {
        this.authManager = authManager;
    }

    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        try {
            return auth(authentication);
        } catch (DataAccessException e) {
            throw new AuthenticationException("Auth failed!", e) {
            };
        }
    }

    private Authentication auth(Authentication authentication) throws DataAccessException {
        String login = (String) authentication.getPrincipal();
        String pass = (String) authentication.getCredentials();

        UserEntity userEntity = authManager.getUserByLogin(login);
        if (!authManager.checkPassword(userEntity, pass)) {
            throw new AuthenticationException("Password or login invalid!") {
            };
        }

        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(userEntity.getRole());
        List<GrantedAuthority> gal = new ArrayList<GrantedAuthority>();
        gal.add(grantedAuthority);
        return new UsernamePasswordAuthenticationToken(userEntity.getName(), null, gal);
    }

    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }
}
