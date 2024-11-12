package com.EstudianteService.Estudiante;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages ="com.EstudianteService.Estudiante.Modelo")  // Paquete donde están las entidades
@EnableJpaRepositories(basePackages = "com.EstudianteService.Estudiante.Repositorio")  // Paquete del repositorio
@ComponentScan("com.EstudianteService.Estudiante")  // Escanea todos los componentes necesarios
public class EstudianteApplication {
    public static void main(String[] args) {
        SpringApplication.run(EstudianteApplication.class, args);
    }
}
