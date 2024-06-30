package com.atguigu.boot3.features.config;

import com.atguigu.boot3.features.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("test")   // 只有指定环境被激活整个类的所有配置才能生效
@Configuration   //这是一个配置类,给容器中放一个 WebMvcConfigurer 组件，就能自定义底层
public class Myconfig /*implements WebMvcConfigurer*/ {

    @Profile("dev")
    @Bean
    public Cat cat() {
        return new Cat();
    }


}

