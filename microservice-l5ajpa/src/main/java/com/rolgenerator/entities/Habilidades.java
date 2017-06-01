package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Habilidades.
 */
@Entity
public class Habilidades {

	/** The habilidad. */
	@Id
	private String habilidad;
	
	/** The tipo. */
	private String tipo;
	
	/** The caracteristica. */
	private String caracteristica;
	
	/** The especialidades. */
	private String especialidades;
	
	/**
	 * Instantiates a new habilidades.
	 */
	protected Habilidades() {
	}

	/**
	 * Instantiates a new habilidades.
	 *
	 * @param habilidad the habilidad
	 * @param tipo the tipo
	 * @param caracteristica the caracteristica
	 * @param especialidades the especialidades
	 */
	protected Habilidades(String habilidad, String tipo, String caracteristica, String especialidades) {
		super();
		this.habilidad = habilidad;
		this.tipo = tipo;
		this.caracteristica = caracteristica;
		this.especialidades = especialidades;
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
	 * Gets the tipo.
	 *
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Sets the tipo.
	 *
	 * @param tipo the new tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Gets the caracteristica.
	 *
	 * @return the caracteristica
	 */
	public String getCaracteristica() {
		return caracteristica;
	}

	/**
	 * Sets the caracteristica.
	 *
	 * @param caracteristica the new caracteristica
	 */
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Habilidades [habilidad=" + habilidad + ", tipo=" + tipo + ", caracteristica=" + caracteristica
				+ ", especialidades=" + especialidades + "]";
	}

	
	
}
