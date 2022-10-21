package com.example.demo.dao;

import com.example.demo.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    User findUserById(long id);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);
}
