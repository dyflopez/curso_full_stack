package com.Actividad.Spring.repository;

import com.Actividad.Spring.entity.VehiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVehiculoRepository extends JpaRepository <VehiculoEntity, Integer>{  // JPA:Tecnologia, permite hacer la consulta de acuerdo al nombre del metodo
                                                                // interactuar con la BBDD (Select,delete...)


}


