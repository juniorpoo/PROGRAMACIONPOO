package com.edificio;

public class Ventana {
	
	
	// constructor por defecto.
	public Ventana() {}
	
	public Ventana(String c) {
		this.color = c;
	}
	public Ventana(String col, String mat) {
		this(col);
		this.material = mat;
	}
	
	public Ventana(String col, String mat,double lar) {
		this(col, mat);
		largo = lar;
	}
	
	public Ventana(String col, String mat,double lar, double anc) {
		this(col, mat, lar);
		this.ancho=anc;
	}
	
	
	private String color;
	private String material;
	private double largo;
	private double ancho;
	
	
	public String getColor() {
		
		this.calcularAlgo();
		this.calcularAlgo1();
		
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
	
	private void calcularAlgo() {
		
	}
	
	protected void calcularAlgo1() {
		
	}

}
