package com.danenterprise.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danenterprise.course.entities.User;

//implementa um objeto repository que terá varias interaçoes com o user
public interface UserRepository extends JpaRepository<User, Long>{
	
}
