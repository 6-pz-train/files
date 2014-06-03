package com.locostatmanager.busines.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by anatoliy on 02.06.14.
 * Так и не полял на кой оно нужно, но секьюрити упорно требует этот класс, хотя он в обработке участия не принимает
 */
public class CustomUserDetailsService implements UserDetailsService {
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
