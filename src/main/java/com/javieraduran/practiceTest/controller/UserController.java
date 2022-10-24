package com.javieraduran.practiceTest.controller;

import com.javieraduran.practiceTest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/api/users")
    public ResponseEntity<Object> getUsers(@RequestParam(defaultValue = "1") int pageNumber){
        int number = (int)Math.ceil(userService.getUserCount() / 5f);
        if (pageNumber > number || pageNumber < 1){
            return new ResponseEntity<>("Invalid page number: " + pageNumber, HttpStatus.BAD_REQUEST);
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("users", userService.getUsers(pageNumber * 5 - 5, 5));
        List<Integer> pages = new ArrayList<>();
        for (int i = 0; i < number; i++){
            pages.add(i + 1);
        }
        hashMap.put("available_pages", pages);

        return new ResponseEntity<>(hashMap, HttpStatus.ACCEPTED);
    }
}
