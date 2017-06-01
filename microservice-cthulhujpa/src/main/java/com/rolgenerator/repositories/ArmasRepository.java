package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.Armas;

// TODO: Auto-generated Javadoc
/**
 * The Interface ArmasRepository.
 */
@Repository
public interface ArmasRepository extends CrudRepository<Armas, String> {
	
	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable)
	 */
	Armas findOne(String arma);
}
