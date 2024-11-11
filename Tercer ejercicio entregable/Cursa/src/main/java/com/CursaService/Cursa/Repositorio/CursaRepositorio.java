package com.CursaService.Cursa.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CursaService.Cursa.Modelo.Cursa;

import java.util.List;

@Repository
public interface CursaRepositorio extends JpaRepository<Cursa, Integer> {
    List<Cursa> findByCarrera(String carrera);
    //List<Cursa> findByEstudianteId(int estudianteId); // Buscar carreras por estudiante
}
