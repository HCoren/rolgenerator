package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Escuelas {

	@Id
	private String clan;
	private String escuela1;
	private String escuela2;
	private String escuela3;
	private String escuela4;
	
	protected Escuelas() {
	}
	
	public Escuelas(String clan, String escuela1, String escuela2, String escuela3, String escuela4) {
		this.clan = clan;
		this.escuela1 = escuela1;
		this.escuela2 = escuela2;
		this.escuela3 = escuela3;
		this.escuela4 = escuela4;
	}

	public String getClan() {
		return clan;
	}

	public String getEscuela1() {
		return escuela1;
	}

	public String getEscuela2() {
		return escuela2;
	}

	public String getEscuela3() {
		return escuela3;
	}

	public String getEscuela4() {
		return escuela4;
	}

	@Override
	public String toString() {
		return "Escuelas [clan=" + clan + ", escuela1=" + escuela1 + ", escuela2=" + escuela2 + ", escuela3=" + escuela3
				+ ", escuela4=" + escuela4 + "]";
	}
	
}
