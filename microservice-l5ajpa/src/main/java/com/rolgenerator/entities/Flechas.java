package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Flechas.
 */
@Entity
public class Flechas {

	/** The flecha. */
	@Id
	private String flecha;
	
	/** The daño. */
	private String daño;
	
	/**
	 * Instantiates a new flechas.
	 */
	protected Flechas() {
	}

	/**
	 * Instantiates a new flechas.
	 *
	 * @param flecha the flecha
	 * @param daño the daño
	 */
	protected Flechas(String flecha, String daño) {
		super();
		this.flecha = flecha;
		this.daño = daño;
	}

	/**
	 * Gets the flecha.
	 *
	 * @return the flecha
	 */
	public String getFlecha() {
		return flecha;
	}

	/**
	 * Sets the flecha.
	 *
	 * @param flecha the new flecha
	 */
	public void setFlecha(String flecha) {
		this.flecha = flecha;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Flechas [flecha=" + flecha + ", daño=" + daño + "]";
	}

	

	
	
}
