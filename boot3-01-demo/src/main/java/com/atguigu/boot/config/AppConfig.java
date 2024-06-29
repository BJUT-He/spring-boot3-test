package com.atguigu.boot.config;

import com.atguigu.boot.bean.Sheep;
import com.atguigu.boot.bean.User;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ProblemDetail;

//@SpringBootConfiguration   //这是一个SpringBoot配置类
//@Import(SimpleObjectIdResolver.class)   //给容器中导入指定类型组件，组件的名字默认为全类名

// (一般用于导入第三方写好的组件进行属性绑定)SpringBoot默认只扫描自己主程序所在的包
// 即使组件上标注了@Component等也没用，因为组件扫描不进来
@EnableConfigurationProperties(Sheep.class) //1.开启Sheep组件的属性绑定 2.默认会把这个组件自己放到容器中
@Configuration   //这是一个配置类,替代以前的配置文件，配置类本身也是容器中的组件
public class AppConfig {

    //默认为单实例，使用@Scope("prototype")可改为多实例
    @Scope("prototype")
    @Bean("user01")  //替代以前的ean标签，组件在容器中的名字默认为方法名，可以直接修改注解的值
    public User user() {
        User user = new User();
        user.setAge(20);
        user.setName("张三");
        return user;
    }

    //导入第三方任意对象进入容器
//    @Bean
//    public SimpleObjectIdResolver simpleObjectIdResolver() {
//        return new SimpleObjectIdResolver();
//    }

}
