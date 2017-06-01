package com.rolgenerator.dto;

// TODO: Auto-generated Javadoc
/**
 * The Class DescargaDTO.
 */
public class DescargaDTO {

	/** The documento. */
	private int documento;

	/**
	 * Instantiates a new descarga DTO.
	 */
	public DescargaDTO() {
	}
	
	/**
	 * Instantiates a new descarga DTO.
	 *
	 * @param documento the documento
	 */
	public DescargaDTO(int documento) {
		this.documento = documento;
	}

	/**
	 * Gets the documento.
	 *
	 * @return the documento
	 */
	public int getDocumento() {
		return documento;
	}

	/**
	 * Sets the documento.
	 *
	 * @param documento the new documento
	 */
	public void setDocumento(int documento) {
		this.documento = documento;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DescargaDTO [documento=" + documento + "]";
	}
	
}
