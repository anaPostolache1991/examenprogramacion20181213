package fp.daw.examen;



public class Ejercicio3 {

	/*
	 * 2 puntos
	 * 
	 *  Define, después de este comentario, un método llamado 'stringToArray2D' que
	 *  reciba como parámetro una cadena de caracteres y retorne un array de caracteres
	 *  de dos dimensiones que tendrá exactamente dos filas y el contenido siguiente en
	 *  cada una de ellas:
	 *  
	 *  	* Primera fila: caracteres de la cadena que ocupan posiciones pares (0, 2, 4, ...).
	 *  	* Segunda fila: caracteres de la cadena que ocupan posiciones impares (1, 3, 5, ...).
	 *  
	 *  El número de columnas en cada fila no excederá del estrictamente necesario para
	 *  almacenar los caracteres que se indican en cada caso.
	 *  
	 */
	
	public static int[][]stringToArray2D(String cadena){
		
		int [][]vector=new int[2][2];
		    for(int i=0;i<vector.length;i++) {
			for(int j=0;j<vector.length;j++) {
			
			if(cadena.indexOf(j)%2==0) {
				vector[i][j]=cadena.charAt(j);
				
				
			}else {
				vector[i][j]=cadena.charAt(j);
			}
			
		}
		}
		
		        for(int i=0;i<vector.length;i++) {
				for(int j=0;j<vector.length;j++) {
				System.out.print(vector[i][j]);
				}
			}
			

			return vector;
	}
	
	/*
	 * 1 punto
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba
	 * el método 'stringToArray2D' mostrando por pantalla el resultado de su ejecución.
	 * Se mostrará en cada fila del array en una línea de la pantalla utilizando para
	 * ello el método definido en el ejercicio 1.
	 * 
	 */
	
	public static void main(String[] args) {
		stringToArray2D("cad");
	}

}
