package com.prueba.genomabackend.dto;

public class AnalisisDto {
	
	private String cadenaAdn;
	
	public AnalisisDto() {
	}
	
	public AnalisisDto(String cadenaAdn) {
		this.cadenaAdn = cadenaAdn;
	}
	public String getCadenaAdn() {
		return cadenaAdn;
	}
	public void setCadenaAdn(String cadenaAdn) {
		this.cadenaAdn = cadenaAdn;
	}
	
}
