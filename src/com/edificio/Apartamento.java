package com.edificio;

import java.util.Arrays;

public class Apartamento {
	
	private int numApartamento;
	private String color;
	private double largo;
	private double ancho;
	private Habitacion[] habitaciones;
	private Baño[] banos;
	
	public int getNumApartamento() {
		return numApartamento;
	}
	public void setNumApartamento(int numApartamento) {
		this.numApartamento = numApartamento;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
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
	public Habitacion[] getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(Habitacion[] habitaciones) {
		this.habitaciones = habitaciones;
	}
	@Override
	public String toString() {
		return "Apartamento [numApartamento=" + numApartamento + ", color=" + color + ", largo=" + largo + ", ancho="
				+ ancho + ", habitaciones=" + Arrays.toString(habitaciones) + "]";
	}
	
}
