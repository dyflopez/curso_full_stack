package com.semillero.serviciobasededatos.repository;

import com.semillero.serviciobasededatos.entityes.PeliculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPeliculaRepository extends JpaRepository<PeliculaEntity, Long> {
}
