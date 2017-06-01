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
	
	/** The notas. */
	private String notas;
	
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
	 * @param notas the notas
	 */
	protected Armas(String arma, String habilidad, String daño, String notas) {
		super();
		this.arma = arma;
		this.habilidad = habilidad;
		this.daño = daño;
		this.notas = notas;
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
	 * Gets the notas.
	 *
	 * @return the notas
	 */
	public String getNotas() {
		return notas;
	}

	/**
	 * Sets the notas.
	 *
	 * @param notas the new notas
	 */
	public void setNotas(String notas) {
		this.notas = notas;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Armas [arma=" + arma + ", habilidad=" + habilidad + ", daño=" + daño + ", notas=" + notas + "]";
	}

	
	
}
