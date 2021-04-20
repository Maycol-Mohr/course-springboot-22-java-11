package com.educandoweb.course100.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course100.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
