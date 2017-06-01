package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.DatosEscuela;

// TODO: Auto-generated Javadoc
/**
 * The Interface DatosEscuelaRepository.
 */
@Repository
public interface DatosEscuelaRepository extends CrudRepository<DatosEscuela, String> {
	
	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable)
	 */
	DatosEscuela findOne(String escuela);
}
