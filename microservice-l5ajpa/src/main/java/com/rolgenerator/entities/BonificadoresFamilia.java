package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "bonificadores_familia")
public class BonificadoresFamilia {

	@Id
	private String familia;
	private String bonificador;
	
	protected BonificadoresFamilia() {
	}

	protected BonificadoresFamilia(String familia, String bonificador) {
		super();
		this.familia = familia;
		this.bonificador = bonificador;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getBonificador() {
		return bonificador;
	}

	public void setBonificador(String bonificador) {
		this.bonificador = bonificador;
	}

	@Override
	public String toString() {
		return "BonificadoresFamilia [familia=" + familia + ", bonificador=" + bonificador + "]";
	}

	
	
}
