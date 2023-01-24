package com.aparatos;

public class Practica {

	public static void main(String[] args) {
	
		int[] vector={1,2,3,4,5,6,7,8};
		
		double result1=devolverSumaDeLosElementos(vector);
		System.out.println("La suma total es "+result1);
		double result2=devolverPromedioDeLosElementos(vector);
		System.out.println("El promedio es "+result2);

	}
	//crear un metodo que reciba por parametro un arreglo de enteros y devuelva la suma
    //de todos sus elementos.
	
	public static int devolverSumaDeLosElementos(int[] num) {
		int suma=0;
		
		for(int i=0;i<num.length;i++) {
			suma+=num[i];
		}
		return suma;
	}
	
	//crear un metodo que reciba por parametro un arreglo de enteros y devuelva el promedio 
	//de esos numeros
	
	public static int devolverPromedioDeLosElementos(int[] vector) {
		int promedio=0;
		int suma=0;
		for(int i=0;i<vector.length;i++) {
			suma+=vector[i];
			promedio=suma;
			promedio =promedio/vector.length;
		}
		return promedio;
	}

}
