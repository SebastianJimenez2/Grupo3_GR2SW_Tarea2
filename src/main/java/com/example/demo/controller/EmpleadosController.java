package com.example.demo.controller;

import com.example.demo.EmpleadosRepository;
import com.example.demo.model.EmpleadosEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpleadosController {

    @Autowired
    private EmpleadosRepository empleadosRepository;

    @GetMapping("/")
    public String mostrarFormulario(Model model) {
        model.addAttribute("empleado", new EmpleadosEntity());
        return "index";
    }

    @PostMapping("/guardar-empleado")
    public String guardarEmpleado(@RequestParam String nombre, @RequestParam String apellido, @RequestParam String edad) {
        EmpleadosEntity empleado = new EmpleadosEntity();
        int ID = (int) (Math.random() * (100 - 1 + 1)) + 1;
        empleado.setId(ID);
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setEdad(Integer.parseInt(edad));

        empleadosRepository.save(empleado);

        return "formulario-exitoso"; // Página a mostrar después de guardar
    }
}
