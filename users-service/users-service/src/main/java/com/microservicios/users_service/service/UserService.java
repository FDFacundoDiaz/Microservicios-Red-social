package com.microservicios.users_service.service;

import com.microservicios.users_service.dto.PostDTO;
import com.microservicios.users_service.dto.UserDTO;
import com.microservicios.users_service.model.User;
import com.microservicios.users_service.repository.IPostAPI;
import com.microservicios.users_service.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    public IUserRepository userRepo;
    @Autowired
    public IPostAPI postApi;

    @Override
    public UserDTO getUserAndPosts(Long user_id) {
        //Datos del Usuario de la BD
        User user = userRepo.findById(user_id).orElse(null);

        //Una vez obtenido los datos, necesito los posteos:
        //A partir de la id, traigo los posteos desde la API de Posteos
        List<PostDTO> postList = postApi.getPostsByUserId(user_id);
        //Unificar datos del usuario + posteos (mediante UserDTO)
        UserDTO userDTO = new UserDTO(user.getUser_id(), user.getName(), user.getLastname(),
                                       user.getCellphone(), postList);

         return userDTO;
    }
}
