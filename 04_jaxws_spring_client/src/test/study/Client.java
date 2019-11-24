package com.cjw.study;

import com.cjw.study.service.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @Description
 * @auther 程佳伟
 * @create 2019-11-24 16:16
 */
public class Client {

    public static void main(String[] args) {
        //服务接口访问地址：http://localhost:8000/ws/hello

        //创建cfx代理工厂
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        //设置服务地址
        factory.setAddress("http://localhost:8000/ws/hello");

        //设置接口类型
        factory.setServiceClass(HelloService.class);

        //对接口生成代理对象
        HelloService helloService = factory.create(HelloService.class);

        System.out.println(helloService.getClass());

        //远程访问服务端方法
        String content = helloService.sayHello("cjw");

        System.out.println(content);
    }
}
