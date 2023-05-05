package com.example.instrumentosback.repositories;

import com.example.instrumentosback.entities.Instrumento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RepositoryInstrument extends RepositoryBase<Instrumento, Long>{

    @Query( value = "SELECT * FROM instrumentos", nativeQuery = true)
    List<Instrumento> findAll( );

    @Query( value = "SELECT * FROM instrumentos WHERE instrumentos.id = :id", nativeQuery = true)
    Optional<Instrumento> findById(@Param("id") Long id);

}
