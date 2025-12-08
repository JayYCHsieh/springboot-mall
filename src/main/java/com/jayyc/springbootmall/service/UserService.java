package com.jayyc.springbootmall.service;

import com.jayyc.springbootmall.dto.UserRegisterRequest;
import com.jayyc.springbootmall.modal.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}
