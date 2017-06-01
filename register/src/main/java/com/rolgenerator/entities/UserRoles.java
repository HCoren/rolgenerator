package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name = "user_roles")
public class UserRoles {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_role_id;
	private String username;
	private String role;
	
	
	
	protected UserRoles() {
	}

	public UserRoles(String username, String role) {
		this.username = username;
		this.role = role;
	}

	public int getUser_role_id() {
		return user_role_id;
	}

	public void setUser_role_id(int user_role_id) {
		this.user_role_id = user_role_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserRoles [user_role_id=" + user_role_id + ", username=" + username + ", role=" + role + "]";
	}
	
}
