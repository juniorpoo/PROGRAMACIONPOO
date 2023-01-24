package com.edificio;

public class Persona {
	
	private String nombre;
	private String apellido;
	private int edad;
	private int numcedula;
	private  String estadoCivil;
	private String ocupacion;
	
	
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
	public int getCedula() {
		return numcedula;
	}
	public void setCedula(int cedula) {
		this.numcedula = cedula;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", numcedula=" + numcedula
				+ ", estadoCivil=" + estadoCivil + ", ocupacion=" + ocupacion + "]";
	}
	
	
}
