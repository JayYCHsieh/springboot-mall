package com.jayyc.springbootmall.service.impl;

import com.jayyc.springbootmall.dao.UserDao;
import com.jayyc.springbootmall.dto.UserRegisterRequest;
import com.jayyc.springbootmall.modal.User;
import com.jayyc.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
