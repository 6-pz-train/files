package com.diit.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Дмитрий
 */
@Controller
public class MainController {
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String onHello() {
        return "Hello";
    }
}
