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


    private LocalDate fechaInscripcion;
	private boolean egresado;
    private String carrera;


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
        this.egresado = graduado;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public int getDniEstudiante() {
        return dniEstudiante;
    }

    public void setDniEstudiante(int dniEstudiante) {
        this.dniEstudiante = dniEstudiante;
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
        return egresado;
    }

    public void setEgresado(Boolean graduado) {
        this.egresado = graduado;
    }
}
