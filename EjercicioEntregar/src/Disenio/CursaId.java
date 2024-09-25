package Disenio;


import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class CursaId implements Serializable {
	private static final long serialVersionUID = 1L;
	
    private int idEstudiante;
    private int idCarrera;

    // Constructores, getters y setters
    public CursaId() {}

    public CursaId(int idEstudiante, int idCarrera) {
        this.idEstudiante = idEstudiante;
        this.idCarrera = idCarrera;
    }

    // Equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CursaId cursaId = (CursaId) o;
        return idEstudiante == cursaId.idEstudiante && idCarrera == cursaId.idCarrera;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEstudiante, idCarrera);
    }
}
