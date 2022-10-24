package com.javieraduran.practiceTest.services;

import com.javieraduran.practiceTest.models.User;

import java.util.List;

public interface UserService {

    List<User> getUsers(int from, int to);
    int getUserCount();
}
