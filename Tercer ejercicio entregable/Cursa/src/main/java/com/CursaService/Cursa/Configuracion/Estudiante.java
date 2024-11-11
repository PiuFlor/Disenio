package com.CursaService.Cursa.Configuracion;

import java.time.LocalDate;



public class Estudiante {
    private int dni;
    private int libretaUniversitaria;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private boolean genero; // true para masculino, false para femenino
    private String ciudadResidencia;
	
	public Estudiante() {
    }
	
	// Constructor
	public Estudiante(int dni, int libretaUniversitaria, String nombre, String apellido, LocalDate fechaNacimiento,
			boolean genero, String ciudadResidencia) {
		this.dni = dni;
		this.libretaUniversitaria = libretaUniversitaria;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.ciudadResidencia = ciudadResidencia;
	}

	// Getters y Setters
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getLibretaUniversitaria() {
		return libretaUniversitaria;
	}

	public void setLibretaUniversitaria(int libretaUniversitaria) {
		this.libretaUniversitaria = libretaUniversitaria;
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}

	public String getCiudadResidencia() {
		return ciudadResidencia;
	}

	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}

	@Override
	public String toString() {
		return "Estudiante{" + "dni=" + dni + ", libretaUniversitaria=" + libretaUniversitaria + ", nombre='" + nombre
				+ '\'' + ", apellido='" + apellido + '\'' + ", fechaNacimiento=" + fechaNacimiento + ", genero="
				+ (genero ? "Masculino" : "Femenino") + ", ciudadResidencia='" + ciudadResidencia + '\'' + '}';
	}
}
