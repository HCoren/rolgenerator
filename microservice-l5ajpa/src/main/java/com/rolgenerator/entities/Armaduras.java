package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Armaduras.
 */
@Entity
public class Armaduras {

	/** The armadura. */
	@Id
	private String armadura;
	
	/** The bonificador. */
	private int bonificador;
	
	/** The reduccion. */
	private int reduccion;
	
	/** The notas. */
	private String notas;
	
	/**
	 * Instantiates a new armaduras.
	 */
	protected Armaduras() {
	}

	/**
	 * Instantiates a new armaduras.
	 *
	 * @param armadura the armadura
	 * @param bonificador the bonificador
	 * @param reduccion the reduccion
	 * @param notas the notas
	 */
	protected Armaduras(String armadura, int bonificador, int reduccion, String notas) {
		super();
		this.armadura = armadura;
		this.bonificador = bonificador;
		this.reduccion = reduccion;
		this.notas = notas;
	}

	/**
	 * Gets the armadura.
	 *
	 * @return the armadura
	 */
	public String getArmadura() {
		return armadura;
	}

	/**
	 * Sets the armadura.
	 *
	 * @param armadura the new armadura
	 */
	public void setArmadura(String armadura) {
		this.armadura = armadura;
	}

	/**
	 * Gets the bonificador.
	 *
	 * @return the bonificador
	 */
	public int getBonificador() {
		return bonificador;
	}

	/**
	 * Sets the bonificador.
	 *
	 * @param bonificador the new bonificador
	 */
	public void setBonificador(int bonificador) {
		this.bonificador = bonificador;
	}

	/**
	 * Gets the reduccion.
	 *
	 * @return the reduccion
	 */
	public int getReduccion() {
		return reduccion;
	}

	/**
	 * Sets the reduccion.
	 *
	 * @param reduccion the new reduccion
	 */
	public void setReduccion(int reduccion) {
		this.reduccion = reduccion;
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
		return "Armaduras [armadura=" + armadura + ", bonificador=" + bonificador + ", reduccion=" + reduccion
				+ ", notas=" + notas + "]";
	}
	
}
