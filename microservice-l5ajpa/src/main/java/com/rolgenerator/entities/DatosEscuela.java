package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "datos_escuela")
public class DatosEscuela {

	@Id
	private String escuela;
	private String bonificador;
	private String habilidades;
	private String rangos;
	private String especialidades;
	private float honor;
	
	protected DatosEscuela() {
	}

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

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}

	public String getBonificador() {
		return bonificador;
	}

	public void setBonificador(String bonificador) {
		this.bonificador = bonificador;
	}

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	public String getRangos() {
		return rangos;
	}

	public void setRangos(String rangos) {
		this.rangos = rangos;
	}

	public String getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}

	public float getHonor() {
		return honor;
	}

	public void setHonor(float honor) {
		this.honor = honor;
	}

	@Override
	public String toString() {
		return "DatosEscuela [escuela=" + escuela + ", bonificador=" + bonificador + ", habilidades=" + habilidades
				+ ", rangos=" + rangos + ", especialidades=" + especialidades + ", honor=" + honor + "]";
	}

	
	
}
