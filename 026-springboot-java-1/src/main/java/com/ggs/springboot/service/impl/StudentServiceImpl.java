package com.ggs.springboot.service.impl;

import com.ggs.springboot.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public String sayHello() {
        return "say Hello";
    }
}
