package com.rolgenerator.dto;

import javax.validation.constraints.NotNull;

public class UserDTO {

	@NotNull
	private String nick;

	@NotNull
	private String name;

	@NotNull
	private String lastName;

	@NotNull
	private String password;

	@NotNull
	private String email;
	
	protected UserDTO() {
	}

	protected UserDTO(String nick, String name, String lastName, String password, String email) {
		this.nick = nick;
		this.name = name;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDTO [nick=" + nick + ", name=" + name + ", lastName=" + lastName + ", password=" + password
				+ ", email=" + email + "]";
	}
	
}