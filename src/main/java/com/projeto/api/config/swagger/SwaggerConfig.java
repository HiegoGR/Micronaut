package com.projeto.api.config.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Micronaut API",
                version = "1.0.0",
                description = "API de estudos com Micronaut"
        )
)
public class SwaggerConfig {
}
