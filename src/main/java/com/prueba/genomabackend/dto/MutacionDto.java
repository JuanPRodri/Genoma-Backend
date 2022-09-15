package com.prueba.genomabackend.dto;

import java.util.ArrayList;
import java.util.List;

public class MutacionDto {
	
private boolean mutacion;
	
	private List<String> ubicacionMutaciones = new ArrayList<String>();
	
	
	public MutacionDto(boolean mutacion) {
		super();
		this.mutacion = mutacion;
	}
	public boolean isMutacion() {
		return mutacion;
	}
	public void setMutacion(boolean mutacion) {
		this.mutacion = mutacion;
	}
	public List<String> getUbicacionMutaciones() {
		return ubicacionMutaciones;
	}
	public void setUbicacionMutaciones(List<String> ubicacionMutaciones) {
		this.ubicacionMutaciones = ubicacionMutaciones;
	}

}
