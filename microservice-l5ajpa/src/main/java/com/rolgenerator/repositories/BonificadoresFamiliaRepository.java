package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.BonificadoresFamilia;

// TODO: Auto-generated Javadoc
/**
 * The Interface BonificadoresFamiliaRepository.
 */
@Repository
public interface BonificadoresFamiliaRepository extends CrudRepository<BonificadoresFamilia, String> {
	
	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable)
	 */
	BonificadoresFamilia findOne(String familia);
}
