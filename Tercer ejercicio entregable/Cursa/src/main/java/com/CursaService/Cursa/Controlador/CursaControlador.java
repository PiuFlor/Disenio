package com.CursaService.Cursa.Controlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.CursaService.Cursa.Configuracion.Estudiante;
import com.CursaService.Cursa.Servicio.CursaServicio;
import java.util.List;

@RestController
@RequestMapping("/api/cursa")
public class CursaControlador {

    @Autowired
    private CursaServicio cursaService;

    @GetMapping("/test")
    public String test() {
        return "Esta funcionando!";
    }

    @GetMapping("/egresados/{nombreCarrera}")
    public List<Estudiante> getEgresadosByNombreCarrera(@PathVariable String nombreCarrera) {
        return cursaService.findEgresadosByNombreCarrera(nombreCarrera);
    }

    @GetMapping("/estudiantes-egresados")
    public List<Estudiante> obtenerEstudiantesEgresados() {
        return cursaService.obtenerEstudiantesEgresados();
    }

}

