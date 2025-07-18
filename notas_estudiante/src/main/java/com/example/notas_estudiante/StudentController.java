package com.example.notas_estudiante;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    // Endpoint de saludo (existente)
    @GetMapping("/saludo")
    public String saludo() {
        return "¡Endpoint funcionando correctamente!";
    }

    // Endpoint para calcular promedio (nuevo)
    @GetMapping("/promedio/{id}")
    public String calcularPromedio(
            @PathVariable String id,
            @RequestParam double nota1,
            @RequestParam double nota2,
            @RequestParam double nota3) {

        double promedio = (nota1 + nota2 + nota3) / 3;
        // Formateamos el resultado a 2 decimales
        return String.format("Estudiante %s: promedio = %.2f", id, promedio);
    }
}