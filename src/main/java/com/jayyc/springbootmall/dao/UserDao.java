package com.jayyc.springbootmall.dao;

import com.jayyc.springbootmall.dto.UserRegisterRequest;
import com.jayyc.springbootmall.modal.User;

public interface UserDao {

    User getUserById(Integer id);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
