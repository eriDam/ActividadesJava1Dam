package com.ScreenersPaco.Act9;


public class Mundo {

	public static void main(String[] args) {
		/* Creamos un nuevo objeto, lo q se hace es llamar al constructor de la clase que
		 * he diseñado en Personaje. Todos los objetos en este caso p tendran siempre el 
		 * atributo nombre y el valor Eri y no se puede cambiar.*/
	Personaje p= new Personaje();
	
	//Si pongo este otro, p y p2 seran objetos diferente pero con el mismo valor en el atributo nombre
	Personaje p2= new Personaje();
	//Con esta forma de definir la clase cada uno de ellos tendría un valor
	p.nombre="Pedro";
	p2.nombre="Sara";
	
		System.out.println ("El valor del nombre del objeto p:"+p.nombre);
		System.out.println ("El valor del nombre del objeto p2:"+p2.nombre);
	
	} //Fin de main

}//Fin de la clase Mundo
