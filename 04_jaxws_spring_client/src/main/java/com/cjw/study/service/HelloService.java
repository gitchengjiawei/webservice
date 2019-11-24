package com.cjw.study.service;

import javax.jws.WebService;

/**
 * @Description 对外发布服务的接口
 * @auther 程佳伟
 * @create 2019-11-24 16:00
 */
@WebService
public interface HelloService {

    /**
     * 对外发布服务的方法
     */
    public String sayHello(String name);
}
