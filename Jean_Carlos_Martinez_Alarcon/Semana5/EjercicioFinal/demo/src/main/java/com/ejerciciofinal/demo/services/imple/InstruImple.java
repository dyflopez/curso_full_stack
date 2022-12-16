package com.ejerciciofinal.demo.services.imple;

import com.ejerciciofinal.demo.entity.InstruEntity;
import com.ejerciciofinal.demo.repository.InstruRepository;
import com.ejerciciofinal.demo.services.IInstruService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


// IMPLEMENTAR LA I(INTERface) IInstruService
@Service
public class InstruImple implements IInstruService {


    private final InstruRepository instruRepository;

    public InstruImple(InstruRepository instruRepository) {
        this.instruRepository = instruRepository;
    }

    @Override
    public ResponseEntity getInstrumentoList() {

        var ListaInstru = instruRepository.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(ListaInstru);

    }

    @Override
    public ResponseEntity postSaveNewInstru(InstruEntity instruEntity) {

        instruRepository.save(instruEntity);
       return ResponseEntity.status(HttpStatus.CREATED).body("Se creo un nuevo Instrumento 🎷🎷");

    }

    @Override
    public ResponseEntity deleteporId(int id) {
        instruRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.CREATED).body("El Instrumento se borro 🎺🎺");
    }

    @Override
    public ResponseEntity searchPorId(int id) {
        var ListaInstru = instruRepository.findById(id);

        return ResponseEntity.status(HttpStatus.OK).body(ListaInstru);
    }

    @Override
    public ResponseEntity updatePorId(int id,
                                   InstruEntity instruEntity ) {
        var ListaInstru = instruRepository.findById(id);

        instruEntity.getId();
        instruEntity.getInstrumento();
        instruEntity.getMarca();
        instruEntity.getStock();

        instruRepository.save(instruEntity);

        return ResponseEntity.status(HttpStatus.OK).body(ListaInstru);
    }


}
