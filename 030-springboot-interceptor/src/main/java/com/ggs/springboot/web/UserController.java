package com.ggs.springboot.web;

import com.ggs.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    //用户登录的请求,需要排除
    @RequestMapping(value = "/login")
    @ResponseBody
    public Object login(HttpServletRequest request) {
        //将用户的信息存放到session中
        User user = new User();
        user.setId(1001);
        user.setUsername("kxf");
        request.getSession().setAttribute("user", user);

        return "login SUCCESS";
    }

    //该请求需要用户登录之后才可访问
    @RequestMapping(value = "/center")
    @ResponseBody
    public Object center() {
        return "See Center Message";
    }

    //该请求不登录也可访问
    @RequestMapping(value = "/out")
    @ResponseBody
    public Object out() {
        return "Out see anytime";
    }

    //如果用户未登录访问了需要登录才可访问的请求,之后会跳转至该请求路径
    //该请求路径不需要用户登录也可访问
    @RequestMapping(value = "/error")
    @ResponseBody
    public Object error() {
        return "error";
    }
}
