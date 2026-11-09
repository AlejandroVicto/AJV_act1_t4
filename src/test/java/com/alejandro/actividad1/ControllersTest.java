package com.alejandro.actividad1;

import com.alejandro.actividad1.controllers.EstudianteRestController;
import com.alejandro.actividad1.controllers.PerfilController;
import com.alejandro.actividad1.controllers.ProyectoRestController;
import org.junit.jupiter.api.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ControllersTest {

    @Test
    void testProyectoRestController() {
        ProyectoRestController controller = new ProyectoRestController();
        Map<String, Object> info = controller.infoProyecto();
        assertEquals("AJV_act1_t4", info.get("proyecto"));
        assertEquals("AJV", info.get("iniciales"));
        assertEquals("Alejandro", info.get("desarrollador"));

        String saludo = controller.saludo();
        assertTrue(saludo.contains("AJV_act1_t4"));

        int version = controller.version();
        assertEquals(1, version);
    }

    @Test
    void testEstudianteRestController() {
        EstudianteRestController controller = new EstudianteRestController();
        Map<String, Object> estudiante = controller.obtenerEstudiante();
        assertEquals("Alejandro", estudiante.get("nombre"));
        assertEquals("AJV", estudiante.get("iniciales"));

        List<Map<String, Object>> materias = controller.listarMaterias();
        assertFalse(materias.isEmpty());
        assertEquals(4, materias.size());

        Double promedio = controller.obtenerPromedio();
        assertEquals(8.6, promedio);
    }

    @Test
    void testPerfilController() {
        PerfilController controller = new PerfilController();
        Model model = new ConcurrentModel();
        String viewName = controller.verPerfil(model);

        assertEquals("perfil", viewName);
        assertEquals("AJV_act1_t4", model.getAttribute("nombreProyecto"));
        assertEquals("AJV", model.getAttribute("iniciales"));
        assertNotNull(model.getAttribute("materias"));
    }
}

