package com.example.instrumentosback.controllers;

import com.example.instrumentosback.entities.Instrumento;
import com.example.instrumentosback.services.ServiceInstrumentImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/instrumentos")
public class InstrumentController extends BaseControllerImpl<Instrumento, ServiceInstrumentImpl> {

}
