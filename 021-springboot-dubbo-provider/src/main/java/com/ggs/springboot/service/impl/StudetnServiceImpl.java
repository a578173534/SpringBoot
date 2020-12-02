package com.ggs.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ggs.springboot.service.StudetnService;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = StudetnService.class, version = "1.0.0", timeout = 15000)
//dubbo:service interface="" version="" timeout=""
public class StudetnServiceImpl implements StudetnService {
    @Override
    public Integer queryAllStudentCount() {

        //调用数据持久层

        return 1250;
    }
}
