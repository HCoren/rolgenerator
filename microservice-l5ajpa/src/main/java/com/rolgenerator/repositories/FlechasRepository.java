package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.Flechas;

// TODO: Auto-generated Javadoc
/**
 * The Interface FlechasRepository.
 */
@Repository
public interface FlechasRepository extends CrudRepository<Flechas, String> {
	
	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable)
	 */
	Flechas findOne(String flecha);
}
