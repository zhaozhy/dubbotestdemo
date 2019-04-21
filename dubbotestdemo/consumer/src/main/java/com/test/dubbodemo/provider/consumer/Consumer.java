package com.test.dubbodemo.provider.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.test.dubbodemo.entity.User;
import com.test.dubbodemo.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @Reference
    UserService userService;


    public String saveUser(){
        User u=new User();
        u.setId(12345l);
        u.setName("nimeidfsa");
        String s=userService.addUser(u);
        System.out.println(s);
        return  s;
    }
}
