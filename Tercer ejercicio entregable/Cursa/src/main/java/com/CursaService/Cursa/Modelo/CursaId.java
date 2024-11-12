package com.CursaService.Cursa.Modelo;

import java.io.Serializable;
import jakarta.persistence.Embeddable;

@Embeddable
public class CursaId implements Serializable {
    private int dniEstudiante;
    private int idCarrera;

    
    public CursaId() {}

    public CursaId(int dniEstudiante, int idCarrera) {
        this.dniEstudiante = dniEstudiante;
        this.idCarrera = idCarrera;
    }

    public int getDniEstudiante() {
        return dniEstudiante;
    }

    public void setDniEstudiante(int dniEstudiante) {
        this.dniEstudiante = dniEstudiante;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CursaId cursaId = (CursaId) o;

        if (dniEstudiante != cursaId.dniEstudiante) return false;
        return idCarrera == cursaId.idCarrera;
    }

    @Override
    public int hashCode() {
        int result = dniEstudiante;
        result = 31 * result + idCarrera;
        return result;
    }
}

