package com.CarreraService.Carrera.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CarreraService.Carrera.Modelo.Carrera;
import com.CarreraService.Carrera.Servicio.CarreraServicio;


@RestController
@RequestMapping("/api/carreras")
public class CarreraControlador {

    @Autowired
    private CarreraServicio carreraService;

    @GetMapping("/test")
    public String test() {
        return "Esta funcionando!";
    }

    @GetMapping("/id/{id}")
    public Carrera obtenerCarreraPorId(@PathVariable int id){
        return carreraService.obtenerCarreraPorId(id);
    }
/*
    @PostMapping
    public Carrera agregarEstudiante(@RequestBody Carrera estudiante) {
        return estudianteService.agregarEstudiante(estudiante);
    }

    @GetMapping("/dni/{dni}")
    public Carrera obtenerEstudiantePorDni(@PathVariable int dni){
        return estudianteService.obtenerEstudiantePorDni(dni);
    }


    @GetMapping("/genero/{genero}")
    public List<Carrera> obtenerEstudiantesPorGenero(@PathVariable boolean genero) {
        return estudianteService.obtenerEstudiantesPorGenero(genero);
    }

    @GetMapping("/libreta/{libreta}")
    public Carrera obtenerEstudiantePorLibreta(@PathVariable int libreta) {
        return estudianteService.obtenerEstudiantePorLibreta(libreta); 
    }*/
}
