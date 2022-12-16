package co.com.ntt.semillero.fullstack.java.Mysql.controller;

import co.com.ntt.semillero.fullstack.java.Mysql.entity.PersonaEntity;
import co.com.ntt.semillero.fullstack.java.Mysql.service.IPersonaImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/persona")
public class PersonaController {


    private final IPersonaImpl iPersona;


    public PersonaController(IPersonaImpl iPersona) {
        this.iPersona = iPersona;
    }

    @GetMapping
    public ResponseEntity getPersona(){

        List<PersonaEntity> personaEntityList = new ArrayList<>();
        personaEntityList = iPersona.getPersonaList();


        return  ResponseEntity.ok(personaEntityList);

    }

}


