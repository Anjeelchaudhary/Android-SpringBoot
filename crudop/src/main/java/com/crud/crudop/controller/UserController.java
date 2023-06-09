package com.crud.crudop.controller;

import com.crud.crudop.model.User;
import com.crud.crudop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //User repository he yaha inject karek parat
    @Autowired
    private UserRepository userRepository;

    //kux chaj post karek lak postMapping use huit ie user wants to post something on server side
    @PostMapping("/user")
    //through RequestBody we can inject json file in
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }
}
