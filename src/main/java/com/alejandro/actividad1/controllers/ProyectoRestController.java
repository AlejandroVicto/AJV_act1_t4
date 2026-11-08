package com.alejandro.actividad1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProyectoRestController {

    /**
     * Endpoint a) Regresa el nombre del proyecto, iniciales y datos del servidor
     * para identificar fácilmente de quién es la instancia corriendo en el servidor.
     */
    @GetMapping("/api/proyecto")
    public Map<String, Object> infoProyecto() {
        Map<String, Object> info = new HashMap<>();
        info.put("proyecto", "AJV_act1_t4");
        info.put("desarrollador", "Alejandro");
        info.put("iniciales", "AJV");
        info.put("asignatura", "Desarrollo Backend / Tema 4");
        info.put("servidor", "Spring Boot 4");
        info.put("puerto", 8082);
        info.put("estado", "Activo y en linea");
        return info;
    }

    /**
     * Endpoint c) Regresa otro tipo de respuesta: Texto plano (String).
     */
    @GetMapping("/api/saludo")
    public String saludo() {
        return "¡Hola! Servidor de Alejandro (AJV_act1_t4) corriendo exitosamente en Spring Boot.";
    }

    /**
     * Endpoint c) Regresa otro tipo de respuesta: Número entero (int).
     */
    @GetMapping("/api/version")
    public int version() {
        return 1;
    }
}

