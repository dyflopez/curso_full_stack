package com.semillero.serviciobasededatos.service;

import com.semillero.serviciobasededatos.entityes.PeliculaEntity;
import org.springframework.http.ResponseEntity;

public interface IPeliculaService {

    ResponseEntity getPeliculaList();


    ResponseEntity getListPeliculasId(long id);


    ResponseEntity postGuardarNuevaPelicula (PeliculaEntity peliculaEntity);

    ResponseEntity deletePeliculaPorId(long id);


    ResponseEntity modificarPeliculaPorId (PeliculaEntity peliculaEntity);


}
