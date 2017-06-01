package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class BonificadoresFamilia.
 */
@Entity (name = "bonificadores_familia")
public class BonificadoresFamilia {

	/** The familia. */
	@Id
	private String familia;
	
	/** The bonificador. */
	private String bonificador;
	
	/**
	 * Instantiates a new bonificadores familia.
	 */
	protected BonificadoresFamilia() {
	}

	/**
	 * Instantiates a new bonificadores familia.
	 *
	 * @param familia the familia
	 * @param bonificador the bonificador
	 */
	protected BonificadoresFamilia(String familia, String bonificador) {
		super();
		this.familia = familia;
		this.bonificador = bonificador;
	}

	/**
	 * Gets the familia.
	 *
	 * @return the familia
	 */
	public String getFamilia() {
		return familia;
	}

	/**
	 * Sets the familia.
	 *
	 * @param familia the new familia
	 */
	public void setFamilia(String familia) {
		this.familia = familia;
	}

	/**
	 * Gets the bonificador.
	 *
	 * @return the bonificador
	 */
	public String getBonificador() {
		return bonificador;
	}

	/**
	 * Sets the bonificador.
	 *
	 * @param bonificador the new bonificador
	 */
	public void setBonificador(String bonificador) {
		this.bonificador = bonificador;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BonificadoresFamilia [familia=" + familia + ", bonificador=" + bonificador + "]";
	}

	
	
}
