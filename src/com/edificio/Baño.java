package com.edificio;

import java.util.Arrays;

public class Baño {
	
	public Baño() {}

	public Baño(double largo) {
		this.largo=largo;
	}
	
	public Baño(double largo,double ancho) {
		this(largo);
		this.ancho=ancho;
	}
	
	public Baño(double largo,double ancho,String color) {
		this(largo,ancho);
		this.color=color;
	}
	
	public Baño(double largo,double ancho,String color,boolean tieneEspejo) {
		this(largo,ancho,color);
		this.tieneEspejo=tieneEspejo;
	}
	
	public Baño(double largo, double ancho, String color, boolean tieneEspejo,Ventana[]vent) {
		this(largo,ancho,color,tieneEspejo);
		this.ventana=vent;
	}
	
	public Baño(double largo,double ancho, String color,boolean tieneEspejo,Ventana[]vent,Puerta[]puertas) {
		this(largo,ancho,color,tieneEspejo,vent);
		this.puertas=puertas;
	}
	
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
