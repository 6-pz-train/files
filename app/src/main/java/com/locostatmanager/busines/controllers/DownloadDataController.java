package com.locostatmanager.busines.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author dmitry
 */
@Controller()
@RequestMapping(value = "/downloadData.htm")
public class DownloadDataController {

    @RequestMapping(method = RequestMethod.GET)
    public String getPage(Model model) {
        return "downloadData";
    }
    
    //TODO put smth in model ;)
}
