package com.crud.crud.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.crud.entities.User;


@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity <User> findAll(){
        User user = new User(1L, "Carla", "carlaskas@gmail.com", "(47)99992222", "123");
        return ResponseEntity.ok().body(user);

    }

}
