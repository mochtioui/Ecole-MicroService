package com.esprit.enseignant;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;





public interface EnseignantRepository extends JpaRepository<Enseignant, Integer> {

	@Query("select m from Enseignant m where m.name like :n")
	public Page<Enseignant> enseignantByNom(@Param("n") String name, Pageable pageable);
	
	
}



