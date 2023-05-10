package com.example.instrumentosback.controllers;

import com.example.instrumentosback.entities.Instrumento;
import com.example.instrumentosback.services.ServiceInstrument;
import com.example.instrumentosback.services.ServiceInstrumentImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@Slf4j
@RequestMapping(path = "/api/instrumentos")
public class InstrumentController extends BaseControllerImpl<Instrumento, ServiceInstrumentImpl> {

    /*@Autowired
    private ServiceInstrument serviceInstrument;

    @GetMapping(value = "/instrumentos")
    public List<Instrumento> getInstrumentos() throws Exception {
        List<Instrumento> instrumentos;
        try{
            instrumentos = serviceInstrument.findAll();
        }catch (Exception e){
            log.info(e.getMessage(),e);
            throw new Exception(e.getMessage());
        }
        return instrumentos;
    }

    @GetMapping(value = "/instrumentos/{id}")
    public Instrumento getDetails(@PathVariable("id") Long id) throws Exception{
        Instrumento instrumento;
        try{
            instrumento = this.serviceInstrument.findById(id);
        }catch (Exception e){
            log.info(e.getMessage(),e);
            throw new Exception(e.getMessage());
        }
        return instrumento;
    }
*/
}
