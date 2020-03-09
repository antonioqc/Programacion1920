package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * 
 * @author antonio
 *
 */

public class Ej03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		//Bucle for para introducir 10 números por teclado.
		for(int i=0; i<10; i++) {
			System.out.println("Introduce el número "+(i+1));
			 a.add(sc.nextInt()); //insertamos numeros al arraylist
		}
		
		Collections.sort(a); //sort ordena el arraylist.
		System.out.println("Se muestra la lista ordenada de los números introducidos:");
		for(int numero:a) {
			System.out.print(numero+"|");
		}
	}

}
