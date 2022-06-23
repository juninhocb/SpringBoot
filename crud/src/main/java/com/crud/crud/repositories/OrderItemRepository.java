package com.crud.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.crud.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
