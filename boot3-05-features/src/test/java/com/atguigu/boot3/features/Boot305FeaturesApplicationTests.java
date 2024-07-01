package com.atguigu.boot3.features;


import com.atguigu.boot3.features.service.HelloService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

// 测试类也必须在主程序所在的包及其子包
@SpringBootTest   // 具备测试SpringBoot应用容器中所有组件的功能
class Boot305FeaturesApplicationTests {

    @Autowired   // 自动注入任意组件即可测试
    HelloService helloService;

    @DisplayName("测试0")
    @Test
    void contextLoads() {
        int sum = helloService.sum(1, 2);
        Assertions.assertEquals(3, sum);
        System.out.println(sum);
        System.out.println("a");
    }

    @DisplayName("测试1")
    @Test
    void test01() {
        System.out.println("test01");
    }

    @DisplayName("😱")
    @Test
    void test02() {
        System.out.println("😱");
    }

    @ParameterizedTest   // 参数化测试
    @ValueSource(strings = {"one", "two", "three"})   // 参数范围
    @DisplayName("参数化测试1")
    public void parameterizedTest1(String string) {
        System.out.println(string);
        Assertions.assertTrue(StringUtils.isNotBlank(string));
    }

    @ParameterizedTest
    @MethodSource("method")    //指定方法名, 方法返回值就是测试用的参数
    @DisplayName("方法来源参数")
    public void testWithExplicitLocalMethodSource(String name) {
        System.out.println(name);
        Assertions.assertNotNull(name);
    }
    //由于方法method有可能返回多个值, 需要使用StreamAPI返回一个stream
    static Stream<String> method() {
        return Stream.of("apple", "banana");
    }

    @BeforeAll   // 所有测试方法运行之前先运行这个 : 只打印一次
    static void initAll() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
        // 每个测试方法运行之前先运行这个 : 每个方法运行打印一次
    void init() {
        System.out.println("BeforeEach");
    }

}
