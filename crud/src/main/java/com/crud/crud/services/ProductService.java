package com.crud.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.crud.crud.entities.Product;
import com.crud.crud.repositories.ProductRepository;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAlll(){
        List<Product> list = productRepository.findAll();
        return list;
    }

    public Product findByIdd(@PathVariable Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
    
}
