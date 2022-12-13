package com.Actividad.Spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;


/**
 * http://localhost:8080/ejercicio/mensaje?texto=abcdef
 */


@RestController //  Es un controlador, es uns servicio//
@RequestMapping("/ejercicio") // Completar la URL para mi servicio //
public class ActividadSpring {

    @GetMapping("/mensaje") // URL que se esta construytendo oara el servicio del problema //
    public static String mostrarPrimerUltimoCaracter(@PathParam("texto") String texto) { //capturar la informacion es pathParam (parametro)

        char[] secuencia = texto.toCharArray();


        if (texto.length() > 2) {
            for (int i = 1; i < texto.length() - 1; i++) {
                secuencia[i] = '*';
            }

        } else {
            System.err.println("no se pudo cifrar");

        }


        return String.valueOf(secuencia);



    }
}

