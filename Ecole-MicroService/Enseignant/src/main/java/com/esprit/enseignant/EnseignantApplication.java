package com.esprit.enseignant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class EnseignantApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnseignantApplication.class, args);
	}

	@Autowired
	private EnseignantRepository  repository;
	
	@Bean
	ApplicationRunner init() {
		return (args) -> {
			// save
			repository.save(new Enseignant("ens1","math" ,"Tn"));
			repository.save(new Enseignant("ens2","physique","Tn"));
			repository.save(new Enseignant("ens3","c++","Tn"));
			// fetch
			repository.findAll().forEach(System.out::println);

		};
	}

}