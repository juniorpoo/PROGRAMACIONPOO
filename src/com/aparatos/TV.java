package com.aparatos;

public class TV extends AparatoElectronico {
	
	protected String tipoPantalla;
	protected int pulgadas;
	protected String marca;
	protected String controlRemoto;
	
	public String getTipoPantalla() {
		return tipoPantalla;
	}
	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
	}
	public int getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getControlRemoto() {
		return controlRemoto;
	}
	public void setControlRemoto(String controlRemoto) {
		this.controlRemoto = controlRemoto;
	}
	
	

}
