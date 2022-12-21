package com.Actividad.Spring.services.imple;

import com.Actividad.Spring.entity.VehiculoEntity;
import com.Actividad.Spring.repository.IVehiculoRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class VehiculoImple implements IVehiculoImpl {


    private final IVehiculoRepository iVehiculoRepository;

    public VehiculoImple(IVehiculoRepository iVehiculoRepository) {
        this.iVehiculoRepository = iVehiculoRepository;
    }


    @Override
    public List<VehiculoEntity> getVehiculoList() {

        return iVehiculoRepository.findAll();

    }
}
