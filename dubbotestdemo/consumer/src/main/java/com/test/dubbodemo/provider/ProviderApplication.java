package com.test.dubbodemo.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.test.dubbodemo.provider.consumer.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubbo
public class ProviderApplication {


    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(ProviderApplication.class, args);
        System.out.println( run.getBean(Consumer.class).saveUser());
    }

}
