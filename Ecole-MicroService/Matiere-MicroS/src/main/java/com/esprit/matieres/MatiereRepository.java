package com.esprit.matieres;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MatiereRepository extends JpaRepository<Matiere, Integer> {
	
	@Query("select m from Matiere m where m.name like :n")
	public Page<Matiere> matiereByNom(@Param("n") String name, Pageable pageable);
}
	
