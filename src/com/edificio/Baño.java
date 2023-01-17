package com.edificio;

import java.util.Arrays;

public class Baño {

	private double largo;
	private double ancho;
	private String color;
	private boolean tieneEspejo;
	private Ventana[] ventana;
	private Puerta[] puertas;
	
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
	public Ventana[] getVentana() {
		return ventana;
	}
	public void setVentana(Ventana[] ventana) {
		this.ventana = ventana;
	}
	public Puerta[] getPuertas() {
		return puertas;
	}
	public void setPuertas(Puerta[] puertas) {
		this.puertas = puertas;
	}
	public boolean isTieneEspejo() {
		return tieneEspejo;
	}
	public void setTieneEspejo(boolean tieneEspejo) {
		this.tieneEspejo = tieneEspejo;
	}
	@Override
	public String toString() {
		return "Baño [largo=" + largo + ", ancho=" + ancho + ", color=" + color + ", tieneEspejo=" + tieneEspejo
				+ ", ventana=" + Arrays.toString(ventana) + ", puertas=" + Arrays.toString(puertas) + "]";
	}
	
	
	
}
