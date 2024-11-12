package com.CursaService.Cursa.Configuracion;


import jakarta.persistence.Column;

//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Carrera {
	
	@Id
	@Column(nullable = false)
	private int idCarrera;
	@Column(name ="NombreCarrera")
	private String NombreCarrera;
	
	public Carrera() {
    }
	
	public Carrera(int idCarrera, String NombreCarrera) {
		this.idCarrera = idCarrera;
		this.NombreCarrera = NombreCarrera;
	}
	public String getNombre() {
		return NombreCarrera;
	}
	public void setNombre(String nombre) {
		this.NombreCarrera = nombre;
	}
	public int getIdCarrera() {
		return idCarrera;
	}
	@Override
	public String toString() {
		return "Carrera [idCarrera=" + idCarrera + ", nombre=" + NombreCarrera + "]";
	}
	
	
	
}