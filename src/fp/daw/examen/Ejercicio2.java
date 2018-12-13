package fp.daw.examen;

public class Ejercicio2 {

	/* 
	 * 2 puntos
	 * 
	 * Define, después de este comentario, un método llamado 'busquedaBinaria' que declare dos
	 * parámetros formales: un vector de números enteros sin valores repetidos y un número entero.
	 * El método deberá encontrar y retornar mediante una búsqueda binaria sobre el vector el 
	 * índice de la posición en la que se encuentra almacenado el número dentro del
	 * vector, o el valor -1 si dicho dicho número no se encuentra almacenado en el vector. 
	 *  
	 */
	
	public static int busquedaBinaria(int vector[], int n){
		  int v = vector.length;
		  int centro,inf=0,sup=v-1;
		   while(inf<=sup){
		     centro=(sup+inf)/2;
		     if(vector[centro]==n) 
		    	 return centro;
		     else if(n < vector [centro] ){
		        sup=centro-1;
		     }
		     else {
		       inf=centro+1;
		     }
		   }
		   return -1;
		 }

	
	
	/*
	 * 1 punto
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba el método
	 * 'busquedaBinaria'. En primer lugar tendrá que crear un vector de números enteros
	 * de un tamaño aleatorio entre 100 y 200. A continuación almacenará números aleatorios
	 * comprendios entre Integer.MIN_VALUE e Integer.MAX_VALUE - 1, sin que se repita
	 * ningún valor. Finalmente generará números aleatorios en el mismo intervalo y 
	 * comprobará invocando al método 'busquedaBinaria' si se encuentran almacenados en
	 * el vector. Este proceso finalizará la primera vez que la búsqueda resulte positiva, es
	 * decir, la primera vez que el método retorne un valor distinto de -1, mostrando por
	 * pantalla el índice retornado.
	 * 
	 */
	
	public static void main(String[] args) {
	     
		  int val =(int)Math.floor(Math.random()*(100-200)+200);
			 int[]vector =new int[val];
			 for(int i=0;i<vector.length;i++) {
				 vector[i]=(int)Math.floor(Math.random()*(0-Integer.MAX_VALUE)+Integer.MAX_VALUE);
			 }
	       	  System.out.println(busquedaBinaria(vector,val));
		
	}

}
