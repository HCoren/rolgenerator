package com.rolgenerator.dto;

// TODO: Auto-generated Javadoc
/**
 * The Class DatosMailDTO.
 */
public class DatosMailDTO {

	/** The nombre. */
	private String nombre;
	
	/** The mail. */
	private String mail;
	
	/** The contenido. */
	private String contenido;
	
	/**
	 * Instantiates a new datos mail DTO.
	 */
	protected DatosMailDTO() {
		
	}
	
	/**
	 * Instantiates a new datos mail DTO.
	 *
	 * @param nombre the nombre
	 * @param mail the mail
	 * @param contenido the contenido
	 */
	protected DatosMailDTO(String nombre, String mail, String contenido) {
		this.nombre = nombre;
		this.mail = mail;
		this.contenido = contenido;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the mail.
	 *
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * Sets the mail.
	 *
	 * @param mail the new mail
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * Gets the contenido.
	 *
	 * @return the contenido
	 */
	public String getContenido() {
		return contenido;
	}

	/**
	 * Sets the contenido.
	 *
	 * @param contenido the new contenido
	 */
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DatosMail [nombre=" + nombre + ", mail=" + mail + ", contenido=" + contenido + "]";
	}

}