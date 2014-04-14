package com.ScreenersPacoVideo09InstanciandoObjetosClases;
//Wombat no tiene el metodo main q tiene WombatWorld
public class Wombat {
	//Las clases tienen: metodos, atributos, vamos a crear el primer atributo. Se crea aquí para q se pueda usar en toda la clase
	//Todos los atributos de 1clase deben estar definidos fuera de los metodos.Aqui solo INICIALIZAMOS
	public String nombre="";
	public String nombre2="";
	//Inicio atributo leavesEaten private y lo creo a continuacion del 1 constructor 
	private int leavesEaten;
	
	//Este es el constructor, el primer metodo q se llamara sobre la clase cuando se ejecute, se debe de llamar igual quie el nombre de la clase
	public Wombat() {
		//Aqui es donde le DAMOS VALORES dentro del constructor. Podemos ponerle un nombre
		nombre="Comilón";
		nombre2="Comilonzon";//doy un valor distinto a nombre2 para q no tengan el mismo y no cambiar al primero
		//Le damos a este atributo el valor de 12
		leavesEaten=12; 
		//Le cambio el valor a nombre
		nombre="Bola";
	}
	
	//Aqui despues del constructor Creamos 2 metodos para obtener el valor del atributo LeavesEaten y obtenerNombre
		public int obtenerLeavesEaten(){
			 return leavesEaten; //para q me devuelva
			 }
		public String obtenerNombre(){
		     return nombre;
		     }
		public void establecerNombre(String cadena){
			//establece el valor
			 		nombre = cadena; 
		    }
		public void establecerLeavesEaten(int i) {
			// TODO Auto-generated method stub
			leavesEaten = i;
		}
}
