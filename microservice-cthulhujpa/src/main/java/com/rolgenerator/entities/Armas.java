package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Armas.
 */
@Entity
public class Armas {

	/** The arma. */
	@Id
	private String arma;
	
	/** The habilidad. */
	private String habilidad;
	
	/** The daño. */
	private String daño;
	
	/** The alcance. */
	private String alcance;
	
	/** The ataques. */
	private String ataques;
	
	/** The capacidad. */
	private String capacidad;
	
	/** The pr. */
	private String pr;
	
	/** The fdefect. */
	private String fdefect;
	
	/**
	 * Instantiates a new armas.
	 */
	protected Armas() {
	}

	/**
	 * Instantiates a new armas.
	 *
	 * @param arma the arma
	 * @param habilidad the habilidad
	 * @param daño the daño
	 * @param alcance the alcance
	 * @param ataques the ataques
	 * @param capacidad the capacidad
	 * @param pr the pr
	 * @param fdefect the fdefect
	 */
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

	/**
	 * Gets the arma.
	 *
	 * @return the arma
	 */
	public String getArma() {
		return arma;
	}

	/**
	 * Sets the arma.
	 *
	 * @param arma the new arma
	 */
	public void setArma(String arma) {
		this.arma = arma;
	}

	/**
	 * Gets the habilidad.
	 *
	 * @return the habilidad
	 */
	public String getHabilidad() {
		return habilidad;
	}

	/**
	 * Sets the habilidad.
	 *
	 * @param habilidad the new habilidad
	 */
	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	/**
	 * Gets the daño.
	 *
	 * @return the daño
	 */
	public String getDaño() {
		return daño;
	}

	/**
	 * Sets the daño.
	 *
	 * @param daño the new daño
	 */
	public void setDaño(String daño) {
		this.daño = daño;
	}

	/**
	 * Gets the alcance.
	 *
	 * @return the alcance
	 */
	public String getAlcance() {
		return alcance;
	}

	/**
	 * Sets the alcance.
	 *
	 * @param alcance the new alcance
	 */
	public void setAlcance(String alcance) {
		this.alcance = alcance;
	}

	/**
	 * Gets the ataques.
	 *
	 * @return the ataques
	 */
	public String getAtaques() {
		return ataques;
	}

	/**
	 * Sets the ataques.
	 *
	 * @param ataques the new ataques
	 */
	public void setAtaques(String ataques) {
		this.ataques = ataques;
	}

	/**
	 * Gets the capacidad.
	 *
	 * @return the capacidad
	 */
	public String getCapacidad() {
		return capacidad;
	}

	/**
	 * Sets the capacidad.
	 *
	 * @param capacidad the new capacidad
	 */
	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * Gets the pr.
	 *
	 * @return the pr
	 */
	public String getPr() {
		return pr;
	}

	/**
	 * Sets the pr.
	 *
	 * @param pr the new pr
	 */
	public void setPr(String pr) {
		this.pr = pr;
	}

	/**
	 * Gets the fdefect.
	 *
	 * @return the fdefect
	 */
	public String getFdefect() {
		return fdefect;
	}

	/**
	 * Sets the fdefect.
	 *
	 * @param fdefect the new fdefect
	 */
	public void setFdefect(String fdefect) {
		this.fdefect = fdefect;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Armas [arma=" + arma + ", habilidad=" + habilidad + ", daño=" + daño + ", alcance=" + alcance
				+ ", ataques=" + ataques + ", capacidad=" + capacidad + ", pr=" + pr + ", fdefect=" + fdefect + "]";
	}

	
}
