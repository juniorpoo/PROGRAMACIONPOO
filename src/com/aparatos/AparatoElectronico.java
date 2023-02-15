package com.aparatos;

public class AparatoElectronico {
	
	protected String color;
	protected double largo;
	protected double ancho;
	protected String material;
	protected double peso;
	
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
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "AparatoElectronico [color=" + color + ", largo=" + largo + ", ancho=" + ancho + ", material=" + material
				+ ", peso=" + peso + "]";
	}
	
	
	
	

}
