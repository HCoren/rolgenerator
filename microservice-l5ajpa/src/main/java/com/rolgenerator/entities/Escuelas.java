package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Escuelas.
 */
@Entity
public class Escuelas {

	/** The clan. */
	@Id
	private String clan;
	
	/** The escuela 1. */
	private String escuela1;
	
	/** The escuela 2. */
	private String escuela2;
	
	/** The escuela 3. */
	private String escuela3;
	
	/** The escuela 4. */
	private String escuela4;
	
	/**
	 * Instantiates a new escuelas.
	 */
	protected Escuelas() {
	}
	
	/**
	 * Instantiates a new escuelas.
	 *
	 * @param clan the clan
	 * @param escuela1 the escuela 1
	 * @param escuela2 the escuela 2
	 * @param escuela3 the escuela 3
	 * @param escuela4 the escuela 4
	 */
	public Escuelas(String clan, String escuela1, String escuela2, String escuela3, String escuela4) {
		this.clan = clan;
		this.escuela1 = escuela1;
		this.escuela2 = escuela2;
		this.escuela3 = escuela3;
		this.escuela4 = escuela4;
	}

	/**
	 * Gets the clan.
	 *
	 * @return the clan
	 */
	public String getClan() {
		return clan;
	}

	/**
	 * Gets the escuela 1.
	 *
	 * @return the escuela 1
	 */
	public String getEscuela1() {
		return escuela1;
	}

	/**
	 * Gets the escuela 2.
	 *
	 * @return the escuela 2
	 */
	public String getEscuela2() {
		return escuela2;
	}

	/**
	 * Gets the escuela 3.
	 *
	 * @return the escuela 3
	 */
	public String getEscuela3() {
		return escuela3;
	}

	/**
	 * Gets the escuela 4.
	 *
	 * @return the escuela 4
	 */
	public String getEscuela4() {
		return escuela4;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Escuelas [clan=" + clan + ", escuela1=" + escuela1 + ", escuela2=" + escuela2 + ", escuela3=" + escuela3
				+ ", escuela4=" + escuela4 + "]";
	}
	
}
