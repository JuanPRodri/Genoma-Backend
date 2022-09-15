package com.prueba.genomabackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.genomabackend.dto.AnalisisDto;
import com.prueba.genomabackend.dto.MutacionDto;
import com.prueba.genomabackend.model.Analisis;
import com.prueba.genomabackend.service.AnalisisService;


@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RequestMapping("genomaXYZ/")
@RestController
public class AnalisisController {
	
	@Autowired
	AnalisisService service;
	
	@GetMapping("listarAnalisis")
	public List<Analisis> getAnalisis(){
		return service.findAllAnalisis();
	}
	
	@PostMapping("analizar")
	public MutacionDto analizar(@RequestBody AnalisisDto analizar) {
		
		
		return service.findMutant(analizar);
	}

}
