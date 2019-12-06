package com.cjw.study;

import com.cjw.study.service.impl.IUserServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import java.sql.SQLOutput;

/**
 * @Description
 * @auther 程佳伟
 * @create 2019-11-24 22:15
 */
public class Server {

    public static void main(String[] args) {

        //创建发布服务的工厂
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();

        //设置服务地址
        factory.setAddress("http://localhost:8002/ws/");

        //设置服务类
        factory.setServiceBean(new IUserServiceImpl());

        //添加日志输入输出拦截器
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        //发布服务
        factory.create();

        System.out.println("发布服务成功，服务端口为：8002");
    }
}
