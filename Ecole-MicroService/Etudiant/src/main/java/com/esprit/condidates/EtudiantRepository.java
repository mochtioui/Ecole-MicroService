package com.esprit.condidates;


import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;




public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
	
	
	

	@Query("select m from Etudiant m where m.name like :n")
	public Page<Etudiant> etudiantByNom(@Param("n") String name, Pageable pageable);
	
	
	

}



