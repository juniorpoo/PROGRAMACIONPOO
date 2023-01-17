package com.edificio;

public class Habitacion {
	
	private String color;
	private double ancho;
	private double largo;
	private int numVentanas;
	private int numPuertas;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public int getNumVentanas() {
		return numVentanas;
	}
	public void setNumVentanas(int numVentanas) {
		this.numVentanas = numVentanas;
	}
	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	@Override
	public String toString() {
		return "Habitacion: [color=" + color + ", ancho=" + ancho + ", largo=" + largo + ", numVentanas=" + numVentanas
				+ ", numPuertas=" + numPuertas + "]";
	}
	
	
	
	

}
