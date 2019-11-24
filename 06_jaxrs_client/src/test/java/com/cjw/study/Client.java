package com.cjw.study;

import com.cjw.study.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

/**
 * @Description
 * @auther 程佳伟
 * @create 2019-11-24 23:39
 */
public class Client {

    @Test
    public void testSave(){

        User user = new User();
        user.setId(2);
        user.setUsername("小红");
        user.setCity("北京");

        //通过WebClient进行远程调用
        WebClient
                .create("Http://localhost:8002/ws/userService/user")
                .post(user);
    }
}
