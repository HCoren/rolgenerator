package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Armaduras {

	@Id
	private String armadura;
	private int bonificador;
	private int reduccion;
	private String notas;
	
	protected Armaduras() {
	}

	protected Armaduras(String armadura, int bonificador, int reduccion, String notas) {
		super();
		this.armadura = armadura;
		this.bonificador = bonificador;
		this.reduccion = reduccion;
		this.notas = notas;
	}

	public String getArmadura() {
		return armadura;
	}

	public void setArmadura(String armadura) {
		this.armadura = armadura;
	}

	public int getBonificador() {
		return bonificador;
	}

	public void setBonificador(int bonificador) {
		this.bonificador = bonificador;
	}

	public int getReduccion() {
		return reduccion;
	}

	public void setReduccion(int reduccion) {
		this.reduccion = reduccion;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Armaduras [armadura=" + armadura + ", bonificador=" + bonificador + ", reduccion=" + reduccion
				+ ", notas=" + notas + "]";
	}
	
}
