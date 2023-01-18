package com.edificio;

import java.util.Arrays;

public class Habitacion {
	
	private String color;
	private double ancho;
	private double largo;
	private Puerta[] puertas;
	private Baño bano;
	private Ventana[] ventanas;
	
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
	
	public Puerta[] getPuertas() {
		return puertas;
	}
	public void setPuertas(Puerta[] puertas) {
		this.puertas = puertas;
	}
	public Baño getBano() {
		return bano;
	}
	public void setBano(Baño bano) {
		this.bano = bano;
	}
	public Ventana[] getVentanas() {
		return ventanas;
	}
	public void setVentanas(Ventana[] ventanas) {
		this.ventanas = ventanas;
	}
	@Override
	public String toString() {
		return "Habitacion [color=" + color + ", ancho=" + ancho + ", largo=" + largo + ", puertas="
				+ Arrays.toString(puertas) + ", bano=" + bano + ", ventanas=" + Arrays.toString(ventanas) + "]";
	}
	
}
