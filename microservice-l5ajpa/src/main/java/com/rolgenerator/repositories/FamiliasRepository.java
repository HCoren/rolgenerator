package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.Familias;

@Repository
public interface FamiliasRepository extends CrudRepository<Familias, String> {
	Familias findOne (String clan);
}
