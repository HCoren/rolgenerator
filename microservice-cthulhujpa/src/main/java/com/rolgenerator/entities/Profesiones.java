package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profesiones {

	@Id
	private String profesion;
	private String habilidad1;
	private String habilidad2;
	private String habilidad3;
	private String habilidad4;
	private String habilidad5;
	private String habilidad6;
	private String habilidad7;
	private String habilidad8;
	
	protected Profesiones() {
	}

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

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getHabilidad1() {
		return habilidad1;
	}

	public void setHabilidad1(String habilidad1) {
		this.habilidad1 = habilidad1;
	}

	public String getHabilidad2() {
		return habilidad2;
	}

	public void setHabilidad2(String habilidad2) {
		this.habilidad2 = habilidad2;
	}

	public String getHabilidad3() {
		return habilidad3;
	}

	public void setHabilidad3(String habilidad3) {
		this.habilidad3 = habilidad3;
	}

	public String getHabilidad4() {
		return habilidad4;
	}

	public void setHabilidad4(String habilidad4) {
		this.habilidad4 = habilidad4;
	}

	public String getHabilidad5() {
		return habilidad5;
	}

	public void setHabilidad5(String habilidad5) {
		this.habilidad5 = habilidad5;
	}

	public String getHabilidad6() {
		return habilidad6;
	}

	public void setHabilidad6(String habilidad6) {
		this.habilidad6 = habilidad6;
	}

	public String getHabilidad7() {
		return habilidad7;
	}

	public void setHabilidad7(String habilidad7) {
		this.habilidad7 = habilidad7;
	}

	public String getHabilidad8() {
		return habilidad8;
	}

	public void setHabilidad8(String habilidad8) {
		this.habilidad8 = habilidad8;
	}

	@Override
	public String toString() {
		return "Profesiones [profesion=" + profesion + ", habilidad1=" + habilidad1 + ", habilidad2=" + habilidad2
				+ ", habilidad3=" + habilidad3 + ", habilidad4=" + habilidad4 + ", habilidad5=" + habilidad5
				+ ", habilidad6=" + habilidad6 + ", habilidad7=" + habilidad7 + ", habilidad8=" + habilidad8 + "]";
	}

	
}
