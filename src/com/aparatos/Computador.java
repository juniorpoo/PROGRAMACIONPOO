package com.aparatos;

public class Computador extends AparatoElectronico {
	
	protected String marca;
	protected boolean recargable;
	protected boolean usoWifi;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean getRecargable() {
		return recargable;
	}
	public void setRecargable(boolean recargable) {
		this.recargable = recargable;
	}
	public boolean getUsoWifi() {
		return usoWifi;
	}
	public void setUsoWifi(boolean usoWifi) {
		this.usoWifi = usoWifi;
	}
	
	

}
