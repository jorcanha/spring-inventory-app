package spring.app.inventory.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @Tag(name = "Saludo", description = "Operaciones relacionadas con los saludos")
    @RestController
    public class HelloController {

        @Operation(summary = "Saluda al mundo")
        @ApiResponse(responseCode = "200", description = "Devuelve un saludo")
        @GetMapping("/hello")
        public String hello() {
            return "¡Hola, mundo!";
        }
    }

