package com.danenterprise.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.danenterprise.course.entities.User;
import com.danenterprise.course.repositories.UserRepository;

//CLASSE DE CONFIGURAÇÃO QUE INSTANCIA O BD

@Configuration //sinaliza ao spring que é uma classe de configuração
@Profile("test") //especificando o perfil
public class TestConfig implements CommandLineRunner {
	//popular o BD
	
	//injection dependence 
	@Autowired //spring associa uma instancia o UserRepository ao TestConfig
	private UserRepository userRepository;

	@Override
	//tudo dentro deste metodo será executado quando a aplicaçao for iniciada
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		//salvar no BD a partir da interface
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
