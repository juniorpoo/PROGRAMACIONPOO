package com.edificio;

import java.util.Arrays;

public class Edificio {
	
	private String material;
	private String color;
	private double largo;
	private double ancho;
	Apartamento apartamento[];
	
	public  String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
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
	
	public Apartamento[] getApartamento() {
		return apartamento;
	}
	public void setApartamento(Apartamento[] apartamento) {
		this.apartamento = apartamento;
	}
	@Override
	public String toString() {
		return "Edificio [material=" + material + ", color=" + color + ", largo=" + largo + ", ancho=" + ancho
				+ ", apartamento=" + Arrays.toString(apartamento) + "]";
	}
	
	
	
	
}
