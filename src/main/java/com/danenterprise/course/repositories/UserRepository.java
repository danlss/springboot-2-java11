package com.danenterprise.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danenterprise.course.entities.User;

//implementa um objeto repository que terá varias interaçoes com o user
//@Repository //registro opcional pois a interface já herda a anotação da JpaRepository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
