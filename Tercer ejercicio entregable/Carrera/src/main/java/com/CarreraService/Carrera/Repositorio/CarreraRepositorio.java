package com.CarreraService.Carrera.Repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CarreraService.Carrera.Modelo.Carrera;
@Repository
public interface CarreraRepositorio extends JpaRepository<Carrera, Integer> {
    Carrera findByIdCarrera(int id);
}

