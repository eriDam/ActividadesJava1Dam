package com.ScreenersPacoVideo09InstanciandoObjetosClases;


public class WombatWorld {

	public static void main(String[] args) {
		//Podemos utilizar el Wombat aqui,dandole vida instanciando la clase, creando un objeto
		Wombat w=new Wombat();//Al poner Wombat() esta llamando al constructor de la clase Wombat, ya tenemos una variable
		//En la clase ejecutora podemos crear otro objeto Wombat
		Wombat nuevoW=new Wombat();
		
		//creo variables nuevas
		//creamos variable de tipo int variableInt y String str
	    int variableInt;
	    String variableStr;
	    
		//Mostrar el nombre el primer objeto w
		System.out.println("El nombre es "+w.nombre);//al poner w nombre del objeto nos deja ver todos los metodos
		//Mostrar el nombre el 2 objeto nuevoW
		System.out.println("El objeto nuevo es "+nuevoW.nombre2);
		System.out.println("El nombre es "+w.obtenerNombre());
		System.out.println("Ha comido "+w.obtenerLeavesEaten()+" hojas");
		
		//Utilizamos metodo establecer y damos valor, se ha creado en Wombat
				w.establecerLeavesEaten(24);
				w.establecerNombre("Bicho Bola");
				
		/*Almacenaremos en variableInt lo que devuelva obtenerLeavesEaten
	     Almacenaremos en variableStr lo que devuelva obtenerNombre*/
		        variableInt = w.obtenerLeavesEaten();
				variableStr = w.obtenerNombre();
				
				System.out.println("El Wombat ha comido :"+w.obtenerLeavesEaten());
				System.out.println("Ahora el Wombat se llama :"+w.obtenerNombre());
	}

}
