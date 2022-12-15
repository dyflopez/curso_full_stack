package com.Actividad.Spring.controller;

import com.Actividad.Spring.services.IActividad;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;


/**
 * http://localhost:8080/ejercicio/mensaje?texto=abcdef
 */


@RestController //  Es un controlador para el servicio//
@RequestMapping("/ejercicio") // Completar la URL para mi servicio //
public class Controller {

    private final IActividad iActividad ;

    public Controller(IActividad iActividad) {
        this.iActividad = iActividad;
    }


    @GetMapping("/mensaje") // URL que se esta construytendo oara el servicio del problema //
    public  String mostrarPrimerUltimoCaracter(@PathParam("texto") String texto) { //capturar la informacion es pathParam (parametro)

     return iActividad.cifrarMensaje(texto);
    }

    @GetMapping("/cifrar/{caracter}")
    public String getCifrarMensajeConCaracterEspesifico(@PathParam("mensaje") String mensaje,
                                                        @PathVariable("caracter") String caracter){
        return  iActividad.cifrarConCaracter(mensaje,caracter);
    }


    /**
    *http://localhost:8080/ejercicio/suma?primero=20&segundo=20
     */
    @GetMapping("/suma")
    public int operacionSumar(@RequestParam("primero")int num1,
                              @RequestParam("segundo")int num2){
        return iActividad.sumar(num1,num2);
    }

    /**
    *http://localhost:8080/ejercicio/invertir?cadena=programacion mundo hola maravilla
     */
    @GetMapping("/invertir") // GetMapping es la url //
    public String invertirCadenaCaracter(@RequestParam("cadena") String texto){



        return iActividad.invertirCadena(texto);
    }


}

