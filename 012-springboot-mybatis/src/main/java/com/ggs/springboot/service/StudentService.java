package com.ggs.springboot.service;

import com.ggs.springboot.model.Student;
import org.springframework.stereotype.Service;

public interface StudentService {

    /**
     * 根据学生ID查询详情
     *
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);
}
