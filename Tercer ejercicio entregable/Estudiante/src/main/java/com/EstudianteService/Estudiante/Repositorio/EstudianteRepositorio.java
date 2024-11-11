package com.EstudianteService.Estudiante.Repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EstudianteService.Estudiante.Modelo.Estudiante;
@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Integer> {
    List<Estudiante> findBygenero(boolean genero);
    Optional<Estudiante> findByLibretaUniversitaria(int libretaUniversitaria);
}

