package com.reros.dam.nivel2_2corrijiendoMinut;

public class CorrijeFor {

	public static void main(String[] args) {
		/* Codigo a corregir
		for(int minutero=12;minutero==0;minutero++)
		{
		  System.out.println(minutero);
		}*/
		//Codigo corregido, le decimos que empieza en 12 y que siga hasta 0 pero no le estabamos descontando si no aumentando
		//tampoco hay que poner ==0 si no >= mayor o igual
		for(int minutero=12;minutero>=0;minutero--)
		{
		  System.out.print("min -"+minutero);
		}
	}

}
