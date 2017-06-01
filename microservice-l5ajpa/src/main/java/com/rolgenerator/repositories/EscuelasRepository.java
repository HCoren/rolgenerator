package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.Escuelas;

// TODO: Auto-generated Javadoc
/**
 * The Interface EscuelasRepository.
 */
@Repository
public interface EscuelasRepository extends CrudRepository<Escuelas, String> {
	
	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable)
	 */
	Escuelas findOne (String clan);
}
