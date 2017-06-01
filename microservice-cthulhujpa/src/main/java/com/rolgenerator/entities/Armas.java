package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Armas {

	@Id
	private String arma;
	private String habilidad;
	private String daño;
	private String alcance;
	private String ataques;
	private String capacidad;
	private String pr;
	private String fdefect;
	
	protected Armas() {
	}

	protected Armas(String arma, String habilidad, String daño, String alcance, String ataques, String capacidad,
			String pr, String fdefect) {
		super();
		this.arma = arma;
		this.habilidad = habilidad;
		this.daño = daño;
		this.alcance = alcance;
		this.ataques = ataques;
		this.capacidad = capacidad;
		this.pr = pr;
		this.fdefect = fdefect;
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

	public String getAlcance() {
		return alcance;
	}

	public void setAlcance(String alcance) {
		this.alcance = alcance;
	}

	public String getAtaques() {
		return ataques;
	}

	public void setAtaques(String ataques) {
		this.ataques = ataques;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public String getPr() {
		return pr;
	}

	public void setPr(String pr) {
		this.pr = pr;
	}

	public String getFdefect() {
		return fdefect;
	}

	public void setFdefect(String fdefect) {
		this.fdefect = fdefect;
	}

	@Override
	public String toString() {
		return "Armas [arma=" + arma + ", habilidad=" + habilidad + ", daño=" + daño + ", alcance=" + alcance
				+ ", ataques=" + ataques + ", capacidad=" + capacidad + ", pr=" + pr + ", fdefect=" + fdefect + "]";
	}

	
}
