package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Armas {

	@Id
	private String arma;
	private String habilidad;
	private String daño;
	private String notas;
	
	protected Armas() {
	}

	protected Armas(String arma, String habilidad, String daño, String notas) {
		super();
		this.arma = arma;
		this.habilidad = habilidad;
		this.daño = daño;
		this.notas = notas;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public String getDaño() {
		return daño;
	}

	public void setDaño(String daño) {
		this.daño = daño;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Armas [arma=" + arma + ", habilidad=" + habilidad + ", daño=" + daño + ", notas=" + notas + "]";
	}

	
	
}
