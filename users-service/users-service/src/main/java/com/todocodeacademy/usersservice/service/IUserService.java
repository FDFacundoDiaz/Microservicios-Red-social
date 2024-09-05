package com.todocodeacademy.usersservice.service;


import com.todocodeacademy.usersservice.dto.UserDTO;



public interface IUserService {

    public UserDTO getUserAndPosts(Long user_id);



}
