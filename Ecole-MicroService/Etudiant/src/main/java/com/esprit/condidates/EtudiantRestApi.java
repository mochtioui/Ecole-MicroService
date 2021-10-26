package com.esprit.condidates;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "client")
public class EtudiantRestApi {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Bonjour";
    }

    @Autowired
    private EtudiantService etudiantService;

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public Etudiant addClient(@RequestBody Etudiant etudiant){
        return etudiantService.addEtudiant(etudiant);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<Etudiant> getAllQuiz(){
        return etudiantService.getAllEtudiant();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/find/{id}")
    public Etudiant getClientById(@PathVariable int id){
        return etudiantService.getEtudiantById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    public void deleteQuiz(@PathVariable int id){
    	etudiantService.deleteEtudiant(id);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
    public Etudiant updateEtudiant(@PathVariable int id, @RequestBody Etudiant c ){
        return etudiantService.updateEtudiant(id, c);
    }
}

