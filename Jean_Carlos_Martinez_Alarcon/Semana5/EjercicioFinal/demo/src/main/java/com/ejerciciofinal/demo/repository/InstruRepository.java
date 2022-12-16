package com.ejerciciofinal.demo.repository;

import com.ejerciciofinal.demo.entity.InstruEntity;
import org.springframework.data.jpa.repository.JpaRepository;
                                            // JPA: Hacer los select,update,delete en la BD//
public interface InstruRepository extends JpaRepository<InstruEntity, Integer> {


}
