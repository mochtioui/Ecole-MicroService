package com.esprit.enseignant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnseignantService {

    @Autowired
    private EnseignantRepository enseignantRepository;

    public Enseignant addEnseignant(Enseignant client) {
        return enseignantRepository.save(client);
    }

    public Enseignant updateEnseignant(int id, Enseignant enseignant){
    	Enseignant c = enseignantRepository.findById(id).orElse(null);
        c.setAdress(enseignant.getAdress());
        c.setType(enseignant.getType());
        enseignantRepository.save(c);
        return c;
    }

    public void deleteEnseignant(int id){
        enseignantRepository.deleteById(id);
    }

    public List<Enseignant> getAllEnseignant(){
        return enseignantRepository.findAll();

    }

    public Enseignant getEnseignantById(int id){
        return enseignantRepository.findById(id).orElse(null);
    }

}
