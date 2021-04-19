package com.educandoweb.course100.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course100.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
