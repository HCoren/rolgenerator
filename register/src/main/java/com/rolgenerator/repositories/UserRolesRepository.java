package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.UserRoles;

@Repository
public interface UserRolesRepository extends CrudRepository<UserRoles, String> {
	UserRoles findByUsername(String username);
}
