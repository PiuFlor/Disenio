package Disenio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Carrera {
	
	@Id
	@Column(nullable = false)
	private int idCarrera;
	@Column(name ="NombreCarrera")
	private String nombre;
	
	// Constructor sin parámetros (obligatorio para Hibernate)
    public Carrera() {
    }
	
	public Carrera(int idCarrera, String nombre) {
		this.idCarrera = idCarrera;
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdCarrera() {
		return idCarrera;
	}
	@Override
	public String toString() {
		return "Carrera [idCarrera=" + idCarrera + ", nombre=" + nombre + "]";
	}
	
	
	
}
