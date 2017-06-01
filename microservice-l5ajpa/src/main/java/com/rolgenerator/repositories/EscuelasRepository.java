package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.Escuelas;

@Repository
public interface EscuelasRepository extends CrudRepository<Escuelas, String> {
	Escuelas findOne (String clan);
}
