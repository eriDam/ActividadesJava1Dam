package com.retos.dam.nivel2_1reloj;
/*Pregunta 1 (200 points)
Tu primera misi�n ser� realizar un bucle con for donde muestre por pantalla una variable de tipo int y que represente los minutos de un cuarto de basket de la nba (12 minutos). Es decir, que muestre 12,11,10,....

S�lo eso, no tiene que durar 12 minutos, sino s�lo sacar por pantalla los n�meros del 12 al 0.

�nimo!!!!!*/

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