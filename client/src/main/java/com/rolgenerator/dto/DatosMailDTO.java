package com.rolgenerator.dto;

public class DatosMailDTO {

	private String nombre;
	private String mail;
	private String contenido;
	
	protected DatosMailDTO() {
		
	}
	
	protected DatosMailDTO(String nombre, String mail, String contenido) {
		this.nombre = nombre;
		this.mail = mail;
		this.contenido = contenido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "DatosMail [nombre=" + nombre + ", mail=" + mail + ", contenido=" + contenido + "]";
	}

}