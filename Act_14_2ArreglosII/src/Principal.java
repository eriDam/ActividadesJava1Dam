//Act_14_2 Arreglos2


public class Principal {
   
	    public static void main(String[] args) {
		
	    	//Creamos objeto para llmar al constructor de la otra clase
	    	ManejandoObjetos mOb=new ManejandoObjetos();
		
	        //Llamo 1 método pasandole el tamaño
	        mOb.ManejandoObjetos(15);
	    	
	    	
	        //Siguiente metodo NO Va
	        mOb.rellenarObjetos();
	        //metodo NO Va
	        mOb.rellenarObjetos();
	        //Siguiente
	        mOb.colocarObjeto(1, "Galgo");
	        mOb.colocarObjeto(5,"Dogo");
	        mOb.colocarObjeto(3,"Braco");
	        //Imprimir
	        mOb.imprimirObjetos();
	}
	}