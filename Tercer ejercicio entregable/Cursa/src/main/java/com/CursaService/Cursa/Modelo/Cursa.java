package com.CursaService.Cursa.Modelo;
import jakarta.persistence.*;
import java.time.LocalDate;


import java.io.Serializable;

@Entity
public class Cursa implements Serializable {

    @EmbeddedId
    private CursaId id;
    private boolean egresado;
    private LocalDate fechaIngreso;

    public Cursa() {}

    public Cursa(CursaId id, boolean egresado, LocalDate fechaIngreso) {
        this.id = id;
        this.egresado = egresado;
        this.fechaIngreso = fechaIngreso;
    }

    // Getters y Setters
    public CursaId getId() {
        return id;
    }

    public void setId(CursaId id) {
        this.id = id;
    }

    public boolean isEgresado() {
        return egresado;
    }

    public void setEgresado(boolean egresado) {
        this.egresado = egresado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }


    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

}

