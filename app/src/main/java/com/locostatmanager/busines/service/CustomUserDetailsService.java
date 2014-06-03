package com.locostatmanager.busines.service;

import com.locostatmanager.busines.dao.entities.UserEntity;
import com.locostatmanager.busines.exceptions.DataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;

/**
 * Created by anatoliy on 02.06.14.
 */
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    @Qualifier("userAuthManager")
    private UserAuthManager authManager;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            UserEntity userEntity = authManager.getUserByLogin(username);
            if (userEntity != null) {
                return new User(username, userEntity.getPassword(), null);
            }
            throw new UsernameNotFoundException("User not found");
        } catch (DataAccessException e) {
            throw new UsernameNotFoundException("User not found", e);
        }

    }
}
