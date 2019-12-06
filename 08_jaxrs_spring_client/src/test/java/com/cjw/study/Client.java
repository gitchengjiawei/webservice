package com.cjw.study;

import com.cjw.study.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

        Collection<? extends User> users = WebClient
                .create("Http://localhost:8003/ws/userService/user")
                .type(MediaType.APPLICATION_JSON)
//                .post(user);
//                .put(user);
//                .get(User.class);
                .getCollection(User.class);

//        System.out.println(user1);
        for (User u : users){
            System.out.println(u);
        }
    }
}
