package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Users.
 */
@Entity
public class Users {

	/** The username. */
	@Id
	private String username;
	
	/** The password. */
	private String password;
	
	/** The enabled. */
	private int enabled;
	
	/** The name. */
	private String name;
	
	/** The lastname. */
	private String lastname;
	
	/** The mail. */
	private String mail;
	
	
	
	/**
	 * Instantiates a new users.
	 */
	protected Users() {
	}

	/**
	 * Instantiates a new users.
	 *
	 * @param username the username
	 * @param password the password
	 * @param enabled the enabled
	 * @param name the name
	 * @param lastname the lastname
	 * @param mail the mail
	 */
	public Users(String username, String password, int enabled, String name, String lastname, String mail) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.name = name;
		this.lastname = lastname;
		this.mail = mail;
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
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the enabled.
	 *
	 * @return the enabled
	 */
	public int getEnabled() {
		return enabled;
	}

	/**
	 * Sets the enabled.
	 *
	 * @param enabled the new enabled
	 */
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the lastname.
	 *
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * Sets the lastname.
	 *
	 * @param lastname the new lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * Gets the mail.
	 *
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * Sets the mail.
	 *
	 * @param mail the new mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", enabled=" + enabled + ", name=" + name
				+ ", lastname=" + lastname + ", mail=" + mail + "]";
	}
	
}
