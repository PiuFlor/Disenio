package com.CursaService.Cursa.Configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfiguracion {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    
}
