package com.cn.shop.service.impl;

import com.cn.shop.dao.UserMapper;
import com.cn.shop.entity.User;
import com.cn.shop.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author aKuang
 * @@Date 2019/2/1316:14
 **/
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    UserMapper userMapper;


    @Override
    public User userLogin(String username, String password) {
        return userMapper.selectByUserNameAndPassword(username, password);
    }
}
