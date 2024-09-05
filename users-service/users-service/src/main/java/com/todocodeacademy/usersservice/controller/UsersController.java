package com.todocodeacademy.usersservice.controller;

import com.todocodeacademy.usersservice.dto.UserDTO;
import com.todocodeacademy.usersservice.model.User;
import com.todocodeacademy.usersservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    public IUserService servUsu;

    @GetMapping("/posts/{user_id}")
    public UserDTO getUserAndPosts (@PathVariable Long user_id) {

        UserDTO user = servUsu.getUserAndPosts(user_id);

        return user;
    }





}
