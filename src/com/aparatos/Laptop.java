package com.aparatos;

public class Laptop extends AparatoElectronico{
	
	protected String recargable;
	protected String camara;
	protected String marca;
	protected String usoWifi;
	
	
	public String getRecargable() {
		return recargable;
	}
	public void setRecargable(String recargable) {
		this.recargable = recargable;
	}
	public String getCamara() {
		return camara;
	}
	public void setCamara(String camara) {
		this.camara = camara;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getUsoWifi() {
		return usoWifi;
	}
	public void setUsoWifi(String usoWifi) {
		this.usoWifi = usoWifi;
	}
	

}
