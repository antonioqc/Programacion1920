package colecciones;

import java.util.ArrayList;

/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 * 
 * @author antonio
 *
 */

public class Ej02 {
	public static void main(String[] args) {
		ArrayList<Integer> numAleatorios = new ArrayList<Integer>();
		int suma = 0;
		int minimo = Integer.MAX_VALUE;
		int maximo = Integer.MIN_VALUE;
		int tamanio = (int)(Math.random() * 11 + 10); //numeros aleatorios entre 10 y 20 de tamaño.
		
		//Añade en el arraylist valores aleatorios entre 0 y 100.
		for (int i = 0; i < tamanio; i++) {
			numAleatorios.add((int)(Math.random()*101));
		}

		//Calcula la suma, el minimo, el maximo y la media.
		for(int numero : numAleatorios) {
				suma += numero;
			
				if(numero < minimo) {
					minimo = numero;
				}
				
				if(numero > maximo) {
					maximo = numero;
				}
			}
		
		int media = suma/tamanio;
			
			System.out.println("La suma es " + suma);
			System.out.println("La media es " + media);
			System.out.println("El mínimo es " + minimo);
			System.out.println("El máximo es " + maximo);	
		
	}
	
}
