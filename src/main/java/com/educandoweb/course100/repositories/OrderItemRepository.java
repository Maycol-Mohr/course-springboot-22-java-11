package com.educandoweb.course100.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course100.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
