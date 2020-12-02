package com.ggs.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ggs.springboot.service.StudetnService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    //dubbo:reference interface="" version="" check=false
    @Reference(interfaceClass = StudetnService.class, version = "1.0.0", check = false)
    private StudetnService studetnService;

    @RequestMapping(value = "/student/count")
    @ResponseBody
    public Object studentCount() {

        Integer allStudentCount = studetnService.queryAllStudentCount();

        return "学生总人数为：" + allStudentCount;
    }
}
