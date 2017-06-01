package com.rolgenerator.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rolgenerator.entities.UserRoles;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserRolesRepository.
 */
@Repository
public interface UserRolesRepository extends CrudRepository<UserRoles, String> {
	
	/**
	 * Find by username.
	 *
	 * @param username the username
	 * @return the user roles
	 */
	UserRoles findByUsername(String username);
}
