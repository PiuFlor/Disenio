package com.CursaService.Cursa.Servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.CursaService.Cursa.Configuracion.Estudiante;
import com.CursaService.Cursa.Configuracion.EstudianteCliente;
import com.CursaService.Cursa.Configuracion.Carrera;
import com.CursaService.Cursa.Configuracion.CarreraCliente;
import com.CursaService.Cursa.Modelo.Cursa;
import com.CursaService.Cursa.Repositorio.CursaRepositorio;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursaServicio {

    @Autowired
    private CursaRepositorio cursaRepository;

    @Autowired
    private EstudianteCliente estudianteClient;

    @Autowired
    private CarreraCliente carreraClient;

    public List<Estudiante> obtenerEstudiantesEgresados() {
        List<Cursa> cursasEgresados = cursaRepository.findByEgresado(true);
        List<Estudiante> estudiantesEgresados = new ArrayList<>();
        for (Cursa cursa : cursasEgresados) {
            Estudiante estudiante = estudianteClient.obtenerEstudiantePorId(cursa.getId().getDniEstudiante());
            if (estudiante != null) {
                estudiantesEgresados.add(estudiante);
            }
        }

        return estudiantesEgresados;
    }

    public List<Estudiante> findEgresadosByNombreCarrera(String nombreCarrera) {
        Carrera carrera = carreraClient.obtenerCarrerasPorNombre(nombreCarrera);
        
        if (carrera != null) {
            // Si la carrera existe, usa el idCarrera para buscar los estudiantes egresados en esa carrera
            List<Cursa> cursas = cursaRepository.findByIdIdCarreraAndEgresado(carrera.getIdCarrera(), true);
            List<Estudiante> estudiantes = new ArrayList<>();
             for (Cursa cursa : cursas) {
                 Estudiante estudiante = estudianteClient.obtenerEstudiantePorId(cursa.getId().getDniEstudiante());
                 if (estudiante != null) {
                     estudiantes.add(estudiante);
                 }
             }
     
             return estudiantes;
        } else {
            throw new RuntimeException("Carrera con nombre " + nombreCarrera + " no encontrada.");
        }
    }
}
