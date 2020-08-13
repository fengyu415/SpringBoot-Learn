package com.feng;

import com.feng.pojo.Dog;
import com.feng.pojo.Person;
import com.feng.pojo.Person1;
import com.feng.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02YamlApplicationTests {
    @Autowired
    Dog dog;
    @Test
    void contextLoads() {
        System.out.println(dog);
    }

    @Autowired
    Person person; //将person自动注入进来

    @Test
    public void testperson() {
        System.out.println(person); //打印person信息
    }

    @Autowired
    Person1 person1; //将person自动注入进来

    @Test
    public void testperson1() {
        System.out.println(person1); //打印person信息
    }

    @Autowired
    User user; //将person自动注入进来

    @Test
    public void testuser() {
        System.out.println(user);
    }
}
