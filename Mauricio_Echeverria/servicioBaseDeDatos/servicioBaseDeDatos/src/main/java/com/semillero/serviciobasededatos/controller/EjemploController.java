package com.semillero.serviciobasededatos.controller;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ejemplo")
public class EjemploController {

    @GetMapping
    public ResponseEntity getTest(){

        return ResponseEntity.ok("todo ok");
    }
}
