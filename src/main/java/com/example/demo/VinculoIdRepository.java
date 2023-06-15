package com.example.demo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VinculoIdRepository extends JpaRepository <Vinculo, Integer>{
    @Query(value = "SELECT menuid,descripcion,url,menuPadreId,posicion FROM usuarios.vinculo", nativeQuery = true)
    public List<Vinculo> findAll(String menuid);
}
