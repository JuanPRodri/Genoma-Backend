package com.prueba.genomabackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "analisis")
public class Analisis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String cadenaAdn;
	
	@Column(name = "estado_mutacion")
	private boolean mutacion = false;
	
	public Analisis(){
		
	}
	
	
	public Analisis(String cadenaAdn) {
		super();
		this.cadenaAdn = cadenaAdn;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
