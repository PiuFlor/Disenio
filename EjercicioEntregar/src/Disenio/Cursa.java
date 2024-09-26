package Disenio;

import java.io.Serializable;

import java.time.LocalDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Cursa implements Serializable{
	private static final long serialVersionUID = 1L; 
	@EmbeddedId
    private CursaId id;
	
    @ManyToOne
    @MapsId("idEstudiante")  // Este es el nombre del campo en CursaId
    @JoinColumn(name = "dni")
	private Estudiante estudiante;
	
    @ManyToOne
    @MapsId("idCarrera")  // Este es el nombre del campo en idCarrera
    @JoinColumn(name = "idCarrera")
	private Carrera carrera;
	
    private LocalDate fechaInscripcion;
	private boolean egresado;
	
	public Cursa() {}
	public Cursa(Estudiante estudiante, Carrera carrera, LocalDate fechaInscripcion, boolean egresado) {
		this.estudiante = estudiante;
		this.carrera = carrera;
		this.fechaInscripcion = fechaInscripcion;
		this.egresado = egresado;
		this.id = new CursaId(estudiante.getDni(), carrera.getIdCarrera());
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	public LocalDate getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(LocalDate fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	public boolean isEgresado() {
		return egresado;
	}
	public void setEgresado(boolean egresado) {
		this.egresado = egresado;
	}
	
	@Override
	public String toString() {
		return "Cursa [estudiante=" + estudiante + ", carrera=" + carrera + ", fechaInscripcion=" + fechaInscripcion
				+ ", egresado=" + egresado + "]";
	}
	
	
}
