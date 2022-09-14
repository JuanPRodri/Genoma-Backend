package com.prueba.genomabackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.genomabackend.model.Analisis;
import com.prueba.genomabackend.model.Mutacion;
import com.prueba.genomabackend.repository.AnalisisRepository;

@Service
public class AnalisisService {
	
	@Autowired
	private AnalisisRepository analisisRepository;
	
	public List<Analisis> findAllAnalisis(){
		return (List<Analisis>) analisisRepository.findAll();
	}
	
	public Mutacion findMutant(Analisis analisis) {
		
		return null;
		
	}
	
	public Analisis addAnalisis(Analisis analisis) {
		return analisisRepository.save(analisis);
	}
	
	

}
