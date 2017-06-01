package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Familias {

	@Id
	private String clan;
	private String familia1;
	private String familia2;
	private String familia3;
	private String familia4;
	private String familia5;
	private String familia6;
	
	protected Familias () {
		
	}
	
	public Familias(String clan, String familia1, String familia2, String familia3, String familia4, String familia5,
			String familia6) {
		this.clan = clan;
		this.familia1 = familia1;
		this.familia2 = familia2;
		this.familia3 = familia3;
		this.familia4 = familia4;
		this.familia5 = familia5;
		this.familia6 = familia6;
	}
	
	public String getClan() {
		return clan;
	}

	public String getFamilia1() {
		return familia1;
	}

	public String getFamilia2() {
		return familia2;
	}

	public String getFamilia3() {
		return familia3;
	}

	public String getFamilia4() {
		return familia4;
	}

	public String getFamilia5() {
		return familia5;
	}

	public String getFamilia6() {
		return familia6;
	}
	
	@Override
	public String toString() {
		return "Familias [clan=" + clan + ", familia1=" + familia1 + ", familia2=" + familia2 + ", familia3=" + familia3
				+ ", familia4=" + familia4 + ", familia5=" + familia5 + ", familia6=" + familia6 + "]";
	}
	
}
