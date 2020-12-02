package com.ggs.springboot.service.impl;

import com.ggs.springboot.service.StudetnService;
import org.springframework.stereotype.Service;

@Service
public class StudetnServiceImpl implements StudetnService {
    @Override
    public String sayHello(String msg) {
        return "Say : " + msg;
    }
}
