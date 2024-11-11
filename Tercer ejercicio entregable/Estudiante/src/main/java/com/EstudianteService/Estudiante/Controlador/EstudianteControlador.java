package com.EstudianteService.Estudiante.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EstudianteService.Estudiante.Modelo.Estudiante;
import com.EstudianteService.Estudiante.Servicio.EstudianteServicio;


@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteControlador {

    @Autowired
    private EstudianteServicio estudianteService;

    @GetMapping("/test")
    public String test() {
        return "Esta funcionando!";
    }

    @PostMapping
    public Estudiante agregarEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteService.agregarEstudiante(estudiante);
    }

    @GetMapping("/genero/{genero}")
    public List<Estudiante> obtenerEstudiantesPorGenero(@PathVariable boolean genero) {
        return estudianteService.obtenerEstudiantesPorGenero(genero);
    }

    @GetMapping("/libreta/{libreta}")
    public Estudiante obtenerEstudiantePorLibreta(@PathVariable int libreta) {
        return estudianteService.obtenerEstudiantePorLibreta(libreta); 
    }
}
