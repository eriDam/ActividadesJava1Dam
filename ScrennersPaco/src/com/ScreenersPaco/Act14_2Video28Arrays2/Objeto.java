package com.ScreenersPaco.Act14_2Video28Arrays2;

public class Objeto {

	public static void main(String[] args) {
		/* Sirve para automatizar
		 *  0 1 2 3  
		 * | | | | |  4 Posiciones del 0 al 3 
		 *Creamos un nuevo array de los elementos q quiera
		 *int objeto[]=new int[4]; (me lo llevo a la clase Objetos
		 *Para cambiar el contenido de una posicion
		 *objeto[2]=25 
		 *Para imprimir ese contenido
		 *System.out.println(objeto[2]);*/
		
		//Si yo creo aqu� estoy llamando al constructor de  la otra clase
		Objetos o=new Objetos();
		
		//As� llamo al metodo para rellenar el array
		o.ponerValorEnPosicion(1,235);
		o.ponerValorEnPosicion(1,235);
		
		//Tambi�n se puede hacer este for para recorrer el array y rellenarlo
		for(int i=0;i<4;i++)
			o.ponerValorEnPosicion(i,i);
		//As� llamo al m�todo para imprimir
		o.imprimirObjetos();

	}

}
