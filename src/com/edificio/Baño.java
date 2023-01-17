package com.edificio;

public class Baño {

	private double largo;
	private double ancho;
	private String color;
	private boolean espejo;
	private int numVentanas;
	private int numPuertas;
	
	
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isEspejo() {
		return espejo;
	}
	public void setEspejo(boolean espejo) {
		this.espejo = espejo;
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
		return "Baño: [largo=" + largo + ", ancho=" + ancho + ", color=" + color + ", espejo=" + espejo
				+ ", numero de Ventanas=" + numVentanas + ", numero de Puertas=" + numPuertas + "]";
	}
	
	
}
