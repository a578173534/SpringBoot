package com.ggs.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ggs.springboot.mapper.StudentMapper;
import com.ggs.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
@Service(interfaceName = "com.ggs.springboot.service.StudentServer", version = "1.0.0", timeout = 15000)
public class StudentServerImpl implements StudentServer {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer queryAllStudentCount() {

        //提升系统性能,用户体验提升
        //首先去redis缓存中查询,如果有:直接使用,如果没有:去数据库查询并存放到redis缓存中
        Integer allStudentCount = (Integer) redisTemplate.opsForValue().get("allStudentCount");

        //判断是否有值
        if (allStudentCount == null) {
            //去数据库查询
            allStudentCount = studentMapper.selectAllStudentCount();

            //并存放到redis缓存中
            redisTemplate.opsForValue().set("allStudentCount", allStudentCount, 30, TimeUnit.SECONDS);
        }

        return allStudentCount;
    }
}
