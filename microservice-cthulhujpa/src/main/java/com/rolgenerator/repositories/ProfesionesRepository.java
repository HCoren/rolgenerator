package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.Profesiones;

@Repository
public interface ProfesionesRepository extends CrudRepository<Profesiones, String> {
	Profesiones findOne(String profesion);
}
