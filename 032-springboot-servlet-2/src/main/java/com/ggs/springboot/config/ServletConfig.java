package com.ggs.springboot.config;

import com.ggs.springboot.servlet.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //该注解将此类定义为配置类(相当一个xml配置文件)
public class ServletConfig {

    @Bean
    public ServletRegistrationBean myServletRegistrationBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new MyServlet(), "/myservlet");

        return servletRegistrationBean;
    }
}
