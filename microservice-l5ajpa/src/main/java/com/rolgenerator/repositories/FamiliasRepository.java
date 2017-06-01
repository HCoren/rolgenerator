package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.Familias;

// TODO: Auto-generated Javadoc
/**
 * The Interface FamiliasRepository.
 */
@Repository
public interface FamiliasRepository extends CrudRepository<Familias, String> {
	
	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable)
	 */
	Familias findOne (String clan);
}
