package com.CursaService.Cursa.Modelo;

import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
public class Cursa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    //@Column(name = "estudiante_id", nullable = true)
    private int dniEstudiante; // Relación con la entidad Estudiante

    public int getDniEstudiante() {
        return dniEstudiante;
    }

    public void setDniEstudiante(int dniEstudiante) {
        this.dniEstudiante = dniEstudiante;
    }

    private String carrera;
    private LocalDate fechaInscripcion;
    private Boolean graduado;

    // Constructores
    public Cursa() {}

    /* public Cursa(Estudiante estudiante, String carrera, LocalDate fechaInscripcion, Boolean graduado) {
        this.estudiante = estudiante;
        this.carrera = carrera;
        this.fechaInscripcion = fechaInscripcion;
        this.graduado = graduado;
    }
 */
    public Cursa(int id,String carrera, LocalDate fechaInscripcion, Boolean graduado) {
        //this.estudiante = estudiante;
        this.id = id;
        this.carrera = carrera;
        this.fechaInscripcion = fechaInscripcion;
        this.graduado = graduado;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
/*
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }*/

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public Boolean getGraduado() {
        return graduado;
    }

    public void setGraduado(Boolean graduado) {
        this.graduado = graduado;
    }
}
