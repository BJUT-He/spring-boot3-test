package com.atguigu.boot3.features.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class Child {
    private String name;
    private int age;
    private Date birthday;
    private List<String> text;
}
