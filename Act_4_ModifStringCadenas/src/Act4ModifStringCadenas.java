
public class Act4ModifStringCadenas {
/*Actividad 4.2 de Programacion*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		String programacion="Nombre";
		
		//Extraer longitud de la cadena
		int longitud=programacion.length();
		
		//variable char
		char inicial=' ';
		
		//Almacenamos la inicial en la variable inicial
		inicial=programacion.charAt(0); //CORREGIDO POR PACO 
		
	 
		//Modificacion
		
				String modificacion="";
		
		//Convierto a mayusculas
		String upperprogramacion = programacion.toUpperCase ();
		modificacion=programacion.toUpperCase ();
		//No se donde esta el error, igual por que ya es Mayuscula
		//Imprimir 
		System.out.println("La cadena tiene:"+ longitud + " letras");
		System.out.println("La primera letra es:"+inicial);
		System.out.println("El string a moficar es: "+programacion+". \nUna vez hecha modificacion: "+modificacion);
		
	}

}
