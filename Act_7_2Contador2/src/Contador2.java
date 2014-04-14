/*Act.7.2 En este caso crearemos una nueva clase,
*para poder realizar un ejemplo con cada una de las estructuras de control antes descritas:
*1.	Inicializaremos una variable contador de tipo byte. La inicializaremos a 0
*2.	Implementaremos el siguiente proceso*/
public class Contador2 {

	public static void main(String[] args) {
		byte contador=0;
		while(contador<28){//Mientras contador sea mayor que 28 ejecutara la accion
			System.out.print(contador);
			contador++; /*Aquí le indico q contador vaya aumentando en uno hasta
				 		llegar a 28, es lo mismo que decir contador=contador+1; */
		}
		System.out.println("\n-------");
		for (contador=15;contador>0;contador--){
			System.out.print (contador);
		}
		System.out.println("\n-------");
		do{
			System.out.print(contador);		
			 contador=(byte)(contador+2); 		
		}while(contador<=127);
	}

}
