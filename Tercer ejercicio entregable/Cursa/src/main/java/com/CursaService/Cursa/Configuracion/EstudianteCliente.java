package com.CursaService.Cursa.Configuracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EstudianteCliente {

    @Autowired
    private RestTemplate restTemplate;

    private final String ESTUDIANTE_SERVICE_URL = "http://localhost:8081/api/estudiantes";

    public Estudiante obtenerEstudiantePorId(int estudianteId) {
        String url = ESTUDIANTE_SERVICE_URL + "/dni/" + estudianteId;
        ResponseEntity<Estudiante> response = restTemplate.getForEntity(url, Estudiante.class);
        return response.getBody();
    }
}

