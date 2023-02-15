package com.aparatos;

public class Calculadora extends AparatoElectronico{

	protected String tipoTeclado;
	protected String tipoPantalla;
	
	public String getTipoTeclado() {
		return tipoTeclado;
	}
	public void setTipoTeclado(String tipoTeclado) {
		this.tipoTeclado = tipoTeclado;
	}
	public String getTipoPantalla() {
		return tipoPantalla;
	}
	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
	}
	@Override
	public String toString() {
		return "Calculadora [tipoTeclado=" + tipoTeclado + ", tipoPantalla=" + tipoPantalla + "]";
	}
	
	
	
	
	
}
