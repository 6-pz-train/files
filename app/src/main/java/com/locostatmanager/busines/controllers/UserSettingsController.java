package com.locostatmanager.busines.controllers;

import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author dmitry
 */
@Controller
@RequestMapping("/userSettings.htm")
public class UserSettingsController {

    @RequestMapping(method = RequestMethod.GET)
    public String getPage(Model model) {

        return "userSettings";
    }
    @ModelAttribute("userName")
    public String getUserName(UsernamePasswordAuthenticationToken token){
        return token.getName();
    }
}
