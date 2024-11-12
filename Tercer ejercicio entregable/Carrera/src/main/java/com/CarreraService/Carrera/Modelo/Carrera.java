package com.CarreraService.Carrera.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Carrera {
	
	@Id
	@Column(nullable = false)
	private int idCarrera;
	@Column(name ="NombreCarrera")
	private String nombreCarrera;
	
	public Carrera() {
    }
	
	public Carrera(int idCarrera, String nombreCarrera) {
		this.idCarrera = idCarrera;
		this.nombreCarrera = nombreCarrera;
	}
	public String getNombre() {
		return nombreCarrera;
	}
	public void setNombre(String nombre) {
		this.nombreCarrera = nombre;
	}
	public int getIdCarrera() {
		return idCarrera;
	}
	@Override
	public String toString() {
		return "Carrera [idCarrera=" + idCarrera + ", nombre=" + nombreCarrera + "]";
	}	
}