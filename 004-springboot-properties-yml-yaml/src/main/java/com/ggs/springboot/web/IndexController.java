package com.ggs.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping(value = "/say")
    @ResponseBody
    public Object say(String message) {

        return "Say:Hello " + message;
    }
}
