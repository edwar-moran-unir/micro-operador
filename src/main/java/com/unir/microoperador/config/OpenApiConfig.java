package com.unir.microoperador.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(title = "Actividad 3 de Backend - UNIR", version = "1.0",
                description = "documentacion de endpoint - Software de UNIR"
        )
)
public class OpenApiConfig {
}
