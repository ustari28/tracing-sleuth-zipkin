package com.alan.developer.testsleuth.web;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@Log
@RestController
@RequestMapping("/web")
public class ApplicationRest {

    private final Random contandor;
    private final int max = 10000;

    ApplicationRest() {
        contandor = new Random(System.currentTimeMillis());
    }

    @GetMapping("/home")
    public String home() {
        for (int i = 0; i < contandor.nextInt(max); i++) {
            log.info("Welcome");
            log.severe("No se puede encontrar el home");
        }
        return "Hello world";
    }

    @GetMapping("/external")
    public String remoteTest() {
        for (int i = 0; i < contandor.nextInt(max); i++) {
            log.info("Consulta devuelta");
            log.severe("Servicio no encontrado");
        }
        return "Ejecución con éxito";
    }
}
