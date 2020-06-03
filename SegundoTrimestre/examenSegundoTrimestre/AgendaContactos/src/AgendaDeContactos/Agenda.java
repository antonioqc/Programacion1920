package AgendaDeContactos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 1. Crea una clase para gestionar una agenda de un máximo de 100 contactos en Java y haz un
 * programa que la pruebe.
 * 
 * Nombre clase: Agenda.
 * 
 * El comportamiento de esta clase es el siguiente:
 * • Tiene dos constructores:
 * 	◦ El primero sin parámetros, simplemente crea una agenda vacía.
 * 	◦ El segundo recibe un fichero CSV con información de contactos.
 * • Alta de contacto. Añade un contacto a la agenda. Lanza una excepción si se sobrepasa el máximo de contactos (100).
 * • Baja de contacto. Lanza una excepción si el contacto a borrar no existe.
 * • Busca un contacto. Devuelve el contacto que coincida con la búsqueda, en caso de no encontrar coincidencia se devuelve un valor nulo.
 * • Reduce el tamaño de la agenda. Cambia el número máximo de contactos a otro valor inferior a 100, si se diera un valor mayor lanza una 
 * excepción, si reducimos el tamaño de la agenda a un valor inferior al número de contactos que hay lanza una excepción.
 * • Exporta a fichero CSV. Lanza una excepción si no podemos escribir en el fichero.
 * • Importa de fichero CSV. Cada contacto importado llama al método que da de alta. Lanza una excepción si no podemos leer del fichero.
 * 
 * El control del tamaño de la agenda se hace sobre esta clase.
 * 
 * @author Antonio Quesada Cuadrado
 *
 */

public class Agenda {
	private ArrayList<Contacto> agenda = new ArrayList<Contacto>();
	static int NUMMAXCONTACTOS = 100; // constante que asigna el valor máximo de contactos de la agenda.

	/**
	 * Añadimos un contacto a la agenda.
	 * @param nombre
	 * @param telefono
	 * @param direccion
	 * @param correoElectronico
	 * @throws FormatoIntroducidoException
	 * @throws MaximoContactos
	 */
	public void annadir(String nombre, String telefono, String direccion, String correoElectronico) throws MaximoContactosException, FormatoIntroducidoException {
		if (agenda.size() > NUMMAXCONTACTOS)
			throw new MaximoContactosException("Has sobrepasado el máximo de contactos que es 100.");

		agenda.add(new Contacto(nombre, telefono, direccion, correoElectronico));
	}

	/**
	 * Borramos un contacto de la agenda.
	 * @param nombre del contacto a borrar
	 * @return valor booleano que devuelve la baja de un contacto a través del
	 *         nombre.
	 */
	public boolean baja(String nombre) {
		return agenda.remove(new Contacto(nombre));
	}

	/**
	 * Busca toda la información de una contacto.
	 * @param nombre del contacto a buscar
	 * @return la información entera de un contacto a través del nombre
	 * @throws ContactoInexistenteException
	 */
	public Contacto buscaContacto(String nombre) throws ContactoInexistenteException {
		try {
			System.out.println(agenda.get(agenda.indexOf(new Contacto(nombre))));
		} catch (IndexOutOfBoundsException e) {
			throw new ContactoInexistenteException("El nombre del contacto introducido no existe.");
		}
		return null;
	}

	/**
	 * Reduce el tamaño de la agenda.
	 * @param numContactosActual numero de contactos a pedir
	 * @return numero maximo de contactos modificado
	 * @throws MaximoContactosException
	 */
	public int reduce(int numContactosActual) throws MaximoContactosException {
		if (numContactosActual > 0 && numContactosActual < NUMMAXCONTACTOS)
			return NUMMAXCONTACTOS = numContactosActual; //al modificarse el número de contactos java me obliga a quitar el 'final' de la constante (static int NUMMAXCONTACTOS).

		throw new MaximoContactosException("No puedes reducir el tamaño de la agenda. Has introducido un número mayor a los contactos permitidos (100).");
	}

	/**
	 * Exportamos la información de contactos a un archivo CSV.
	 * @param archivo a exportar
	 * @throws CSVException
	 */
	public void exportaCSV(String archivo) throws CSVException {
		try {
			BufferedWriter csv = new BufferedWriter(new FileWriter(archivo));
			csv.write("Nombre, Teléfono, Dirección, Correo Electrónico");
			csv.newLine();
			for (Contacto contacto : agenda) {
				csv.write(contacto.getNombre() + ",\"" + contacto.getTelefono() + ",\"" + contacto.getDireccion() + ",\""
						+ contacto.getCorreoElectronico());
				csv.newLine();
			}
			csv.close();

		} catch (IOException e) {
			throw new CSVException("Error de escritura en " + archivo);
		}
	}

	/**
	 * Importamos la información de contactos a un archivo CSV.
	 * @param archivo a importar
	 * @throws CSVException
	 */
	public void importaCSV(String archivo) throws CSVException {
		try {
			BufferedReader csv = new BufferedReader(new FileReader(archivo));
			String linea = csv.readLine();
			linea = csv.readLine(); // lectura de la primera línea
			while (linea != null) {
				String[] elemento = linea.split(",");
				// Con el método annadir se añade un nuevo artículo
				annadir(elemento[0].replace("\"", ""), // quitamos comillas
						String.valueOf(elemento[1]), // teléfono
						String.valueOf(elemento[2]), // dirección
						String.valueOf(elemento[3])); // correo electrónico
				linea = csv.readLine();
			}

			csv.close();

		} catch (Exception e) {
			throw new CSVException("Error de lectura en " + archivo);
		}
	}

	/**
	 * Mostramos todos los contactos de la agenda.
	 */
	@Override
	public String toString() {
		return "" + agenda;
	}
}
