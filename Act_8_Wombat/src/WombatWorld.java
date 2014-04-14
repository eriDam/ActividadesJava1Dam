

/*Act 8 completa
 * 8.1  Continuando con la estructura que teníamos en el PROC05 donde teníamos:
	Clase con el nombre Wombat
atributo, public int leavesEaten;	atributo, public int(debería poner string) nombre;
Clase con el nombre WombatWorld
Teniendo como bibliografía el libro Como programar en JAVA (capítulo 3):
1.	Convertiremos los atributos leavesEaten y nombre en privados:
a.	atributo, private int leavesEaten;
b.	atributo, private int nombre;
2.	En el constructor de Wombat (public void Wombat()), inicializaremos las variables:
a.	leavesEaten=0;
b.	nombre =”Lo que querais”
3.	¿Desde la clase principal (WombatWorld), podemos ahora imprimir leavesEaten y nombre?
                   NO DEJA IMPRIMIR  POR QUE NO ESTA VISIBLE*/


public class WombatWorld {

		public static void main(String[] args) {
	  
	    //creamos variable de tipo int variableInt y String str
	    int variableInt;
	    String variableStr;
	   //Creamos el objeto Wombat
	  	Wombat w=new Wombat(); 
	  	
	  		System.out.println(" Wombat se llama :"+w.obtenerNombre());
			System.out.println("Wombat ha comido :"+w.obtenerLeavesEaten());
	 
		//Utilizamos metodo establecer y damos valor
		w.establecerLeavesEaten(99);
		w.establecerNombre("Bicho Bola");
	
			System.out.println("El Wombat ahora ha comido :"+w.obtenerLeavesEaten());
			System.out.println("Ahora el Wombat ahora se llama :"+w.obtenerNombre());
	  	
		/*Almacenaremos en variableInt lo que devuelva obtenerLeavesEaten
		Almacenaremos en variableStr lo que devuelva obtenerNombre*/
        variableInt = w.obtenerLeavesEaten();
		variableStr = w.obtenerNombre();
	 	
		
	   
		//Creamos condicion simple if
        if (variableInt == 0){
			System.out.println("No ha comido nada");
}
        else
    		System.out.println("En total ha comido "+variableInt+" hojas");
			System.out.println("Mi Wombat ahora se llama:"+variableStr+".");


        	
}
}
