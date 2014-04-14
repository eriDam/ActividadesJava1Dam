//Actividad 7.1
public class Contador {

	public static void main(String[] args) {
		int contador=0;
		
		System.out.println ("-------");
		while(contador<38){//Mientras contador sea menor que 38 ejecutara la accion
			System.out.print("-"+contador);
			contador++; /*Aquí le indico q contador vaya aumentando en uno hasta
				 		llegar a 38, es lo mismo que decir contador=contador+1; */
		}		
		System.out.println("\n-------");
		contador=0;
		do{
			System.out.print(contador);		
			contador++; 		
		}while(contador<=113);

		System.out.println("\n-------");
		for (contador=15;contador>0;contador--){
			System.out.print (contador);
		}
		}
	}

