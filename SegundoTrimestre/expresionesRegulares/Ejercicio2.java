package expresionesRegulares;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Programa que reciba una url y el nombre de una etiqueta html. Si la url es
 * válida debe mostrar por la pantalla el contenido de cada etiqueta.
 * 
 * Ejemplo:
 * si ejecuto java miprograma https://www.iesgrancapitan.org h1 
 * 
 * La salida sería:
 * Últimos artículos de nuestro blog de centro
 * Número de etiquetas encontradas: * 1
 * 
 * El programa cuenta con una modificación. Contamos con un fichero con todas las etiquetas html correctas. 
 * Con esto conseguimos que salte un error y no se pueda pasar como parámetro etiquetas incorrectas.
 * 
 * @author Antonio Quesada Cuadrado
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> etiquetas = new ArrayList<String>();

		// Comprobamos argumentos
		if (args.length != 2) {
			System.err.println("El programa debe tener 2 parámetros");
		}

		// Parámetros
		String web = args[0];
		String etiqueta = args[1];
		String html = "";

		try {
			// Lectura de elementos html en el archivo.
			BufferedReader bf1 = new BufferedReader(new FileReader("Etiquetas.txt"));
			String lineaFichero = bf1.readLine();

			while (lineaFichero != null) {
				// Añadimos al arrayList el contenido de etiquetas.
				etiquetas.add(lineaFichero);
				lineaFichero = bf1.readLine();
			}
			bf1.close();

			// Comprobamos si la etiqueta pasada como parámetro se encuentra en el fichero.
			if (!etiquetas.contains(etiqueta)) {
				System.err.println("La etiqueta pasada como parámetro no existe.");
				System.exit(1);
			}

			// Petición Get a la web
			URL url = new URL(web);
			HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
			conexion.setRequestMethod("GET");

			// Lectura de peticion
			BufferedReader bf2 = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
			String linea;

			// Añadimos contenido a la cadena de html
			while ((linea = bf2.readLine()) != null) {
				html += linea + "\n";
			}
			bf2.close();

			// Construimos la expresión y la buscamos en html
			Pattern patron = Pattern.compile("<" + etiqueta + "[^>]*>(.+?)</" + etiqueta + ">", Pattern.DOTALL);
			Matcher matcher = patron.matcher(html);

			// Imprimimos resultados
			System.out.println("COINCIDENCIAS:");
			System.out.println("Etiqueta buscada en el código: " + etiqueta);

			int i = 0;
			while (matcher.find()) {
				System.out.println(matcher.group(1));
				i++;
			}

			// Coincidencias totales
			System.out.println("-------------------------------------------------");
			System.out.println("Total de coincincidencias de <" + etiqueta + ">: " + i);

		} catch (MalformedURLException e) {
			System.err.println("URL no encontrada.");
		} catch (IOException e) {
			System.err.println("Fichero de etiquetas no leido");
		}

	}

}
