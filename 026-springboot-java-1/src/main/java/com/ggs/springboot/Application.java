package com.ggs.springboot;

import com.ggs.springboot.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        /**
         * Springboot程序启动后,返回值是ConfigurableApplicationContext,它也是一个Spring容器
         * 它其实相当于原来Spring容器中启动容器ClasspathXmlApplicationContext
         */

        //获取Springboot容器
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        //从spring容器中获取指定bean对象
        StudentService studentService = (StudentService) applicationContext.getBean("studentServiceImpl");

        //调用业务方法
        String sayHello = studentService.sayHello();

        System.out.println(sayHello);
    }

}
