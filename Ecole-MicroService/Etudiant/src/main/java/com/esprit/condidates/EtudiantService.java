package com.esprit.condidates;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    public Etudiant addEtudiant(Etudiant client) {
        return etudiantRepository.save(client);
    }

    public Etudiant updateEtudiant(int id, Etudiant etudiant){
    	Etudiant c = etudiantRepository.findById(id).orElse(null);
        c.setAdress(etudiant.getAdress());
        c.setType(etudiant.getType());
        etudiantRepository.save(c);
        return c;
    }

    public void deleteEtudiant(int id){
        etudiantRepository.deleteById(id);
    }

    public List<Etudiant> getAllEtudiant(){
        return etudiantRepository.findAll();

    }

    public Etudiant getEtudiantById(int id){
        return etudiantRepository.findById(id).orElse(null);
    }

}
