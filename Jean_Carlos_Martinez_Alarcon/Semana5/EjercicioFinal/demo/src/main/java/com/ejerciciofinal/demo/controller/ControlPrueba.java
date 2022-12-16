package com.ejerciciofinal.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class ControlPrueba {


    @GetMapping
    public ResponseEntity getTest(){

        return ResponseEntity.ok("OKY DOKY");

    }



}
