package com.edificio;

import java.util.Arrays;

public class Apartamento {
	
	public Apartamento() {}
	
	public Apartamento(int numApartamento) {
		this.numApartamento=numApartamento;
	}
	
	public Apartamento(int numApartamento,String color) {
		this(numApartamento);
		this.color=color;
	}
	
	public  Apartamento(int numApartamento,String color,double largo) {
		this(numApartamento,color);
		this.largo=largo;
	}
	
	public Apartamento(int numApartamento,String color,double largo,double ancho) {
		this(numApartamento,color,largo);
		this.ancho=ancho;
	}
	
	public Apartamento(int numApartamento,String color,double largo, double ancho,Habitacion[]hab) {
		this(numApartamento,color,largo,ancho);
		this.hab=hab;
	}
	
	public Apartamento(int numApartamento,String color,double largo,double ancho,Habitacion[]hab,Baño[]banos) {
		this(numApartamento,color,largo,ancho,hab);
		this.banos=banos;
	}
	
	
	
	private int numApartamento;
	private String color;
	private double largo;
	private double ancho;
	private Habitacion[] hab;
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
		return hab;
	}
	public void setHabitaciones(Habitacion[] habitaciones) {
		this.hab = habitaciones;
	}
	@Override
	public String toString() {
		return "Apartamento [numApartamento=" + numApartamento + ", color=" + color + ", largo=" + largo + ", ancho="
				+ ancho + ", habitaciones=" + Arrays.toString(hab) + "]";
	}
	
}
