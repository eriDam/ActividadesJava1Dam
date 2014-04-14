
public class PrincipalArreglosMatrices {

	public static void main(String[] args) {
	 
			//Creo un objeto para llamar al constructor de la otra clase
	  ArreglosIIIMatrices  llamandoArreglos= new  ArreglosIIIMatrices();
			
			//Uso los metodolos llamandolos aquí llenarMatrix(matrix);
			llamandoArreglos.llenarMatrix(matrix);   
			llamandoArreglos.llenarBorde(matrix);
			llamandoArreglos.imprimirMa(matrix);

		}
	}


