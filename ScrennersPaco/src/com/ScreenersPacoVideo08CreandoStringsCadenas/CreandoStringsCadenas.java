package com.ScreenersPacoVideo08CreandoStringsCadenas;

public class CreandoStringsCadenas {

	public static void main(String[] args) {
		//Creamos la variable de tipo String
		String s1="Programación";
		//variable para guardar la longitud de la cadena 12 caracteres
		int longitud=0;
		
		//La diferencia entre s1y longitud que s1 es un objeto y longitud una var basica. Cuando se pone s1. aparecen todos 
		//los metodos que podemos utilizar 
		longitud=s1.length();//no hace falta pasarle nada entre parentesis
		
		//Muestro en pantalla la longitud
		System.out.println("La longitud de la cadena ("+s1+") es de: "+longitud+" letras");
	}

}
