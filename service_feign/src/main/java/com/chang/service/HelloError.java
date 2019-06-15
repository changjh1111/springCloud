package com.chang.service;

import org.springframework.stereotype.Component;

/**
 * @Author chang
 * @Date 2019/6/14
 * @Description
 */
@Component
public class HelloError implements HelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
