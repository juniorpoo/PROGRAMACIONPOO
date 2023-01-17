package com.edificio;

public class Main {

	public static void main(String[] args) {

		Edificio edificio=new Edificio();
		edificio.setAncho(100.34);
		edificio.setLargo(125.9);
		edificio.setColor("Blanco");
		edificio.setMaterial("Block");
		
		Puerta puerta1 = new Puerta();
		puerta1.setColor("Blanco");
		Puerta puerta2 = new Puerta();
		puerta2.setColor("Marron");
		
		// forma de inicializar arreglo "inline"
		//Puerta puertas[] = new Puerta[] {puerta1, puerta2};
		
		Puerta puertas[] = new Puerta[2];
		puertas[0] = puerta1;
		puertas[1]= puerta2;
		
		Habitacion hb1 = new Habitacion();
		hb1.setAncho(15);
		hb1.setLargo(25);
		hb1.setColor("Blanco");
		hb1.setPuertas(new Puerta[] { puerta1, puerta2 });
		
		Habitacion hb2 = new Habitacion();
		hb1.setAncho(10);
		hb1.setLargo(12);
		hb1.setColor("Blanco");
		hb1.setPuertas(new Puerta[] { puerta1, puerta2 });
		
		Apartamento apartamento=new Apartamento();
		apartamento.setAncho(75.45);
		apartamento.setLargo(65.9);
		apartamento.setColor("Gris");
		apartamento.setNumApartamento(402);
		apartamento.setHabitaciones(new Habitacion[] { hb1, hb2 });
		
			
		Habitacion habitacion=new Habitacion();
		habitacion.setAncho(45.32);
		habitacion.setLargo(65.32);
		habitacion.setColor("Rojo");
		habitacion.setVentanas(new Ventana[] { new Ventana(), new Ventana() });
		
		var ventana0 = habitacion.getVentanas()[0];
		var ventana1 = habitacion.getVentanas()[1];
		
		var ancho = ventana0.getAncho();
		var color = ventana0.getColor();
		var colorHb = habitacion.getColor();
		
		apartamento.setHabitaciones(new Habitacion[] { habitacion, hb1 });
	
		edificio.setApartamento(new Apartamento[] { apartamento });
		
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
	    bano.setTieneEspejo(true);
		
		System.out.println(edificio);
		System.out.println(apartamento);
		System.out.println(habitacion);
		System.out.println(puerta);
		System.out.println(ventana);
		System.out.println(bano);
	}

}
