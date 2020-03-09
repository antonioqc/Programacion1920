package colecciones;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
 * almacenar las parejas de palabras. El programa pedirá una palabra en español
 * y dará la correspondiente traducción en inglés.
 * 
 * @author antonio
 *
 */

public class Ej10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Almacenamos en un diccionario 20 palabras en inglés y español.
		HashMap<String, String> m = new HashMap<String, String>();
		m.put("gato","cat");
		m.put("perro","dog");
		m.put("patatas", "chips");
		m.put("verduras", "vegetables");
		m.put("frutas", "fruits");
		m.put("cocina", "Kitchen");
		m.put("coche", "car");
		m.put("avion", "airplane");
		m.put("lapiz", "pencil");
		m.put("calle", "street");
		m.put("flores", "flowers");
		m.put("tijeras", "scissors");
		m.put("carne", "meat");
		m.put("amigo", "friend");
		m.put("novia", "girlfriend");
		m.put("pajaros", "birds");
		m.put("baloncesto", "basketball");
		m.put("alfombra", "carpet");
		m.put("pescado", "fish");
		m.put("tenedor", "fork");
		
		//Pedimos la palabra en español.
		System.out.println("Introduce la palabra en español que desea traducir:");
		String palabraEspañol = sc.nextLine();
		
		//Si el diccionario contiene la palabra en español devulve el contenido de la misma.
		if (m.containsKey(palabraEspañol)) {
			System.out.print("La palabra " + palabraEspañol + " corresponde a ");
			System.out.println(m.get(palabraEspañol));
			} else { //Si no, muestra un mensaje de que no existe.
			System.out.print("La palabra introducida no existe en el diccionario.");
			}
		
	}

}