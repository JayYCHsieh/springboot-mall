package com.jayyc.springbootmall.dao;

import com.jayyc.springbootmall.dto.UserRegisterRequest;
import com.jayyc.springbootmall.modal.User;

public interface UserDao {

    User getUserById(Integer id);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
