package com.ScreenersPacoVideo7ConversionVariables;

public class ConversionVariables {

	public static void main(String[] args) {
		// INICIALIZACION
		//Definir variables
		char letra='e';
		short numero=31220;
		byte contador=0;//de 0 a 20
		float pi=3.1416f;
		boolean semaforo=false;
		
		
		
		//UTILIZACION
		contador=15;
		System.out.println("El contador ahora vale: "+contador);
	
		//CONVERSION	
		//directa convertimos variables del mismo tipo una dentro de otra (la pequeña dentro grande) x ej contador dentro de short
		//al reves daria error pero se puede hacer un CAST se pone entre parentesis a que quieres convertir 
		//CAST=(que lo queremos convertir si o si)
		//contador=(byte)numero;
		numero=contador;
		System.out.println("Imprimo variable y es "+numero+" por que numero ha tomado  el valor de contador");
	}

}
