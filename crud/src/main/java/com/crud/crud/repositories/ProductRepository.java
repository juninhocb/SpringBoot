package com.crud.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.crud.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
