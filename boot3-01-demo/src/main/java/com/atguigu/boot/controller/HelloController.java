package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody   //给浏览器返回纯文本或json数据
//@Controller
@RestController
public class HelloController {

    @GetMapping("/hello")    //处理浏览器的hello请求
    public String Hello() {
        return "Hello World";
    }

}
