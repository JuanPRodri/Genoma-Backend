package com.prueba.genomabackend.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prueba.genomabackend.model.Analisis;

@Repository
public interface AnalisisRepository extends CrudRepository<Analisis, Long>{

}
