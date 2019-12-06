package com.cjw.study.service.impl;

import com.cjw.study.entity.Car;
import com.cjw.study.entity.User;
import com.cjw.study.service.IUserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @auther 程佳伟
 * @create 2019-11-24 21:56
 */
public class IUserServiceImpl implements IUserService {
    @Override
    public void saveUser(User user) {
        System.out.println("save user:" + user);
    }

    @Override
    public void updateUser(User user) {
        System.out.println("update user:" + user);
    }

    @Override
    public List<User> findAllUser() {

        List<User> users = new ArrayList<>();

        User user1 = new User();
        user1.setId(1);
        user1.setUsername("小明");
        user1.setCity("天津");

        List<Car> cars = new ArrayList<>();
        Car car1 = new Car();
        car1.setId(1);
        car1.setCarName("兰博基尼");
        car1.setPrice(5000000000D);

        Car car2 = new Car();
        car2.setId(2);
        car2.setCarName("宾利");
        car2.setPrice(100000000D);

        cars.add(car1);
        cars.add(car2);

        user1.setCars(cars);

        User user2 = new User();
        user2.setId(2);
        user2.setUsername("小红");
        user2.setCity("北京");

        users.add(user1);
        users.add(user2);

        return users;
    }

    @Override
    public User findUserById(Integer id) {

        if (id.equals(1)){
            User user1 = new User();
            user1.setId(1);
            user1.setUsername("小明");
            user1.setCity("天津");
            return user1;
        }
        return null;
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("delete user id:" + id);
    }
}
