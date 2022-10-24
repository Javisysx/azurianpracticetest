package com.javieraduran.practiceTest.services;

import com.javieraduran.practiceTest.models.User;
import com.javieraduran.practiceTest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@Service
public class UserServiceImp implements UserService {
    @Autowired
    @Qualifier("userRepository")
    private UserRepository userRepository;
    @Override
    public List<User> getUsers(int from, int to) {
        return userRepository.getUsers(from, to);
    }
    @Override
    public int getUserCount() {
        return (int) userRepository.count();
    }
}
