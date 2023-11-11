package com.example.demo;

import com.example.demo.model.EmpleadosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadosRepository extends JpaRepository<EmpleadosEntity, Long> {
    // Puedes agregar métodos personalizados aquí
}
