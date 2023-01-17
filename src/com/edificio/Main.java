package com.edificio;

public class Main {

	public static void main(String[] args) {

		Edificio edificio=new Edificio();
		edificio.setAncho(100.34);
		edificio.setLargo(125.9);
		edificio.setColor("Blanco");
		edificio.setMaterial("Block");
		
		Apartamento apartamento=new Apartamento();
		apartamento.setAncho(75.45);
		apartamento.setLargo(65.9);
		apartamento.setColor("Gris");
		apartamento.setNumApartamento(402);
		apartamento.setNumHabitaciones(6);
		
		Habitacion habitacion=new Habitacion();
		habitacion.setAncho(45.32);
		habitacion.setLargo(65.32);
		habitacion.setColor("Rojo");
		habitacion.setNumPuertas(1);
		habitacion.setNumVentanas(2);
		
		Puerta puerta=new Puerta();
		puerta.setAncho(12.5);
		puerta.setLargo(40.5);
		puerta.setColor("Marron");
		puerta.setMaterial("Madera");
		
		Ventana ventana=new Ventana();
		ventana.setAncho(9.7);
		ventana.setLargo(10.9);
		ventana.setColor("Blanco");
		ventana.setMaterial("De cristal");
		
		Baño bano=new Baño();
		bano.setAncho(24.6);
		bano.setLargo(35.4);
		bano.setColor("Blanco");
		bano.setEspejo(true);
		bano.setNumPuertas(2);
		bano.setNumVentanas(1);
		
		System.out.println(edificio);
		System.out.println(apartamento);
		System.out.println(habitacion);
		System.out.println(puerta);
		System.out.println(ventana);
		System.out.println(bano);

	}

}
