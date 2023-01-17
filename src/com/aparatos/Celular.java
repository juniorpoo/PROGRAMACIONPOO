package com.aparatos;

public class Celular extends AparatoElectronico{

	protected String marca;
	protected boolean esTouch;
	protected boolean usaWifi;
	protected boolean esRecargable;
	protected boolean tieneCamara;
	protected boolean esAPruebaDeAgua;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isEsTouch() {
		return esTouch;
	}
	public void setEsTouch(boolean esTouch) {
		this.esTouch = esTouch;
	}
	public boolean isUsaWifi() {
		return usaWifi;
	}
	public void setUsaWifi(boolean usaWifi) {
		this.usaWifi = usaWifi;
	}
	public boolean isEsRecargable() {
		return esRecargable;
	}
	public void setEsRecargable(boolean esRecargable) {
		this.esRecargable = esRecargable;
	}
	public boolean isTieneCamara() {
		return tieneCamara;
	}
	public void setTieneCamara(boolean tieneCamara) {
		this.tieneCamara = tieneCamara;
	}
	public boolean isEsAPruebaDeAgua() {
		return esAPruebaDeAgua;
	}
	public void setEsAPruebaDeAgua(boolean esAPruebaDeAgua) {
		this.esAPruebaDeAgua = esAPruebaDeAgua;
	}
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", esTouch=" + esTouch + ", usaWifi=" + usaWifi + ", esRecargable="
				+ esRecargable + ", tieneCamara=" + tieneCamara + ", esAPruebaDeAgua=" + esAPruebaDeAgua + "]";
	}

	
}
