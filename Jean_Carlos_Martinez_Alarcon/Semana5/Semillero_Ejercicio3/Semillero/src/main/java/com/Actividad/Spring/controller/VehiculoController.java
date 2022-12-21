package com.Actividad.Spring.controller;


import com.Actividad.Spring.entity.VehiculoEntity;
import com.Actividad.Spring.services.imple.IVehiculoImpl;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("/vehiculo")
public class VehiculoController {


    private final IVehiculoImpl iVehiculoImpl;


    public VehiculoController(IVehiculoImpl iVehiculoImpl) {
        this.iVehiculoImpl = iVehiculoImpl;
    }

    @GetMapping("/autos")
    public ResponseEntity getVehiculos(){

        List<VehiculoEntity> vehiculoEntityList = new ArrayList<>();
        vehiculoEntityList = iVehiculoImpl.getVehiculoList();
        return ResponseEntity.ok(vehiculoEntityList);
    }


}
