package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.Profesiones;

// TODO: Auto-generated Javadoc
/**
 * The Interface ProfesionesRepository.
 */
@Repository
public interface ProfesionesRepository extends CrudRepository<Profesiones, String> {
	
	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable)
	 */
	Profesiones findOne(String profesion);
}
