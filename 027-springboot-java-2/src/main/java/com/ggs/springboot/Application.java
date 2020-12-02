package com.ggs.springboot;

import com.ggs.springboot.service.StudetnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //开启spring配置
public class Application implements CommandLineRunner {

    @Autowired
    private StudetnService studetnService;

    public static void main(String[] args) {
        //SpringBoot启动程序,会初始化Spring容器
        SpringApplication.run(Application.class, args);
    }

    //重写CommandLineRunner类中的run方法
    @Override
    public void run(String... args) throws Exception {

        //调用业务方法
        String sayHello = studetnService.sayHello("World");

        System.out.println(sayHello);
    }
}
