package com.atguigu.boot3.features.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${haha:aaaa}")
    String haha;

    @GetMapping("/haha")
    public String haha() {
        return haha;
    }

}
