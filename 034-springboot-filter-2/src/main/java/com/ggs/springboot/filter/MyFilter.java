package com.ggs.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("-------------------您已进入过滤器-222-------------------");

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
