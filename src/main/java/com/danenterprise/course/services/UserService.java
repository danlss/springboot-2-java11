//REGRAS DE NEGOCIO

package com.danenterprise.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danenterprise.course.entities.User;
import com.danenterprise.course.repositories.UserRepository;

//@Component //registra a classe como componente do spring para poder se auto-injetado pelo AutoWired

@Service //registro de serviço 
public class UserService {
	
	@Autowired //injeçao dependencia
	private UserRepository repository;
	
	//retornar todos os usuarios do BD
	public List<User> findAll(){
		return repository.findAll();
	}
	
	//retornar por id
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	/*OPTIONAL
	 proposta deste recurso 
	 é encapsular o retorno de métodos e informar se um valor do tipo <T> 
	 está presente ou ausente.
	 pode pensar em um Optional como uma classe que pode ou não conter um valor não nulo
	 */
}
