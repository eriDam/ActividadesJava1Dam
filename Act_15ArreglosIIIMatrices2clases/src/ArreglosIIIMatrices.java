
public class ArreglosIIIMatrices {

	// Creo matriz de 13x17
				int matrix[][]= new int[17][17];
				
				
	//Creo el constructor
	public void ArreglosIIIMatrices(){
					
				}
	
	//Podemos LLENAR la MATRIZ Creando un MÉTODO, diciendole entre parenteseis lo que va a recibir
	public static void  llenarMatrix(int matrix[][]){
		//Vamos a tener que recorrer la matriz pra asignar cada calificacion a cada posicion(alumno) pero con 2 for x q hay 2 indices
		for(int filas=0;filas<matrix.length;filas++){
			//como para las columnas no es el mismo tamaño le tengo que decir que me de la lingitu de calificaciones en su posicion filas
			for(int columnas=0;columnas<matrix[filas].length;columnas++){
				//Especifico los valores para las columnas y filas indicadas NO ME SALE LA INSTRUCCION Q COMENTAS PARA EL RESIDUO
				matrix[0]     [columnas]  =1;
				matrix[16]    [columnas]  =1;
				matrix[4]     [columnas]  =1;
				matrix[8]     [columnas]  =1;
				matrix[12]    [columnas]  =1;
				
				matrix[filas]        [0]  =1;
				matrix[filas]       [16]  =1;
				matrix[filas]        [4]  =1;
				matrix[filas]        [8]  =1;
				matrix[filas]       [12]  =1;
				
				
			}//Fin For2
		}//Fin for1
	}//Fin metodo llenarMatrix
	
	
	//METODO para llenar con unos el borde
	public static void llenarBorde(int matrix[][]){			
				//Para llenar con unos el borde
				for ( int columna=0; columna <matrix[0].length; columna++ ){
					
				}//Fin For2
	}//Fin metodo llenarBorde
					
				 
	//Creo otro Método para imprimir
	public static void imprimirMa(int matrix[][]){
		for(int filas=0;filas<matrix.length;filas++){
			for(int columnas=0;columnas<matrix[filas].length;columnas++){
				System.out.print(matrix[filas][columnas]+"  ");	
			}//Fin for2
			System.out.println(" ");  
		}//Fin for1
	}//Fin metodo imprimir
}//fin clase
