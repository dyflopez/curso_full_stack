package com.semillero.serviciobasededatos.service.impl;

import com.semillero.serviciobasededatos.entityes.PeliculaEntity;
import com.semillero.serviciobasededatos.repository.IPeliculaRepository;
import com.semillero.serviciobasededatos.service.IPeliculaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PeliculaImpl implements IPeliculaService {


    private final IPeliculaRepository iPeliculaRepository;

    public PeliculaImpl(IPeliculaRepository iPeliculaRepository) {
        this.iPeliculaRepository = iPeliculaRepository;
    }


    @Override
    public ResponseEntity getPeliculaList() {

        var listaPeliculas = iPeliculaRepository.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(listaPeliculas);

    }

    @Override
    public ResponseEntity getListPeliculasId(long id) {

        var peliculaEncontrada = iPeliculaRepository.findById(id);

        return ResponseEntity.status(HttpStatus.OK).body(peliculaEncontrada);
    }

    @Override
    public ResponseEntity postGuardarNuevaPelicula(PeliculaEntity peliculaEntity) {

        iPeliculaRepository.save(peliculaEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Se agrego una nueva pelicula");
    }

    @Override
    public ResponseEntity deletePeliculaPorId(long id) {

        iPeliculaRepository.deleteById(id);

        return ResponseEntity.status(HttpStatus.CREATED).body("Se elimino una pelicula");
    }

    public ResponseEntity modificarPeliculaPorId(PeliculaEntity peliculaEntity) {


        var OpcionalModificarPeliculaPorId = iPeliculaRepository.findById(1L);

        PeliculaEntity peliculaUpdate = OpcionalModificarPeliculaPorId.get();

        peliculaUpdate.setId(peliculaUpdate.getId());
        peliculaUpdate.setNombre(peliculaUpdate.getNombre());
        peliculaUpdate.setPais(peliculaUpdate.getPais());
        peliculaUpdate.setAno(peliculaUpdate.getAno());
        peliculaUpdate.setGenero(peliculaUpdate.getGenero());

        iPeliculaRepository.save(peliculaUpdate);


        return ResponseEntity.status(HttpStatus.CREATED).body(peliculaUpdate);
    }


}
