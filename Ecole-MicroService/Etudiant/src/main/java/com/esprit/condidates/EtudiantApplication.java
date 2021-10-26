package com.esprit.condidates;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class EtudiantApplication {

	public static void main(String[] args) {
		SpringApplication.run(EtudiantApplication.class, args);
	}

	@Autowired
	private EtudiantRepository  repository;
	
	@Bean
	ApplicationRunner init() {
		return (args) -> {
			// save
			repository.save(new Etudiant("etudiant1","5twin" ,"Tn"));
			repository.save(new Etudiant("etudiant2","5sim","Tn"));
			repository.save(new Etudiant("etudiant3","5BI","Tn"));
			// fetch
			repository.findAll().forEach(System.out::println);

		};
	}

}