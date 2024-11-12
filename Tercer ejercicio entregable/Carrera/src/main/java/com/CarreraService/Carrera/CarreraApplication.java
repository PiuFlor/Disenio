package com.CarreraService.Carrera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages ="com.CarreraService.Carrera.Modelo")  // Paquete donde están las entidades
@EnableJpaRepositories(basePackages = "com.CarreraService.Carrera.Repositorio")  // Paquete del repositorio
@ComponentScan("com.CarreraService.Carrera")  // Escanea todos los componentes necesarios
public class CarreraApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarreraApplication.class, args);
    }
}
