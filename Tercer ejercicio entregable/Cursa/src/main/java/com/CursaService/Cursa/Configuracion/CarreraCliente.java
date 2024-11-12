package com.CursaService.Cursa.Configuracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CarreraCliente {

    @Autowired
    private RestTemplate restTemplate;

    private final String CARRERA_SERVICE_URL = "http://localhost:8082/api/carreras";

    public Carrera obtenerCarreraPorId(int carreraId) {
        String url = CARRERA_SERVICE_URL + "/" + carreraId;
        ResponseEntity<Carrera> response = restTemplate.getForEntity(url, Carrera.class);
        return response.getBody();
    }
}

