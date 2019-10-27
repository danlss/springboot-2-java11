package com.danenterprise.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danenterprise.course.entities.User;

@RestController //sinaliza que é um recurso web implementado por um controlador Rest
@RequestMapping (value = "/Users")  //dando nome ao recurso
public class UserResource {
	
	//metodo pra acessar os usuarios
	@GetMapping //indicaçao que o metodo responde a uma indicação do tipo GET do HTTP
	public ResponseEntity<User> findAll(){
		
		//teste
		User u = new User(1L, "Maria", "maria@gmail.com", "999999999", "12345");
		
		//ok = sucesso no http
		//body = corpo da resposta do usuario u
		return ResponseEntity.ok().body(u);
	}
}
