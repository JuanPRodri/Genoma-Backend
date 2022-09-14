package com.prueba.genomabackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.genomabackend.model.Analisis;
import com.prueba.genomabackend.service.AnalisisService;

@RestController
public class AnalisisController {
	
	@Autowired
	AnalisisService service;
	
	@GetMapping("/listarAnalisis")
	public List<Analisis> getAnalisis(){
		return service.findAllAnalisis();
	}
	
	
	
	@GetMapping("/test")
	public String test() {
		Analisis an = new Analisis("AJDJDFJDJASHDJFK");
		
		service.addAnalisis(an);
		return "index";
		
	}
		
	

}
