package com.cn.shop.service;

import com.cn.shop.entity.User;

import java.util.List;

/**
 * @Description TODO
 * @Author aKuang
 * @@Date 2019/2/1315:13
 **/


public interface LoginService {
    User userLogin(String username, String password);
}
