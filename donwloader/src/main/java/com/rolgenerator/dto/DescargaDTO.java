package com.rolgenerator.dto;

public class DescargaDTO {

	private int documento;

	public DescargaDTO() {
	}
	
	public DescargaDTO(int documento) {
		this.documento = documento;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	@Override
	public String toString() {
		return "DescargaDTO [documento=" + documento + "]";
	}
	
}
