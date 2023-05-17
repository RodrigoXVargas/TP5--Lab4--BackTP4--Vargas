package com.example.instrumentosback.services;

import com.example.instrumentosback.entities.Instrumento;
import com.example.instrumentosback.repositories.RepositoryBase;
import com.example.instrumentosback.repositories.RepositoryInstrument;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ServiceInstrumentImpl extends ServiceBaseImpl<Instrumento, Long> implements ServiceInstrument {

    public ServiceInstrumentImpl( RepositoryBase<Instrumento, Long > repositoryBase ) {
        super( repositoryBase );
    }



}
