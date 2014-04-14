//Act_14_2 Arreglos2

public class ManejandoObjetos {
	//Declaracion de array y variable
			private String objetos[];
			private int numObjetos;
			
	
		
    //El  m�todo constructor o funci�n ManejandoObjetos se ha de llamara como la clase. El constructor ManejandoObjetos,
	//inicializar� el array objetos con un tama�o numObjetos
    public  ManejandoObjetos() {
    	//Inicializo ARRAY y variable
    	int numObjetos=20;
    	objetos=new String [numObjetos];
    	
    	 
    }
	//El m�todo constructor o funci�n ManejandoObjetos(in)El constructor ManejandoObjetos(in), inicializar� el 
    //array objetos con un tama�o int que se le pasar�.
    public  void ManejandoObjetos(int objIntro){
    	objetos=new String [numObjetos];
     	numObjetos=objIntro;//Este int va a almacenar el num de objetos pasados
    	
	}
    
    
	//El m�todo rellenarObjetos(), inicializa o resetea en blanco el arrary objetos   
    public void rellenarObjetos(){
    	//muy importante en todos los arrays que vayamos a utilizar siempre se utilizar� el for as�:
    	for(int i=0;i<objetos.length;i++){
    		objetos[i]="  ";
    		
    	} 
    }

    
    /*El m�todo rellenarObjetos(String[]), inicializa o resetea en blanco el arrary objetos con el objeto 
    *de String[] que le pasemos. Lo que antes rellenar pero lo q se hace es pasar un array con el contenido
    *SOBRECARGA: Cuando se llaman igual y tienen la misma salida void, pero distinta entrada, la clase sabe
    *distinguirlo
    */
    public  void rellenarObjetos(String[]perros){
    	for(int i=0;i<objetos.length;i++){
    	objetos[i]= perros[i]; //en objetos de i almacenamos lo que va en el objeto de entrada exactamente en la msima posicion  	
    	}
    }

    /*�l m�todo colocarObjeto(int,String), rellena el String que le pasemos en la posici�n que le pasemos dentro 
    * del atributo objetos
    */
    public void colocarObjeto(int posicion,String contenido){
    	objetos[posicion]=contenido;
    }
    
    //El m�todo imprimir Objetos()
    public void imprimirObjetos(){
    	for(int i=0;i<objetos.length;i++){
		System.out.println(objetos[i]);
    	}
    
    }
}



