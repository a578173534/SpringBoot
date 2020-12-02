package com.ggs.springboot.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ggs.springboot.model.Student;
import com.ggs.springboot.service.StudentServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Reference(interfaceName = "com.ggs.springboot.service.StudentServer", version = "1.0.0", check = false)
    private StudentServer studentServer;

    @RequestMapping("/student/detail/{id}")
    public String studentDetail(Model model,
                                @PathVariable("id") Integer id) {

        Student student = studentServer.queryStudentById(id);
        model.addAttribute("student", student);

        return "studentDetail";
    }

    @GetMapping(value = "/student/all/count")
    @ResponseBody
    public Object allStudentCount() {

        Integer allStudentsCount = studentServer.queryAllStudentCount();

        return "学生总人数为：" + allStudentsCount;
    }
}
