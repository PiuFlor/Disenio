package com.CarreraService.Carrera.Controlador;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    @GetMapping("/nombreCarrera/{nombreCarrera}")
    public Carrera obtenerCarreraPorNombre(@PathVariable String nombreCarrera){
        return carreraService.obtenerCarreraPorNombre(nombreCarrera);
    }
}
