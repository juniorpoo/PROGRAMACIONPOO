package com.aparatos;

public class Prueba  {

	public static void main(String[] args) {
		AparatoElectronico apel1=crearYDevolverObjetoAparatoElectronico("Azul","Metal",54.4,34.2,100.45);
		AparatoElectronico apel2=crearYDevolverObjetoAparatoElectronico("verde","ferreo",44.1,54.2,200.95);
        AparatoElectronico[] apel=new AparatoElectronico[2];
        apel[0]=apel1;
        apel[1]=apel2;
		//imprimirColorYLargoDelObjeto(apel);
		
		Calculadora cal1=crearYDevolverObjetoCalculadora("Azul","Metal",21.4,23.6,92.5,"Lccd","Teclado flexible");
		Calculadora cal2=crearYDevolverObjetoCalculadora("verde","hierro",11.4,33.4,52.5,"kgnd","Teclado numerico");
		Calculadora []call=new Calculadora[2];
		call[0]=cal1;
		call[1]=cal2;
		//impriimirTipoPantallaYTipoTeclado(call);
		//imprimirColorYLargoDelObjeto(apel);
		//imprimirColorYLargoDelObjeto(call);
		impriimirTipoPantallaYTipoTeclado(call);
	}
	
	public static AparatoElectronico crearYDevolverObjetoAparatoElectronico(String color, String material, double ancho, double largo, double peso) {
		AparatoElectronico electro=new AparatoElectronico();
		electro.setColor(color);
		electro.setMaterial(material);
		electro.setAncho(ancho);
		electro.setLargo(largo);
		electro.setPeso(peso);
		return electro;
	}
	
	public static void imprimirColorYLargoDelObjeto(AparatoElectronico[]electro) {
		for(int i=0;i<electro.length;i++) {
			AparatoElectronico aple=electro[i];
			System.out.println("Color: "+aple.getColor());
			System.out.println("Largo: "+aple.getLargo());
		}
		
	}
	
    public static Calculadora crearYDevolverObjetoCalculadora(String color,String material,double ancho, double largo,double peso, String tipoPantalla, String tipoTeclado) {
    	
    	Calculadora cal=new Calculadora();
    	cal.setAncho(ancho);
    	cal.setColor(color);
    	cal.setMaterial(material);
    	cal.setLargo(largo);
    	cal.setPeso(peso);
    	cal.setTipoPantalla(tipoPantalla);
    	cal.setTipoTeclado(tipoTeclado);
    	
    	return cal;
    }
    
    public static void impriimirTipoPantallaYTipoTeclado(Calculadora[]calculadora) {
    	for(int i=0;i<calculadora.length;i++) {
    		Calculadora calcu=calculadora[i];
    		System.out.println("Tipo de Pantalla: "+calcu.getTipoPantalla());
    		System.out.println("Tipo de Teclado: "+calcu.getTipoTeclado());
    	}
    }

}
