package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class DatosEscuela.
 */
@Entity (name = "datos_escuela")
public class DatosEscuela {

	/** The escuela. */
	@Id
	private String escuela;
	
	/** The bonificador. */
	private String bonificador;
	
	/** The habilidades. */
	private String habilidades;
	
	/** The rangos. */
	private String rangos;
	
	/** The especialidades. */
	private String especialidades;
	
	/** The honor. */
	private float honor;
	
	/**
	 * Instantiates a new datos escuela.
	 */
	protected DatosEscuela() {
	}

	/**
	 * Instantiates a new datos escuela.
	 *
	 * @param escuela the escuela
	 * @param bonificador the bonificador
	 * @param habilidades the habilidades
	 * @param rangos the rangos
	 * @param especialidades the especialidades
	 * @param honor the honor
	 */
	protected DatosEscuela(String escuela, String bonificador, String habilidades, String rangos, String especialidades,
			float honor) {
		super();
		this.escuela = escuela;
		this.bonificador = bonificador;
		this.habilidades = habilidades;
		this.rangos = rangos;
		this.especialidades = especialidades;
		this.honor = honor;
	}

	/**
	 * Gets the escuela.
	 *
	 * @return the escuela
	 */
	public String getEscuela() {
		return escuela;
	}

	/**
	 * Sets the escuela.
	 *
	 * @param escuela the new escuela
	 */
	public void setEscuela(String escuela) {
		this.escuela = escuela;
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

	/**
	 * Gets the habilidades.
	 *
	 * @return the habilidades
	 */
	public String getHabilidades() {
		return habilidades;
	}

	/**
	 * Sets the habilidades.
	 *
	 * @param habilidades the new habilidades
	 */
	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	/**
	 * Gets the rangos.
	 *
	 * @return the rangos
	 */
	public String getRangos() {
		return rangos;
	}

	/**
	 * Sets the rangos.
	 *
	 * @param rangos the new rangos
	 */
	public void setRangos(String rangos) {
		this.rangos = rangos;
	}

	/**
	 * Gets the especialidades.
	 *
	 * @return the especialidades
	 */
	public String getEspecialidades() {
		return especialidades;
	}

	/**
	 * Sets the especialidades.
	 *
	 * @param especialidades the new especialidades
	 */
	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}

	/**
	 * Gets the honor.
	 *
	 * @return the honor
	 */
	public float getHonor() {
		return honor;
	}

	/**
	 * Sets the honor.
	 *
	 * @param honor the new honor
	 */
	public void setHonor(float honor) {
		this.honor = honor;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DatosEscuela [escuela=" + escuela + ", bonificador=" + bonificador + ", habilidades=" + habilidades
				+ ", rangos=" + rangos + ", especialidades=" + especialidades + ", honor=" + honor + "]";
	}

	
	
}
