package com.alejandro.actividad1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EstudianteRestController {

    /**
     * Endpoint a) Regresa datos personales.
     */
    @GetMapping("/api/estudiante")
    public Map<String, Object> obtenerEstudiante() {
        Map<String, Object> estudiante = new HashMap<>();
        estudiante.put("nombre", "Alejandro");
        estudiante.put("iniciales", "AJV");
        estudiante.put("matricula", "23160968");
        estudiante.put("carrera", "Ingenieria de Software / Sistemas Computacionales");
        estudiante.put("semestre", 7);
        estudiante.put("promedio", 8.6);
        return estudiante;
    }

    /**
     * Endpoint b) Regresa información de una lista simulada (listado de materias).
     */
    @GetMapping("/api/materias")
    public List<Map<String, Object>> listarMaterias() {
        List<Map<String, Object>> materias = new ArrayList<>();

        Map<String, Object> m1 = new HashMap<>();
        m1.put("id", 1);
        m1.put("codigo", "DAW-401");
        m1.put("nombre", "Desarrollo de Aplicaciones Web");
        m1.put("creditos", 8);
        m1.put("profesor", "Dr. Martinez");
        materias.add(m1);

        Map<String, Object> m2 = new HashMap<>();
        m2.put("id", 2);
        m2.put("codigo", "ASW-402");
        m2.put("nombre", "Arquitectura de Software");
        m2.put("creditos", 7);
        m2.put("profesor", "Mtra. Gomez");
        materias.add(m2);

        Map<String, Object> m3 = new HashMap<>();
        m3.put("id", 3);
        m3.put("codigo", "BDD-403");
        m3.put("nombre", "Bases de Datos Distribuidas");
        m3.put("creditos", 8);
        m3.put("profesor", "Ing. Hernandez");
        materias.add(m3);

        Map<String, Object> m4 = new HashMap<>();
        m4.put("id", 4);
        m4.put("codigo", "RED-404");
        m4.put("nombre", "Redes y Servicios Web");
        m4.put("creditos", 6);
        m4.put("profesor", "Lic. Flores");
        materias.add(m4);

        return materias;
    }

    /**
     * Endpoint c) Regresa otro tipo de respuesta: Número decimal (Double).
     */
    @GetMapping("/api/promedio")
    public Double obtenerPromedio() {
        return 8.6;
    }
}
