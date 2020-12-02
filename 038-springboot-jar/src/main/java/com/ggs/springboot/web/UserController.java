package com.ggs.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {

    @RequestMapping(value = "/user/json/detail")
    @ResponseBody
    public Object userJsonDetail() {
        Map<String, Object> retMap = new HashMap<>();
        retMap.put("id", 1001);
        retMap.put("username", "kxf");

        return retMap;
    }

    @RequestMapping(value = "/user/page/detail")
    public String userPageDetail(Model model) {
        model.addAttribute("id", 1002);
        model.addAttribute("username", "kxf");
        return "userDetail";
    }
}
