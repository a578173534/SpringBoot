package com.ggs.springboot.service;

import com.ggs.springboot.model.Student;

public interface StudentServer {

    /**
     * 根据学生ID查询详情
     *
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);

    /**
     * 获取学生总人数
     *
     * @return
     */
    Integer queryAllStudentCount();
}
