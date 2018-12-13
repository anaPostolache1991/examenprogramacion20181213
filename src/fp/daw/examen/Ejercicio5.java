package fp.daw.examen;

import java.util.Scanner;

public class Ejercicio5 {

	/* 
	 * 2 puntos
	 * 
	 * Crea en el método 'main' un juego que consista en generar de forma aleatoria
	 * un número entero comprendido entre 100 y 200 y pedirle al usuario que lo
	 * adivine. Para ello el programa le pedirá que introduza por teclado un número.
	 * Si introduce el número correcto se mostrará un mesaje por pantalla indicando
	 * que ha acertado acompañado del número de intentos realizados y del tiempo
	 * empleado. A continuación, se le dará al usuario la opción de volver a jugar o
	 * de finalizar el juego.
	 * 
	 */
	
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
	do {	
     int adivinar=(int)Math.floor(Math.random()*(100-200)+200);
     int apuesta;
     int i=0,cont=0;
     //Scanner sc=new Scanner(System.in);
     System.out.println("introduce un numero entre 100 y 200");
     apuesta=sc.nextInt();
    while(adivinar!=apuesta){
    	 i++;
     
     if(adivinar>apuesta) {
    	 System.out.println("el numero de adivinar es mas grande");
    	 cont++;
     }else {
    	 System.out.println("el numero de adivinar es mas pequeño");
    	 cont++;
     }
     System.out.println("introduce un numero entre 100 y 200");
     apuesta=sc.nextInt();
    
	} 
    System.out.println("asertaste y el numero de intentos es de "+cont);
	
    System.out.println("queres volver a jugar(s/n)");
	}while(sc.next().toLowerCase().equals('s'));
}
}

