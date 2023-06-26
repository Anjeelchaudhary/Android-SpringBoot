package com.curd.testfile.service;

import com.curd.testfile.entity.User;
import com.curd.testfile.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
}
