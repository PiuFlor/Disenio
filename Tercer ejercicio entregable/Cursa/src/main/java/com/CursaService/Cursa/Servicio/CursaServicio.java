package com.CursaService.Cursa.Servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.CursaService.Cursa.Configuracion.Estudiante;
import com.CursaService.Cursa.Configuracion.EstudianteCliente;
import com.CursaService.Cursa.Modelo.Cursa;
import com.CursaService.Cursa.Repositorio.CursaRepositorio;

import java.util.List;

@Service
public class CursaServicio {

    @Autowired
    private CursaRepositorio cursaRepository;

    //private EstudianteRepositorio estudianteRepositorio;

    @Autowired
    private EstudianteCliente estudianteClient;

    
    public Cursa inscribirEstudiante(int estudianteId, Cursa cursa) {
        Estudiante estudiante = estudianteClient.obtenerEstudiantePorId(estudianteId);
        
        if (estudiante != null) {
            //cursa.setEstudianteId(estudianteId);
            return cursaRepository.save(cursa);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Estudiante no encontrado");
        }
    }

    public List<Cursa> obtenerCursasPorCarrera(String carrera) {
        return cursaRepository.findByCarrera(carrera);
    }
    /*   public List<Cursa> obtenerCursasPorEstudiante(int estudianteId) {
        return cursaRepository.findByEstudianteId(estudianteId);
    }*/
}
