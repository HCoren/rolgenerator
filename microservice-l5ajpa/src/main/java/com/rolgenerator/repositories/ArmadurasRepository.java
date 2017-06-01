package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.Armaduras;

// TODO: Auto-generated Javadoc
/**
 * The Interface ArmadurasRepository.
 */
@Repository
public interface ArmadurasRepository extends CrudRepository<Armaduras, String> {
	
	/* (non-Javadoc)
	 * @see org.springframework.data.repository.CrudRepository#findOne(java.io.Serializable)
	 */
	Armaduras findOne(String armadura);
}
