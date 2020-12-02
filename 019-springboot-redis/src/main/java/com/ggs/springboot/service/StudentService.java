package com.ggs.springboot.service;

public interface StudentService {

    /**
     * 将值存放到redis中
     *
     * @param key
     * @param value
     */
    void put(String key, String value);

    /**
     * 从redis中获取指定key的值
     *
     * @param key
     * @return
     */
    String get(String key);
}
