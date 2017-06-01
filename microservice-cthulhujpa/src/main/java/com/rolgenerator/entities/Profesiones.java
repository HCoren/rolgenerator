package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Profesiones.
 */
@Entity
public class Profesiones {

	/** The profesion. */
	@Id
	private String profesion;
	
	/** The habilidad 1. */
	private String habilidad1;
	
	/** The habilidad 2. */
	private String habilidad2;
	
	/** The habilidad 3. */
	private String habilidad3;
	
	/** The habilidad 4. */
	private String habilidad4;
	
	/** The habilidad 5. */
	private String habilidad5;
	
	/** The habilidad 6. */
	private String habilidad6;
	
	/** The habilidad 7. */
	private String habilidad7;
	
	/** The habilidad 8. */
	private String habilidad8;
	
	/**
	 * Instantiates a new profesiones.
	 */
	protected Profesiones() {
	}

	/**
	 * Instantiates a new profesiones.
	 *
	 * @param profesion the profesion
	 * @param habilidad1 the habilidad 1
	 * @param habilidad2 the habilidad 2
	 * @param habilidad3 the habilidad 3
	 * @param habilidad4 the habilidad 4
	 * @param habilidad5 the habilidad 5
	 * @param habilidad6 the habilidad 6
	 * @param habilidad7 the habilidad 7
	 * @param habilidad8 the habilidad 8
	 */
	protected Profesiones(String profesion, String habilidad1, String habilidad2, String habilidad3, String habilidad4,
			String habilidad5, String habilidad6, String habilidad7, String habilidad8) {
		super();
		this.profesion = profesion;
		this.habilidad1 = habilidad1;
		this.habilidad2 = habilidad2;
		this.habilidad3 = habilidad3;
		this.habilidad4 = habilidad4;
		this.habilidad5 = habilidad5;
		this.habilidad6 = habilidad6;
		this.habilidad7 = habilidad7;
		this.habilidad8 = habilidad8;
	}

	/**
	 * Gets the profesion.
	 *
	 * @return the profesion
	 */
	public String getProfesion() {
		return profesion;
	}

	/**
	 * Sets the profesion.
	 *
	 * @param profesion the new profesion
	 */
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	/**
	 * Gets the habilidad 1.
	 *
	 * @return the habilidad 1
	 */
	public String getHabilidad1() {
		return habilidad1;
	}

	/**
	 * Sets the habilidad 1.
	 *
	 * @param habilidad1 the new habilidad 1
	 */
	public void setHabilidad1(String habilidad1) {
		this.habilidad1 = habilidad1;
	}

	/**
	 * Gets the habilidad 2.
	 *
	 * @return the habilidad 2
	 */
	public String getHabilidad2() {
		return habilidad2;
	}

	/**
	 * Sets the habilidad 2.
	 *
	 * @param habilidad2 the new habilidad 2
	 */
	public void setHabilidad2(String habilidad2) {
		this.habilidad2 = habilidad2;
	}

	/**
	 * Gets the habilidad 3.
	 *
	 * @return the habilidad 3
	 */
	public String getHabilidad3() {
		return habilidad3;
	}

	/**
	 * Sets the habilidad 3.
	 *
	 * @param habilidad3 the new habilidad 3
	 */
	public void setHabilidad3(String habilidad3) {
		this.habilidad3 = habilidad3;
	}

	/**
	 * Gets the habilidad 4.
	 *
	 * @return the habilidad 4
	 */
	public String getHabilidad4() {
		return habilidad4;
	}

	/**
	 * Sets the habilidad 4.
	 *
	 * @param habilidad4 the new habilidad 4
	 */
	public void setHabilidad4(String habilidad4) {
		this.habilidad4 = habilidad4;
	}

	/**
	 * Gets the habilidad 5.
	 *
	 * @return the habilidad 5
	 */
	public String getHabilidad5() {
		return habilidad5;
	}

	/**
	 * Sets the habilidad 5.
	 *
	 * @param habilidad5 the new habilidad 5
	 */
	public void setHabilidad5(String habilidad5) {
		this.habilidad5 = habilidad5;
	}

	/**
	 * Gets the habilidad 6.
	 *
	 * @return the habilidad 6
	 */
	public String getHabilidad6() {
		return habilidad6;
	}

	/**
	 * Sets the habilidad 6.
	 *
	 * @param habilidad6 the new habilidad 6
	 */
	public void setHabilidad6(String habilidad6) {
		this.habilidad6 = habilidad6;
	}

	/**
	 * Gets the habilidad 7.
	 *
	 * @return the habilidad 7
	 */
	public String getHabilidad7() {
		return habilidad7;
	}

	/**
	 * Sets the habilidad 7.
	 *
	 * @param habilidad7 the new habilidad 7
	 */
	public void setHabilidad7(String habilidad7) {
		this.habilidad7 = habilidad7;
	}

	/**
	 * Gets the habilidad 8.
	 *
	 * @return the habilidad 8
	 */
	public String getHabilidad8() {
		return habilidad8;
	}

	/**
	 * Sets the habilidad 8.
	 *
	 * @param habilidad8 the new habilidad 8
	 */
	public void setHabilidad8(String habilidad8) {
		this.habilidad8 = habilidad8;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profesiones [profesion=" + profesion + ", habilidad1=" + habilidad1 + ", habilidad2=" + habilidad2
				+ ", habilidad3=" + habilidad3 + ", habilidad4=" + habilidad4 + ", habilidad5=" + habilidad5
				+ ", habilidad6=" + habilidad6 + ", habilidad7=" + habilidad7 + ", habilidad8=" + habilidad8 + "]";
	}

	
}
