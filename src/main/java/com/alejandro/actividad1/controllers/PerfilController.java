package com.alejandro.actividad1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PerfilController {

    /**
     * Endpoint con controlador MVC tradicional que retorna una vista HTML renderizada con Thymeleaf,
     * siguiendo la estructura mostrada con EjemploController.java y detalles_info.html.
     */
    @GetMapping("/perfil")
    public String verPerfil(Model model) {
        model.addAttribute("titulo", "Perfil de Estudiante - AJV");
        model.addAttribute("nombreProyecto", "AJV_act1_t4");
        model.addAttribute("estudiante", "Alejandro");
        model.addAttribute("iniciales", "AJV");
        model.addAttribute("carrera", "Ingenieria de Software / Sistemas Computacionales");
        model.addAttribute("semestre", "7mo Semestre");

        List<String> materias = new ArrayList<>();
        materias.add("Desarrollo de Aplicaciones Web");
        materias.add("Arquitectura de Software");
        materias.add("Bases de Datos Distribuidas");
        materias.add("Redes y Servicios Web");
        model.addAttribute("materias", materias);

        return "perfil";
    }
}

