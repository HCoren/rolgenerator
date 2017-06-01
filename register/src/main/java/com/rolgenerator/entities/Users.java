package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	private String username;
	private String password;
	private int enabled;
	private String name;
	private String lastname;
	private String mail;
	
	
	
	protected Users() {
	}

	public Users(String username, String password, int enabled, String name, String lastname, String mail) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.name = name;
		this.lastname = lastname;
		this.mail = mail;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", enabled=" + enabled + ", name=" + name
				+ ", lastname=" + lastname + ", mail=" + mail + "]";
	}
	
}
