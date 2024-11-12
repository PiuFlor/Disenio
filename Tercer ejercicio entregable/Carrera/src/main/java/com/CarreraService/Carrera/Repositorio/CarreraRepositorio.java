package com.CarreraService.Carrera.Repositorio;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CarreraService.Carrera.Modelo.Carrera;
@Repository
public interface CarreraRepositorio extends JpaRepository<Carrera, Integer> {
    Carrera findByIdCarrera(int id);
    Carrera findByNombreCarrera(String nombreCarrera);
}

