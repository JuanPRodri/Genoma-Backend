package com.prueba.genomabackend.model;

import java.util.ArrayList;
import java.util.List;

public class Mutacion {
	
	private boolean estadoAdn;
	
	private List<String> ubicacionMutaciones = new ArrayList<String>();
	
	
	
	public Mutacion(boolean estadoAdn) {
		super();
		this.estadoAdn = estadoAdn;
	}
	public boolean isEstadoAdn() {
		return estadoAdn;
	}
	public void setEstadoAdn(boolean estadoAdn) {
		this.estadoAdn = estadoAdn;
	}
	public List<String> getUbicacionMutaciones() {
		return ubicacionMutaciones;
	}
	public void setUbicacionMutaciones(List<String> ubicacionMutaciones) {
		this.ubicacionMutaciones = ubicacionMutaciones;
	}
	
	

}
