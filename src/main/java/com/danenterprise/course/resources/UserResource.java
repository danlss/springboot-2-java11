//CONTROLADOR REST
package com.danenterprise.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danenterprise.course.entities.User;
import com.danenterprise.course.services.UserService;

@RestController //sinaliza que é um recurso web implementado por um controlador Rest
@RequestMapping (value = "/users")  //dando nome ao recurso
public class UserResource {
	
	@Autowired //injeção dependencia spring
	private UserService service;
	
	//metodo pra acessar os usuarios
	@GetMapping //indicaçao que o metodo responde a uma indicação do tipo GET do HTTP
	public ResponseEntity<List<User>> findAll(){
		
		//teste
		List<User> list = service.findAll();
		
		//ok = sucesso no http
		//body = lista no corpo da requisição 
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}") //indica que a requisição aceitará um id na URL
	//@PathVariable = spring aceita parametro para URL
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
