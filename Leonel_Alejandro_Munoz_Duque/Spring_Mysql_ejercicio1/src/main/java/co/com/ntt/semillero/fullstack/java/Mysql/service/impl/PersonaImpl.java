package co.com.ntt.semillero.fullstack.java.Mysql.service.impl;

import co.com.ntt.semillero.fullstack.java.Mysql.entity.PersonaEntity;
import co.com.ntt.semillero.fullstack.java.Mysql.repository.IPersonasRepository;
import co.com.ntt.semillero.fullstack.java.Mysql.service.IPersonaImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaImpl implements IPersonaImpl {

    private final IPersonasRepository iPersonasRepository;

    public PersonaImpl(IPersonasRepository iPersonasRepository) {
        this.iPersonasRepository = iPersonasRepository;
    }


    @Override
    public List<PersonaEntity> getPersonaList() {

        return iPersonasRepository.findAll();

    }


}
