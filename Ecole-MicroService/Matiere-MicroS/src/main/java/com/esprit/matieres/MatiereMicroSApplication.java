package com.esprit.matieres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class MatiereMicroSApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatiereMicroSApplication.class, args);
	}

	@Autowired
	private MatiereRepository repository;
	
	@Bean
	ApplicationRunner init() {
		return (args) -> {
			// save
			repository.save(new Matiere("Math", 1, 2,1));
			repository.save(new Matiere("Philo", 1,4,4));
			repository.save(new Matiere("Géo", 1,3,2));
			// fetch
			repository.findAll().forEach(System.out::println);

		};
	}

}
