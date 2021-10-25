package com.esprit.matieres;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatiereRestAPI {
	
	
	
		
private String title="ayoub saddi";

@RequestMapping("/hello")
	public String SayHello() {
		System.out.println(title);
		
		return title;
	} 
}
