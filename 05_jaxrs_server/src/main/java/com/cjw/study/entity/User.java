package com.cjw.study.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @auther 程佳伟
 * @create 2019-11-24 21:49
 */
@Getter
@Setter
@ToString
@XmlRootElement(name="User")
public class User {
    private Integer id;
    private String username;
    private String city;

    private List<Car> cars = new ArrayList<>();
}
