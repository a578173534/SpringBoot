package com.ggs.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
public class UserController {

    @RequestMapping("/user/detail")
    @ResponseBody
    public Object userDetail() {

        HashMap<String, Object> retMap = new HashMap<>();
        retMap.put("id", 1001);
        retMap.put("username", "kxf");

        return retMap;
    }

    @RequestMapping(value = "/user/page/detail")
    public String userPageDetail(Model model) {
        model.addAttribute("id", 1001);
        model.addAttribute("username", "kxf");
        return "userDetail";
    }
}
