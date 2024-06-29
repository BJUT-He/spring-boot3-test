package com.atguigu.boot3.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



//启动SpringBoot项目的主入口程序
@SpringBootApplication   //这是一个SpringBoot应用
/**
 * 1、@MapperScan【批量扫描注解】； 告诉MyBatis，扫描哪个包下面的所有接口
 * 2、使用mybatis.mapper-locations，告诉MyBatis，每个接口的xml文件都在哪里
 * 3、MyBatis自动关联绑定。
 */
@MapperScan(basePackages = "com.atguigu.boot3.ssm.mapper")
public class Boot304SsmApplication {
    public static void main(String[] args) {
        SpringApplication.run(Boot304SsmApplication.class, args);
    }

}

