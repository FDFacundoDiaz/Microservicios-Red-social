package com.todocodeacademy.usersservice.service;

import com.todocodeacademy.usersservice.dto.PostDTO;
import com.todocodeacademy.usersservice.dto.UserDTO;
import com.todocodeacademy.usersservice.model.User;
import com.todocodeacademy.usersservice.repository.IPostsAPI;
import com.todocodeacademy.usersservice.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository userRepo;

    @Autowired
    private IPostsAPI apiPosts;

    @Override
    public UserDTO getUserAndPosts(Long user_id) {

        //Usuario de la BD
        User user = userRepo.findById(user_id).orElse(null);

        //A partir de la ID busco los posts de este usuario
        List<PostDTO> postsList = apiPosts.getPostsByUserId(user_id);

        //Asigno los posts al DTO de usuarios
        UserDTO userDTO = new UserDTO(user.getUser_id(), user.getName(), user.getLastname(), user.getCellphone(), postsList);

        //Devuelvo el usuario
        return userDTO;
    }


}
