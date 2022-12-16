package co.com.ntt.semillero.fullstack.java.Mysql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

//localhost:8080/ejemplo/

@RestController
@RequestMapping("/ejemplo")
public class EjemploController {

    @GetMapping("/")
    //El nombre del PathParam debe ser igual al del parametro
    public String getSaludar(@PathParam("nombrePersona") String nombrePersona) {

        String mensaje = "prueba";

        mensaje = mensaje + " " + nombrePersona;

        return mensaje;
    }
}
