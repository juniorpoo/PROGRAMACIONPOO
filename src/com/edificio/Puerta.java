package com.edificio;

public class Puerta {
	
	private String color;
	private double ancho;
	private double largo;
	private String material;
	
	
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
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "Puerta [color=" + color + ", ancho=" + ancho + ", largo=" + largo + ", material=" + material + "]";
	}
	
	

}
