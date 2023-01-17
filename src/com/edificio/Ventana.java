package com.edificio;

public class Ventana {
	
	private String color;
	private String material;
	private double largo;
	private double ancho;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
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
	@Override
	public String toString() {
		return "Ventana [color=" + color + ", material=" + material + ", largo=" + largo + ", ancho=" + ancho + "]";
	}
	
	

}
