package com.crud.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.crud.crud.repositories.OrderRepository;
import com.crud.crud.entities.Order;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(@PathVariable long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
    
}
