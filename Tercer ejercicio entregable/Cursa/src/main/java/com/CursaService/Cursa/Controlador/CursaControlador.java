package com.CursaService.Cursa.Controlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.CursaService.Cursa.Modelo.Cursa;
import com.CursaService.Cursa.Servicio.CursaServicio;

import java.util.List;

@RestController
@RequestMapping("/api/cursa")
public class CursaControlador {

    @Autowired
    private CursaServicio cursaService;
    
    /*
    @PostMapping("/inscribir")
    public ResponseEntity<Cursa> inscribirEstudiante(@RequestParam Long estudianteId,
                                                     @RequestBody Cursa cursa) {
        return ResponseEntity.ok(cursaService.inscribirEstudiante(estudianteId, cursa));
    }*/

    @GetMapping("/test")
    public String test() {
        return "Esta funcionando!";
    }

    @GetMapping("/carrera/{carrera}")
    public List<Cursa> obtenerCursasPorCarrera(@PathVariable String carrera) {
        return cursaService.obtenerCursasPorCarrera(carrera);
    }
    /*
    @GetMapping("/estudiante/{estudianteId}")
    public List<Cursa> obtenerCursasPorEstudiante(@PathVariable int estudianteId) {
        return cursaService.obtenerCursasPorEstudiante(estudianteId);
    }*/
}

