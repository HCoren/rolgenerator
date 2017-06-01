package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.BonificadoresFamilia;

@Repository
public interface BonificadoresFamiliaRepository extends CrudRepository<BonificadoresFamilia, String> {
	BonificadoresFamilia findOne(String familia);
}
