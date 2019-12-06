package com.cjw.study.service;

import com.cjw.study.entity.User;

import javax.ws.rs.*;
import java.util.List;

/**
 * @Description
 * @auther 程佳伟
 * @create 2019-11-24 21:55
 */
//@Path("/userService")
@Produces("*/*")
public interface IUserService {

    @POST
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public void saveUser(User user);

    @PUT
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public void updateUser(User user);

    @GET
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public List<User> findAllUser();

    @GET
    @Path("/user/{id}")
    @Consumes({"application/xml","application/json"})
    public User findUserById(@PathParam("id") Integer id);

    @DELETE
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public void deleteUser(Integer id);
}
