package com.locostatmanager.busines.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author dmitry
 */
@Controller
@RequestMapping(value = "/about.htm")
public class AboutController {

    @RequestMapping(method = RequestMethod.GET)
    public String getPage(Model model) {
        return "about";
    }
}
