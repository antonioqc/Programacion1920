package colecciones;
import colecciones.Carta;
import java.util.ArrayList;

/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author antonio
 *
 */

public class Ej08 {
	public static void main(String[] args) {
		ArrayList<Carta> cartas = new ArrayList<Carta>();
		
		//Creamos el objeto carta.
		
	
		for(int i=0; i<10; i++) {
			Carta carta = new Carta();
			
			while(cartas.contains(carta));
				cartas.add(carta);
				System.out.println(cartas.get(i));
		}
		

			System.out.println(cartas);

	  
	}
}
