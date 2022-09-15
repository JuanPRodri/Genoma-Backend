package com.prueba.genomabackend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.genomabackend.dto.AnalisisDto;
import com.prueba.genomabackend.dto.MutacionDto;
import com.prueba.genomabackend.model.Analisis;
import com.prueba.genomabackend.repository.AnalisisRepository;

@Service
public class AnalisisService {
	
	@Autowired
	private AnalisisRepository analisisRepository;
	
	public List<Analisis> findAllAnalisis(){
		return (List<Analisis>) analisisRepository.findAll();
	}
	
	public MutacionDto findMutant(AnalisisDto analizar) {
			
		MutacionDto nuevaMutacion = new MutacionDto(false);
		Analisis analisis = new Analisis(analizar.getCadenaAdn());
		
		List<String> ubicacionMutaciones = new ArrayList<String>();
		
		char matriz[][] = convetToMatriz(analizar.getCadenaAdn());
		
		for (int i = 0; i < matriz.length ; i++) {
			for (int j = 0; j < matriz.length - 3; j++) {
				String horizontal = validarHorizontal(i,j, matriz);
				if(horizontal != null) {
					ubicacionMutaciones.add(horizontal);	
				}						
				
			}
			
		}
		
		for (int i = 0; i < matriz.length - 3; i++) {
			for (int j = 0; j < matriz.length ; j++) {
				String vertical = validarVertical(i,j, matriz);
				
				if(vertical != null) {
					ubicacionMutaciones.add(vertical);	
				}						
				
			}
			
		}
		
		for (int i = 0; i < matriz.length - 3; i++) {
			for (int j = 0; j < matriz.length - 3; j++) {				
				String diagonal = validarDiagonal(i,j, matriz);
				if(diagonal != null) {
					ubicacionMutaciones.add(diagonal);	
				}
				
			
			}
		}
		
		
		nuevaMutacion.setUbicacionMutaciones(ubicacionMutaciones);
		
		if(ubicacionMutaciones.size() > 0) {
			nuevaMutacion.setMutacion(true);
			analisis.setMutacion(true);
		}
		analisisRepository.save(analisis);
		
		return nuevaMutacion;
		
	}
	
	
	private char[][] convetToMatriz(String cadenaAdn){
		
		int n = (int) Math.sqrt(cadenaAdn.length());
		
		char matriz[][] = new char[n][n];
		
		int rango = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = cadenaAdn.charAt(rango);
				rango++;
			}
		}
				
		return matriz;
			
	}

	
	private String validarHorizontal(int x, int y, char[][] matriz) {
		
			int count = 1;
			for (int i = 1; i < 4; i++) {
				if(matriz[x][y] == matriz[x][y+i]) {
					count++;
				}
			}
			if(count == 4) {
				return ("mutacion horizontal encontra en coordenada (" + x + "," + y + ")");
			}
			else {
				return null;
			}

			
	}
	
	private String validarVertical(int x, int y, char[][] matriz) {
		
		int count = 1;
		for (int i = 1; i < 4; i++) {
			if(matriz[x][y] == matriz[x+i][y]) {
				count++;
			}
		}
		if(count == 4) {
			return ("mutacion vertical encontra en coordenada (" + x + "," + y + ")");
		}
		else {
			return null;
		}

		
	}
	
	private String validarDiagonal(int x, int y, char[][] matriz) {
			
		int count = 1;
		for (int i = 1; i < 4; i++) {
			if(matriz[x][y] == matriz[x+i][y+i]) {
				count++;
			}
		}
		if(count == 4) {
			return ("mutacion diagonal encontra en coordenada (" + x + "," + y + ")");
		}
		else {
			return null;
		}

		
	}

}
