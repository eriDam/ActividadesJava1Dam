//Act_14_2 Arreglos2

public class ManejandoObjetos {
	//Declaracion de array y variable
			private String objetos[];
			private int numObjetos;
			
	
		
    //El  método constructor o función ManejandoObjetos se ha de llamara como la clase. El constructor ManejandoObjetos,
	//inicializará el array objetos con un tamaño numObjetos
    public  ManejandoObjetos() {
    	//Inicializo ARRAY y variable
    	int numObjetos=20;
    	objetos=new String [numObjetos];
    	
    	 
    }
	//El método constructor o función ManejandoObjetos(in)El constructor ManejandoObjetos(in), inicializará el 
    //array objetos con un tamaño int que se le pasará.
    public  void ManejandoObjetos(int objIntro){
    	objetos=new String [numObjetos];
     	numObjetos=objIntro;//Este int va a almacenar el num de objetos pasados
    	
	}
    
    
	//El método rellenarObjetos(), inicializa o resetea en blanco el arrary objetos   
    public void rellenarObjetos(){
    	//muy importante en todos los arrays que vayamos a utilizar siempre se utilizará el for así:
    	for(int i=0;i<objetos.length;i++){
    		objetos[i]="  ";
    		
    	} 
    }

    
    /*El método rellenarObjetos(String[]), inicializa o resetea en blanco el arrary objetos con el objeto 
    *de String[] que le pasemos. Lo que antes rellenar pero lo q se hace es pasar un array con el contenido
    *SOBRECARGA: Cuando se llaman igual y tienen la misma salida void, pero distinta entrada, la clase sabe
    *distinguirlo
    */
    public  void rellenarObjetos(String[]perros){
    	for(int i=0;i<objetos.length;i++){
    	objetos[i]= perros[i]; //en objetos de i almacenamos lo que va en el objeto de entrada exactamente en la msima posicion  	
    	}
    }

    /*Él método colocarObjeto(int,String), rellena el String que le pasemos en la posición que le pasemos dentro 
    * del atributo objetos
    */
    public void colocarObjeto(int posicion,String contenido){
    	objetos[posicion]=contenido;
    }
    
    //El método imprimir Objetos()
    public void imprimirObjetos(){
    	for(int i=0;i<objetos.length;i++){
		System.out.println(objetos[i]);
    	}
    
    }
}



