package com.ggs.springboot.web;

import com.ggs.springboot.config.Abc;
import com.ggs.springboot.config.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private School school;

    @Autowired
    private Abc abc;

    @RequestMapping(value = "/say")
    @ResponseBody
    public String say() {


        return "school.name=" + school.getName() + "-----school.websit=" + school.getWebsit() + "abc.name=" + abc.getName() + "-----abc.websit=" + abc.getWebsit();
    }
}
