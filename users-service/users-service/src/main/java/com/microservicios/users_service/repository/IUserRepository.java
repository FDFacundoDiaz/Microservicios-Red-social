package com.microservicios.users_service.repository;

import com.microservicios.users_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository  <User, Long> {
}
