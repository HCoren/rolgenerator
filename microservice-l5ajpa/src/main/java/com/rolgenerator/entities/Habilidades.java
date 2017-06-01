package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Habilidades {

	@Id
	private String habilidad;
	private String tipo;
	private String caracteristica;
	private String especialidades;
	
	protected Habilidades() {
	}

	protected Habilidades(String habilidad, String tipo, String caracteristica, String especialidades) {
		super();
		this.habilidad = habilidad;
		this.tipo = tipo;
		this.caracteristica = caracteristica;
		this.especialidades = especialidades;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}

	@Override
	public String toString() {
		return "Habilidades [habilidad=" + habilidad + ", tipo=" + tipo + ", caracteristica=" + caracteristica
				+ ", especialidades=" + especialidades + "]";
	}

	
	
}
