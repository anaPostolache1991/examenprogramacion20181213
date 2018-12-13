package fp.daw.examen;

public class Ejercicio4 {

	/* 
	 * 2 puntos
	 * 
	 * Define, después de este comentario, un método llamado 'numSecuencias' que
	 * reciba en un parámetro formal un vector de números enteros y retorne el 
	 * número de secuencias de números repetidos. Ejemplo, si el contenido del vector es:
	 * 	
	 * 		[9,2,2,3,2,5,7,7,7,4]
	 * 		   * *       * * * 
	 * 
	 * el método retornará el valor 2 ya que contiene las dos secuencias de números
	 * repetidos que se han señalado con los asteriscos.
	 * 
	 */
	
	public static int  numSecuencias(int[]vector) {
		int cont=0;
		for(int i=0;i<vector.length;i++) {
			if(vector[i]==vector[i+1]) {
				cont++;
			}
		}
		return cont;
	}
	
	/*
	 * 1 punto
	 * 
	 * Escribe en el método main las sentencias necesarias para crear un vector de números
	 * enteros de un tamaño aleatorio entre 10 y 100 y llenarlo con números enteros
	 * aleatorios comprendidos entre -100 y 100. A continuación se mostrará su contendio por 
	 * pantalla invocando al método 'mostrarVector' definido en el ejercicio 1 y el número
	 * de secuencias de números repetidos que contiene invocando al método 'numSecuencias'.
	 *  
	 */
	
	public static void main(String[] args) {
		int n=(int)Math.floor(Math.random()+(10-100)+100);
		int[]vector=new int[n];
		Ejercicio1 e=new Ejercicio1();
		for(int i=0;i<vector.length;i++) {
		   e.mostrarVector(vector);
		   numSecuencias(vector);
		}

	}

}
