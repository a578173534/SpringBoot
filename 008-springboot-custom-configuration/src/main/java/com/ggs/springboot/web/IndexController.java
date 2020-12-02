package com.ggs.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Value("${school.name}")
    private String schoolName;

    @Value("${websit}")
    private String websit;

    @RequestMapping(value = "/say")
    @ResponseBody
    public String say() {
        return "Hello:" + schoolName + ":" + websit;
    }
}
