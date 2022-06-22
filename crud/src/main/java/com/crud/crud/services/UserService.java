package com.crud.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.crud.crud.entities.User;
import com.crud.crud.repositories.UserRepository;


@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(@PathVariable Long id){
        Optional <User> obj = repository.findById(id);
        return obj.get();
    }


}