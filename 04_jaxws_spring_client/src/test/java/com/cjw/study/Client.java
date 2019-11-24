package com.cjw.study;

import com.cjw.study.service.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Description
 * @auther 程佳伟
 * @create 2019-11-24 16:16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Client {

    //注入对象
    @Resource
    private HelloService helloService;

    @Test
    public void remote(){
        System.out.println(helloService.getClass());

        //远程访问服务端方法
        System.out.println(helloService.sayHello("cjw"));
    }
}
