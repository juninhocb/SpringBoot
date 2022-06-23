package com.crud.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.crud.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
