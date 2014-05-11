package com.locostatmanager.busines.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author dmitry
 */
@RequestMapping(value = "/about.html")
public class AboutController {
    
    public String getPage(Model model) {
        return "about";
    }
    
        //TODO put smth in model ;)
}
