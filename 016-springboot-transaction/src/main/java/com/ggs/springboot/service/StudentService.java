package com.ggs.springboot.service;

import com.ggs.springboot.model.Student;

public interface StudentService {

    /**
     * 根据学生ID修改学生信息
     *
     * @param student
     * @return
     */
    int updateStudentById(Student student);
}
