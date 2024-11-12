package com.EstudianteService.Estudiante.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.EstudianteService.Estudiante.Modelo.Estudiante;
import com.EstudianteService.Estudiante.Repositorio.EstudianteRepositorio;

@Service
public class EstudianteServicio {
    @Autowired
    private EstudianteRepositorio estudianteRepository;

    public Estudiante agregarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public List<Estudiante> obtenerEstudiantesPorGenero(boolean genero) {
        return estudianteRepository.findBygenero(genero);
    }

    public Estudiante obtenerEstudiantePorLibreta(int libreta) {
    return estudianteRepository.findByLibretaUniversitaria(libreta)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Estudiante no encontrado"));
    }

     public Estudiante obtenerEstudiantePorDni(int dni){
        return estudianteRepository.findByDni(dni);
    }

}
