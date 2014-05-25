package com.locostatmanager.busines.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by anatoliy on 25.05.14.
 */
@Controller
public class LoginController {

    @RequestMapping("/login.htm")
    public String getLoginForm(){
        return "login";
    }
}
