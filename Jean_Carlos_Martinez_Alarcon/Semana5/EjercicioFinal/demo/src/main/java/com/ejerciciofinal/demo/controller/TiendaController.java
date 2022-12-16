package com.ejerciciofinal.demo.controller;


import com.ejerciciofinal.demo.entity.InstruEntity;
import com.ejerciciofinal.demo.services.IInstruService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tienda")
public class TiendaController {


    private final IInstruService iInstruService;

    public TiendaController(IInstruService iInstruService) {
        this.iInstruService = iInstruService;
    }

    @GetMapping("/instrumentos")
    public ResponseEntity getListInstrumentos(){
        //HttpStatus : 200 OK
        //201 = Creado/Actualizado
        //404 = No se encontro el servicio
        //401 = no autorizado
        //500 = Internal Server Error
        //400 = Bad Request

        return iInstruService.getInstrumentoList();

    }

    /**
    *  GETXID http://localhost:8095/tienda/3
     */
    @GetMapping("/{id}")
    public ResponseEntity searchId(@PathVariable("id") int id){

        return  iInstruService.searchPorId(id);
    }

    /**
    * POST http://localhost:8095/tienda
     */
    @PostMapping
    public ResponseEntity postSaveInfo(@RequestBody InstruEntity instruEntity){
        return iInstruService.postSaveNewInstru(instruEntity);
    }
    /**
    * DELETEXID http://localhost:8095/tienda/2
     */
    @DeleteMapping("/{id}")
    public ResponseEntity deleteInstru(@PathVariable("id") int id){

        return  iInstruService.deleteporId(id);
    }

    /**
     * PUT http://localhost:8095/tienda/2/update
     */

    @PutMapping(value = "/{id}/update")
    public ResponseEntity<Object> updatePorId(@PathVariable("id")int id,
                                      @RequestBody InstruEntity instruEntity){
            iInstruService.updatePorId(id,instruEntity);

        return ResponseEntity.ok(Boolean.TRUE);
    }


}
