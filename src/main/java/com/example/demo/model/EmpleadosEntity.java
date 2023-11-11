package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "empleados", schema = "public", catalog = "postgres")
public class EmpleadosEntity {
    @Id
    @Basic
    @Column(name = "id", nullable = true)
    private Integer id;
    @Basic
    @Column(name = "nombre", nullable = true, length = 50)
    private String nombre;
    @Basic
    @Column(name = "apellido", nullable = true, length = 50)
    private String apellido;
    @Basic
    @Column(name = "edad", nullable = true)
    private Integer edad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmpleadosEntity that = (EmpleadosEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (apellido != null ? !apellido.equals(that.apellido) : that.apellido != null) return false;
        if (edad != null ? !edad.equals(that.edad) : that.edad != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (edad != null ? edad.hashCode() : 0);
        return result;
    }
}
