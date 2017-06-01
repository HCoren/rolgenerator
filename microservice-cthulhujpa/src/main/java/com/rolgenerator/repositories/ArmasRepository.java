package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.Armas;

@Repository
public interface ArmasRepository extends CrudRepository<Armas, String> {
	Armas findOne(String arma);
}
