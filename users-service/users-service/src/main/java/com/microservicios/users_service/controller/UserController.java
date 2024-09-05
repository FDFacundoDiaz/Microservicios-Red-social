package com.microservicios.users_service.controller;


import com.microservicios.users_service.dto.UserDTO;
import com.microservicios.users_service.model.User;
import com.microservicios.users_service.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    public IUserService servUsu;

    @GetMapping("/posts/{user_id}")
    public UserDTO getUserAndPosts (@PathVariable Long user_id) {

        UserDTO user = servUsu.getUserAndPosts(user_id);

        return user;

    }




}
