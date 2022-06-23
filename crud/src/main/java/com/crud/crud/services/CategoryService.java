package com.crud.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.crud.crud.repositories.CategoryRepository;
import com.crud.crud.entities.Category;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    
    public List<Category> findAll(){
        List<Category> list = categoryRepository.findAll();
        return list; 
    }

    public Category findById(@PathVariable Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }

}
