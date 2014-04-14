package com.ScreenersPaco.Act14_2Video28Arrays2;

public class Objetos {
	/*TRAIGO EL ARRAY DE LA LINEA 10 DE OBJETO y lo hago private
	 * Sirve para automatizar
	 *  0 1 2 3  
	 * | | | | |  4 Posiciones del 0 al 3 
	 *Creamos un nuevo array de los elementos q quiera*/
	private int objeto[]=new int[4];
	
	//Constructor
	public Objetos() {
		//Como se inicializa y PARA SIEMPRE usando for con esta estructura (hara objeto[0]=1,objeto[1]=2...
		
		for(int contador=0;contador<objeto.length;contador++){
			 objeto[contador]=0;
		}
	}

	//Creo método para poner el valor en la posicon, le digo por un lado en que posicion y por otro el valor
	public void ponerValorEnPosicion(int posicion, int valor){
			objeto[posicion]=valor;
	}
	
	//Creo metodo para imprimir objetos
	public void imprimirObjetos(){
		for(int contador=0;contador<objeto.length;contador++){
			System.out.println(objeto[contador]);
		}
		
	}
	
}
