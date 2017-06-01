package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.Habilidades;

// TODO: Auto-generated Javadoc
/**
 * The Interface HabilidadesRepository.
 */
@Repository
public interface HabilidadesRepository extends CrudRepository<Habilidades, String> {
	
	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable)
	 */
	Habilidades findOne(String habilidad);
}
