package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flechas {

	@Id
	private String flecha;
	private String daño;
	
	protected Flechas() {
	}

	protected Flechas(String flecha, String daño) {
		super();
		this.flecha = flecha;
		this.daño = daño;
	}

	public String getFlecha() {
		return flecha;
	}

	public void setFlecha(String flecha) {
		this.flecha = flecha;
	}

	public String getDaño() {
		return daño;
	}

	public void setDaño(String daño) {
		this.daño = daño;
	}

	@Override
	public String toString() {
		return "Flechas [flecha=" + flecha + ", daño=" + daño + "]";
	}

	

	
	
}
