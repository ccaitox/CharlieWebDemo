package com.charlie.service;

import com.charlie.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUsers(Integer userId);
}
