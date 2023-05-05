package com.example.instrumentosback.services;

import com.example.instrumentosback.entities.Instrumento;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ServiceInstrument extends ServiceBase<Instrumento, Long>{

    List<Instrumento> findAll() throws Exception;

    Instrumento findById(@Param("id") Long id) throws Exception;

}
