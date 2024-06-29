package com.atguigu.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
//    Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/hello")
    public String hello(String a, String b) {

        log.trace("trace 日志.....");
        log.debug("debug 日志.....");
        //SpringBoot底层默认的日志级别 info
        log.info("info 日志..... 参数a:{} b:{}", a, b);
        log.warn("warn 日志...");
        log.error("error 日志...");

//        log.info("哈哈哈哈，方法进来了！");
//        logger.info("哈哈哈哈，方法进来了！");
        return "hello world";
    }

}
