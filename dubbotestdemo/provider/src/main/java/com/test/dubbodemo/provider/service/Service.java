package com.test.dubbodemo.provider.service;

import com.test.dubbodemo.entity.User;
import com.test.dubbodemo.service.UserService;
import org.springframework.stereotype.Component;

@Component
@com.alibaba.dubbo.config.annotation.Service(retries = 1,interfaceClass = UserService.class)
public class Service implements UserService {
    @Override
    public String addUser(User user) {
        return "用户编号:"+user.getId()+",用户名称:"+user.getName();
    }
}
