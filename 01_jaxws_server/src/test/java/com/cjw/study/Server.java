package com.cjw.study;

import com.cjw.study.service.impl.HelloServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * @Description
 * @auther 程佳伟
 * @create 2019-11-24 16:04
 */
public class Server {

    public static void main(String[] args) {
        //发布服务的工厂
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();

        //设置服务地址
        factory.setAddress("http://localhost:8000/ws/hello");

        //设置服务类
        factory.setServiceBean(new HelloServiceImpl());

        //添加日志输入输出拦截器，观察 soap请求和相应的内容
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        //发布服务
        factory.create();

        //提示
        System.out.println("发布服务成功，端口号为：8000");
    }
}
