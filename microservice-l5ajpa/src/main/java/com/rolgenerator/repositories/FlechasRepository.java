package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.Flechas;

@Repository
public interface FlechasRepository extends CrudRepository<Flechas, String> {
	Flechas findOne(String flecha);
}
