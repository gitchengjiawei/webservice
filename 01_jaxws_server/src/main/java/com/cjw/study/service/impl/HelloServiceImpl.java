package com.cjw.study.service.impl;

import com.cjw.study.service.HelloService;

/**
 * @Description
 * @auther 程佳伟
 * @create 2019-11-24 16:02
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return  name + ", Welcome to Tianjin";
    }
}
