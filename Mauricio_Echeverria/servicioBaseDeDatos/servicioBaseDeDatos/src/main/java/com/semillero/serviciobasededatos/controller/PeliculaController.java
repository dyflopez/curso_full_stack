package com.semillero.serviciobasededatos.controller;

import com.semillero.serviciobasededatos.entityes.PeliculaEntity;
import com.semillero.serviciobasededatos.service.IPeliculaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pelicula")
public class PeliculaController {


    private final IPeliculaService iPeliculaService;

    public PeliculaController(IPeliculaService iPeliculaService) {
        this.iPeliculaService = iPeliculaService;
    }


    @GetMapping
    public ResponseEntity getListPeliculas() {

        return iPeliculaService.getPeliculaList();

    }

    @GetMapping("{id}")
    public ResponseEntity getListPeliculasPorId(@PathVariable("id") long id) {

        return iPeliculaService.getListPeliculasId(id);

    }

    @PostMapping
    public ResponseEntity postGuardarPelicula(@RequestBody PeliculaEntity peliculaEntity) {

        return iPeliculaService.postGuardarNuevaPelicula(peliculaEntity);

    }

    @DeleteMapping("{id}")
    public ResponseEntity deletePelicula(@PathVariable("id") long id) {

        return iPeliculaService.deletePeliculaPorId(id);

    }

    @PutMapping("{modificar}")
    public ResponseEntity<PeliculaEntity> modificarPeliculaPorId(@RequestBody PeliculaEntity peliculaEntity) {


        return iPeliculaService.modificarPeliculaPorId(peliculaEntity);
    }





}




