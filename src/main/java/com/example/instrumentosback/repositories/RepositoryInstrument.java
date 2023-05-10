package com.example.instrumentosback.repositories;

import com.example.instrumentosback.entities.Instrumento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RepositoryInstrument extends RepositoryBase<Instrumento, Long>{



}
