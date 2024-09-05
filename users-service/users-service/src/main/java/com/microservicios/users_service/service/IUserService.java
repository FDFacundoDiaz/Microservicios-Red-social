package com.microservicios.users_service.service;

import com.microservicios.users_service.dto.UserDTO;

public interface IUserService {

   public UserDTO getUserAndPosts (Long user_id);

}
