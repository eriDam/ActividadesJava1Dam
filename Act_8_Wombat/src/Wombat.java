//Act.8 Completa 
public class Wombat {
	//Inicio atributo leavesEaten
	private int leavesEaten; 
	//Iniciamos atributo String llamado nombre para iniciar mas tarde
	private String nombre; 
			
	public Wombat() { //Creamos el método (constructor) con el nombre de la clase
	//Le damos a este atributo el valor de 12
	leavesEaten=12; 
	//Le cambio el valor a nombre
	nombre="Bola";
	}
	//Creamos 2 metodo para obtener el valor del atributo LeavesEaten y obtenerNombre
	public int obtenerLeavesEaten(){
		 return leavesEaten;
		 }

	public String obtenerNombre(){
	     return nombre;
	     }
    public void establecerNombre(String cadena){
	//establece el valor
	 		nombre = cadena; 
    }
	public void establecerLeavesEaten(int i) {
		leavesEaten=i;
		// TODO Auto-generated method stub
		
	}

	
}