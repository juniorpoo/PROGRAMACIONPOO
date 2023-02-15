package com.edificio;

public class Main {

	public static void main(String[] args) {
		
		/*Edificio edificio=new Edificio();
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
		System.out.println(bano);*/
		
		//Ventana v1 = crearYDevolverObjectoVentana(41.2,16.3,"Gris","Aluminio");
		//Ventana v2 = crearYDevolverObjectoVentana(10.2,25.3,"azul","sin");
		//Ventana v3 = crearYDevolverObjectoVentana(4.2,6.3,"blanco","madera");
		
		Ventana ventana[]=new Ventana[3];
		ventana[0]=crearYDevolverObjectoVentana(41.2,16.3,"Gris","Aluminio");
		ventana[1]=crearYDevolverObjectoVentana(10.2,25.3,"azul","sin");;
		ventana[2]=crearYDevolverObjectoVentana(4.2,6.3,"blanco","madera");
		
		
		
		Puerta door[]=new Puerta[1];
		Puerta puerta=crearYDevolverObjetoPuerta(12.4,19.5,"Amarillo","sin");
	
		door[0]=puerta;
		
		Baño bano1=crearYDevolverObjetoBaño(32.5,45.8,"Negro",door,true,ventana);
		Baño bano2=crearYDevolverObjetoBaño(24.3,37.8,"Blanco",door,false,ventana);
		Baño[]bano=new Baño[2];
		bano[0]=bano1;
		bano[1]=bano2;
		Puerta puerta1=crearYDevolverObjetoPuerta(12.3,24.5,"Marron","Madera");
		Puerta puerta2=crearYDevolverObjetoPuerta(13.3,29.5,"negro","metal");
		
		Puerta  puertas[]=new Puerta[2];
		puertas[0]=puerta1;
		puertas[1]=puerta2;
	    
		Habitacion hb1=crearYDevolverObjetoHabitacion(12.3,43.76,bano1,"Mamen",puertas,ventana);
		Habitacion hb2=crearYDevolverObjetoHabitacion(15.3,42.36,bano1,"Rojo",puertas,ventana);
		Habitacion hb3=crearYDevolverObjetoHabitacion(17.3,48.66,bano1,"azul",puertas,ventana);
		Habitacion hb4=crearYDevolverObjetoHabitacion(18.3,49.96,bano1,"amarillo",puertas,ventana);
		
		Habitacion habitacion[]=new Habitacion[4];
		habitacion[0]=hb1;
		habitacion[1]=hb2;
		habitacion[2]=hb3;
		habitacion[3]=hb4;
		
		Apartamento ap1=crearYDevolverObjetoApartamento(21.4,45.9,"Verde",habitacion,402);
		Apartamento ap2=crearYDevolverObjetoApartamento(24.4,35.9,"Amarillo",habitacion,403);
		Apartamento []apartment=new Apartamento[2];
		apartment[0]=ap1;
		apartment[1]=ap2;
		
		Edificio ed1=crearYDevolverObjetoEdificio(54.9,76.9,"Block","blanco",apartment);
		Edificio ed2=crearYDevolverObjetoEdificio(54.9,76.9,"cristal","rojo",apartment);
		Edificio ed3=crearYDevolverObjetoEdificio(54.9,76.9,"Metal","Azul",apartment);
		Edificio ed4=new Edificio();
		
		Edificio[]edificios=new Edificio[3];
		edificios[0]=ed1;
		edificios[1]=ed2;
		edificios[2]=ed3;
		//imprimirColorYMaterialDelObjetoEdificio(edificios);
		//imprimirLargoYAnchoDeObjetoApartamento(apartment);
		//imprimirLargoYColorDeObjetoHabitacion(habitacion);
		//imprimirMaterialYColorDEObjetoPuerta(puertas);
		//imprimirSiTieneEspejoYAnchoDelObjetoBaño(bano);
		imprimirAnchoYMaterialDeObjetoVentana(ventana);
	}
	
	public static void imprimirColorYMaterialDelObjetoEdificio(Edificio[]edificios) {
		for(int i=0;i<edificios.length;i++) {
			Edificio ed=edificios[i];
			System.out.println("Color: "+ed.getColor());
			System.out.println("Material: "+ed.getMaterial());
		}
		
	}
	
	public static void imprimirLargoYAnchoDeObjetoApartamento(Apartamento[]apartamentos) {
		for(int i=0;i<apartamentos.length;i++) {
			Apartamento ap=apartamentos[i];
			System.out.println("Largo: "+ap.getLargo());
			System.out.println("Ancho: "+ap.getAncho());
		}
		
	}
	
	public static void imprimirLargoYColorDeObjetoHabitacion(Habitacion[]habitaciones) {
		for(int i=0;i<habitaciones.length;i++) {
			Habitacion hab=habitaciones[i];
			System.out.println("Largo: "+hab.getLargo());
			System.out.println("Color: "+hab.getColor());
		}
	}
	
	public static void imprimirMaterialYColorDEObjetoPuerta(Puerta[]puertas) {
		for(int i=0;i<puertas.length;i++) {
			Puerta puerta=puertas[i];
			System.out.println("Material: "+puerta.getMaterial());
			System.out.println("Color: "+puerta.getColor());
		}
		
	}
	
	public static void imprimirSiTieneEspejoYAnchoDelObjetoBaño(Baño[]banos) {
		for(int i=0;i<banos.length;i++) {
			Baño bano=banos[i];
			System.out.println("Tiene Espejo: "+bano.isTieneEspejo());
			System.out.println("Ancho: "+bano.getAncho());
		}
		
	}
	
	public static void imprimirAnchoYMaterialDeObjetoVentana(Ventana[]ventanas) {
		for(int i=0;i<ventanas.length;i++) {
			Ventana vent=ventanas[i];
			System.out.println("Ancho: "+vent.getAncho());
			System.out.println("Material: "+vent.getMaterial());
			
		
		}
	}
	
	
	public static Ventana crearYDevolverObjectoVentana(double ancho, double largo, String color, String material) {
//		Ventana v = new Ventana();
//		v.setColor(color);
//		v.setLargo(largo);
//		v.setMaterial(material);
//		return v;
		
		return new Ventana(color, material,largo, ancho);
	}
	
	public static Edificio crearYDevolverObjetoEdificio(double ancho,double largo,String material,String color,Apartamento[]ap) {
		
		Edificio ed=new Edificio();
		ed.setAncho(ancho);
		ed.setLargo(largo);
		ed.setMaterial(material);
		ed.setColor(color);
		ed.setApartamento(ap);
		return ed;
	}
	
	public static Apartamento crearYDevolverObjetoApartamento(double ancho,double largo,String color,Habitacion[]hb,int numApartamento){
		
		Apartamento ap1=new Apartamento();
		ap1.setAncho(ancho);
		ap1.setLargo(largo);
		ap1.setColor(color);
		ap1.setHabitaciones(hb);
		ap1.setNumApartamento(numApartamento);
		return ap1;
	}
	
	public static Habitacion crearYDevolverObjetoHabitacion(double ancho,double largo, Baño bano,String color,Puerta[]puertas,Ventana[]ventanas) {
		
		Habitacion hb=new Habitacion();
		hb.setAncho(ancho);
		hb.setLargo(largo);
		hb.setBano(bano);
		hb.setColor(color);
		hb.setPuertas(puertas);
		hb.setVentanas(ventanas);
		return hb;
	}
	
	public static Baño crearYDevolverObjetoBaño(double ancho,double largo,String color,Puerta[]puertas,boolean TieneEspejo,Ventana[]ventanas) {
		
		Baño bano=new Baño();
		bano.setAncho(ancho);
		bano.setLargo(largo);
		bano.setColor(color);
		bano.setPuertas(puertas);
		bano.setTieneEspejo(TieneEspejo);
		bano.setVentana(ventanas);
		
		return bano;
	}
	
	public static Puerta crearYDevolverObjetoPuerta(double ancho, double largo,String color,String material) {
		
		Puerta puerta=new Puerta();
		puerta.setAncho(ancho);
		puerta.setLargo(largo);
		puerta.setColor(color);
		puerta.setMaterial(material);
		
		return puerta;
	}
	

}
