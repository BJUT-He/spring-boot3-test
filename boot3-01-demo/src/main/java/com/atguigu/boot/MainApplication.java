package com.atguigu.boot;

import com.atguigu.boot.bean.*;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//启动SpringBoot项目的主入口程序
@SpringBootApplication   //这是一个SpringBoot应用
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(MainApplication.class, args);
        // 1.获取容器中所有组件的名字
//        String[] names = ioc.getBeanDefinitionNames();
        // 2.遍历
        // dispatcherServlet、beanNameViewResolver、characterEncodingFilter、multipartResolver
        // SpringBoot把以前配置的核心组件现在都给我们自动配置好了。
//        for (String name : names) {
//            System.out.println(name);
//        }

//        String[] forType = ioc.getBeanNamesForType(User.class);
//        for (String s : forType) {
//            System.out.println(s);
//        }

//        Object user1 = ioc.getBean("user01");
//        Object user2 = ioc.getBean("user01");
//        System.out.println(user1 == user2);

//        SimpleObjectIdResolver bean = ioc.getBean(SimpleObjectIdResolver.class, args);
//        System.out.println(bean);

        String[] type1 = ioc.getBeanNamesForType(Cat.class);
        for (String s : type1) {
            System.out.println("cat: " + s);
        }
        String[] type2 = ioc.getBeanNamesForType(Dog.class);
        for (String s : type2) {
            System.out.println("dog: " + s);
        }
        for (String s : ioc.getBeanNamesForType(User.class)) {
            System.out.println("user: " + s);
        }

        Pig pig = ioc.getBean(Pig.class);
        System.out.println(pig);

        Sheep sheep = ioc.getBean(Sheep.class);
        System.out.println(sheep);

        Person person = ioc.getBean(Person.class);
        System.out.println(person);

    }

}
