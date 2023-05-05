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

    @Autowired
    private RepositoryInstrument repositoryInstrument;

    @Override
    public List<Instrumento> findAll() throws Exception {
        try{
            List<Instrumento> instrumentos = repositoryInstrument.findAll();
            return instrumentos;
        }catch (Exception e){
            log.info(e.getMessage(),e);
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Instrumento findById(Long id) throws Exception {
        try{
            Optional<Instrumento> instrumento = repositoryInstrument.findById(id);
            return instrumento.get();
        }catch (Exception e){
            log.info(e.getMessage(),e);
            throw new Exception(e.getMessage());
        }
    }


}
