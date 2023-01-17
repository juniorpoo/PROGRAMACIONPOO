package com.edificio;

public class Apartamento {
	
	private int numApartamento;
	private String color;
	private double largo;
	private double ancho;
	private int  numHabitaciones;
	
	
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
	public int  getNumHabitaciones() {
		return numHabitaciones;
	}
	public void setNumHabitaciones(int  numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}
	@Override
	public String toString() {
		return "Apartamento: [numero de Apartamento=" + numApartamento + ", color=" + color + ", largo=" + largo + ", ancho="
				+ ancho + ", numero de Habitaciones=" + numHabitaciones + "]";
	}
	
	

}
