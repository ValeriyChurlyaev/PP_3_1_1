package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User findUserById(long id);

    void saveUser(User user);

    void updateUser(long id, User user);

    void deleteUser(long id);
}
