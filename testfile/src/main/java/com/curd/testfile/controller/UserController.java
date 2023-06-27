package com.curd.testfile.controller;

import com.curd.testfile.entity.User;
import com.curd.testfile.repo.UserRepository;
import com.curd.testfile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("")
public class UserController {
    @Autowired
    public UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/findall")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User user = userService.getUserById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        }else  {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/update/{id}")
    public  ResponseEntity<User> updateUser(@PathVariable Long id , @RequestBody User user) {
        User existUser = userService.updateUserById(id,user);
        if (existUser != null) {
            return ResponseEntity.ok(existUser);
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
