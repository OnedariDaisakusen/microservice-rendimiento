package com.core.rest.controller;

import com.core.rest.model.ResponseTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Random;

@RestController
public class ResponseTimeController {
    @GetMapping("/response-time")
    public ResponseTime simulateResponseTime() throws InterruptedException {
        // Simular tiempo de respuesta aleatorio entre 1 y 5 segundos
        Random random = new Random();
        int randomTime = 1 + random.nextInt(5); // Genera un número entre 1 y 5
        LocalDateTime startTime = LocalDateTime.now();
        Thread.sleep(randomTime * 1000); // Espera por el tiempo aleatorio

        // Crear objeto con los detalles de la respuesta
        LocalDateTime endTime = LocalDateTime.now();

        return new ResponseTime(randomTime + " segundos", startTime.toString(), endTime.toString());
    }
}
