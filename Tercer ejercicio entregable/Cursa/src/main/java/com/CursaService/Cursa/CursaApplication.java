package com.CursaService.Cursa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages ="com.CursaService.Cursa.Modelo")  // Paquete donde están las entidades
@EnableJpaRepositories(basePackages = "com.CursaService.Cursa.Repositorio")  // Paquete del repositorio
@ComponentScan("com.CursaService.Cursa")  // Escanea todos los componentes necesarios
public class CursaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursaApplication.class, args);
	}

}
