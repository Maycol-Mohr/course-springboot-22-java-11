package com.educandoweb.course100.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course100.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
