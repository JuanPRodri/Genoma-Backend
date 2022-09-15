package com.prueba.genomabackend.dto;

public class AnalisisDto {
	
	private String cadenaAdn;
	private boolean mutacion;
	
	public AnalisisDto(String cadenaAdn) {
		super();
		this.cadenaAdn = cadenaAdn;
	}
	public String getCadenaAdn() {
		return cadenaAdn;
	}
	public void setCadenaAdn(String cadenaAdn) {
		this.cadenaAdn = cadenaAdn;
	}
	public boolean isMutacion() {
		return mutacion;
	}
	public void setMutacion(boolean mutacion) {
		this.mutacion = mutacion;
	}
	
	
	
}
