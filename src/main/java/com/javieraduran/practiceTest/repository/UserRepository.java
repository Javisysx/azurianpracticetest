package com.javieraduran.practiceTest.repository;

import com.javieraduran.practiceTest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM users LIMIT ?,?", nativeQuery = true)
    List<User> getUsers(int from, int to);
}
