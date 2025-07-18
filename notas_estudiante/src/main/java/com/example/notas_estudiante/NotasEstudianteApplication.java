package com.example.notas_estudiante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotasEstudianteApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8081");  // Añade esta línea
		SpringApplication.run(NotasEstudianteApplication.class, args);
	}
}
