package com.retos.dam.nivel2_1reloj;
/*Pregunta 1 (200 points)
Tu primera misión será realizar un bucle con for donde muestre por pantalla una variable de tipo int y que represente los minutos de un cuarto de basket de la nba (12 minutos). Es decir, que muestre 12,11,10,....

Sólo eso, no tiene que durar 12 minutos, sino sólo sacar por pantalla los números del 12 al 0.

Ánimo!!!!!*/

public class Reloj {

	public static void main(String[] args) {
	
		// creo el bucle for con el descuento de tiempo
		for (int r = 12;  r >= 0;r--) {
		
		//Muestro en pantalla el bucle
		System.out.print("Minuto "+r+"-");	
	}
		System.out.println("\nAvisar del --Fin del partido--");
}
}