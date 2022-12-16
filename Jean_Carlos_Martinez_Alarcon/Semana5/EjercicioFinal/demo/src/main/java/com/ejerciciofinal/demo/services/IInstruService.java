package com.ejerciciofinal.demo.services;

import com.ejerciciofinal.demo.entity.InstruEntity;
import org.springframework.http.ResponseEntity;

// LOGICA DE NEGOCIO //
public interface IInstruService {

    ResponseEntity getInstrumentoList();

    ResponseEntity postSaveNewInstru(InstruEntity instruEntity);

    ResponseEntity deleteporId(int id );

    ResponseEntity searchPorId(int id);

    ResponseEntity updatePorId(int id,InstruEntity instruEntity);


    


}
