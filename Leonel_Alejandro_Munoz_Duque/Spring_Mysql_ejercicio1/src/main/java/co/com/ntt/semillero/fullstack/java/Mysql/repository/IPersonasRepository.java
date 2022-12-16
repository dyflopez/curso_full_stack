package co.com.ntt.semillero.fullstack.java.Mysql.repository;

import co.com.ntt.semillero.fullstack.java.Mysql.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonasRepository extends JpaRepository<PersonaEntity, Integer> {



}
