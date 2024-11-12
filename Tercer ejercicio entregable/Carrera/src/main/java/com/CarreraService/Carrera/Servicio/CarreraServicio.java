package com.CarreraService.Carrera.Servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.CarreraService.Carrera.Modelo.Carrera;
import com.CarreraService.Carrera.Repositorio.CarreraRepositorio;

@Service
public class CarreraServicio {
    @Autowired
    private CarreraRepositorio carreraRepository;

    public Carrera obtenerCarreraPorId(int id){
        return carreraRepository.findByIdCarrera(id);
    }

    public Carrera obtenerCarreraPorNombre(String nombreCarrera){
        return carreraRepository.findByNombreCarrera(nombreCarrera);
    }
}
