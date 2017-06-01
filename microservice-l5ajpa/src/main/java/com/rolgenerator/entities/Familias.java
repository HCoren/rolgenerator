package com.rolgenerator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

// TODO: Auto-generated Javadoc
/**
 * The Class Familias.
 */
@Entity
public class Familias {

	/** The clan. */
	@Id
	private String clan;
	
	/** The familia 1. */
	private String familia1;
	
	/** The familia 2. */
	private String familia2;
	
	/** The familia 3. */
	private String familia3;
	
	/** The familia 4. */
	private String familia4;
	
	/** The familia 5. */
	private String familia5;
	
	/** The familia 6. */
	private String familia6;
	
	/**
	 * Instantiates a new familias.
	 */
	protected Familias () {
		
	}
	
	/**
	 * Instantiates a new familias.
	 *
	 * @param clan the clan
	 * @param familia1 the familia 1
	 * @param familia2 the familia 2
	 * @param familia3 the familia 3
	 * @param familia4 the familia 4
	 * @param familia5 the familia 5
	 * @param familia6 the familia 6
	 */
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
	
	/**
	 * Gets the clan.
	 *
	 * @return the clan
	 */
	public String getClan() {
		return clan;
	}

	/**
	 * Gets the familia 1.
	 *
	 * @return the familia 1
	 */
	public String getFamilia1() {
		return familia1;
	}

	/**
	 * Gets the familia 2.
	 *
	 * @return the familia 2
	 */
	public String getFamilia2() {
		return familia2;
	}

	/**
	 * Gets the familia 3.
	 *
	 * @return the familia 3
	 */
	public String getFamilia3() {
		return familia3;
	}

	/**
	 * Gets the familia 4.
	 *
	 * @return the familia 4
	 */
	public String getFamilia4() {
		return familia4;
	}

	/**
	 * Gets the familia 5.
	 *
	 * @return the familia 5
	 */
	public String getFamilia5() {
		return familia5;
	}

	/**
	 * Gets the familia 6.
	 *
	 * @return the familia 6
	 */
	public String getFamilia6() {
		return familia6;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Familias [clan=" + clan + ", familia1=" + familia1 + ", familia2=" + familia2 + ", familia3=" + familia3
				+ ", familia4=" + familia4 + ", familia5=" + familia5 + ", familia6=" + familia6 + "]";
	}
	
}
