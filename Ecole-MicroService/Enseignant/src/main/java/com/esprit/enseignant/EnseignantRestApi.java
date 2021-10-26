package com.esprit.enseignant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "client")
public class EnseignantRestApi {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Bonjour";
    }

    @Autowired
    private EnseignantService enseignantService;

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public Enseignant addClient(@RequestBody Enseignant enseignant){
        return enseignantService.addEnseignant(enseignant);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<Enseignant> getAllQuiz(){
        return enseignantService.getAllEnseignant();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/find/{id}")
    public Enseignant getClientById(@PathVariable int id){
        return enseignantService.getEnseignantById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    public void deleteQuiz(@PathVariable int id){
    	enseignantService.deleteEnseignant(id);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
    public Enseignant updateEnseignant(@PathVariable int id, @RequestBody Enseignant c ){
        return enseignantService.updateEnseignant(id, c);
    }
}

