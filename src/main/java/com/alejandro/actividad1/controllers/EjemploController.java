package com.alejandro.actividad1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.Map;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
  
    public String info(Map<String, Object> model) {

        model.put("Titulo", "Servidor en linea");
        model.put("Servidor", "Informaticonfig");
        model.put("ip", "192.168.1.1");

        return "detalles_info";
    }
}
