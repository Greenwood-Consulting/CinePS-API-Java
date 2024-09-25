package com.greenwood.cineps_api_java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.*;


class HelloControllerTest {

    @Test
    public void testHello(){
        var helloService = new HelloService();
        var helloController = new HelloController(helloService);
        Assertions.assertEquals("Hello Wolrd 2", helloController.hello());
    }
}