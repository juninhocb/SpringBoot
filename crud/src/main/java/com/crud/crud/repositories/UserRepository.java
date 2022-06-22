package com.crud.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
