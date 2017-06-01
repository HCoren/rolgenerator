package com.rolgenerator.dto;

import javax.validation.constraints.NotNull;

// TODO: Auto-generated Javadoc
/**
 * The Class UserDTO.
 */
public class UserDTO {

	/** The nick. */
	@NotNull
	private String nick;

	/** The name. */
	@NotNull
	private String name;

	/** The last name. */
	@NotNull
	private String lastName;

	/** The password. */
	@NotNull
	private String password;

	/** The email. */
	@NotNull
	private String email;
	
	/**
	 * Instantiates a new user DTO.
	 */
	protected UserDTO() {
	}

	/**
	 * Instantiates a new user DTO.
	 *
	 * @param nick the nick
	 * @param name the name
	 * @param lastName the last name
	 * @param password the password
	 * @param email the email
	 */
	protected UserDTO(String nick, String name, String lastName, String password, String email) {
		this.nick = nick;
		this.name = name;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}

	/**
	 * Gets the nick.
	 *
	 * @return the nick
	 */
	public String getNick() {
		return nick;
	}

	/**
	 * Sets the nick.
	 *
	 * @param nick the new nick
	 */
	public void setNick(String nick) {
		this.nick = nick;
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
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserDTO [nick=" + nick + ", name=" + name + ", lastName=" + lastName + ", password=" + password
				+ ", email=" + email + "]";
	}
	
}