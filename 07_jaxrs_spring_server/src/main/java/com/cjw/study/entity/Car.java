package com.cjw.study.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Description
 * @auther 程佳伟
 * @create 2019-11-24 21:49
 */
@Getter
@Setter
@ToString
@XmlRootElement(name="Car")
public class Car {
    private Integer id;
    private String carName;
    private Double price;
}
