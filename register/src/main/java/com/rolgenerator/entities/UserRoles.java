package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class UserRoles.
 */
@Entity (name = "user_roles")
public class UserRoles {

	/** The user role id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_role_id;
	
	/** The username. */
	private String username;
	
	/** The role. */
	private String role;
	
	
	
	/**
	 * Instantiates a new user roles.
	 */
	protected UserRoles() {
	}

	/**
	 * Instantiates a new user roles.
	 *
	 * @param username the username
	 * @param role the role
	 */
	public UserRoles(String username, String role) {
		this.username = username;
		this.role = role;
	}

	/**
	 * Gets the user role id.
	 *
	 * @return the user role id
	 */
	public int getUser_role_id() {
		return user_role_id;
	}

	/**
	 * Sets the user role id.
	 *
	 * @param user_role_id the new user role id
	 */
	public void setUser_role_id(int user_role_id) {
		this.user_role_id = user_role_id;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Sets the role.
	 *
	 * @param role the new role
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserRoles [user_role_id=" + user_role_id + ", username=" + username + ", role=" + role + "]";
	}
	
}
