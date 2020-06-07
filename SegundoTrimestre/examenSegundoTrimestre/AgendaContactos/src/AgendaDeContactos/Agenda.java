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
  private int NUMMAXCONTACTOS = 100; // asigna el valor máximo de contactos de la agenda.

  /**
   * Primer constructor vacío.
   */
  public Agenda() {

  }

  /**
   * Segundo constructor que recibe un fichero con información de contactos.
   * @param fichero
   * @throws CSVException
   */
  public Agenda(String archivo) throws CSVException {
    exportaCSV(archivo);
  }

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
    if (agenda.size() >= NUMMAXCONTACTOS)
      throw new MaximoContactosException("Has sobrepasado el máximo de contactos que es 100.");

    agenda.add(new Contacto(nombre, telefono, direccion, correoElectronico));
 }
	
  /**
   * Devuelve la posición o el índice del contacto en función de su nombre y
   * teléfono.
   * 
   * @param nombre
   * @param telefono
   * @return posicion 
   * @throws ContactoInexistenteException
   * @throws FormatoIntroducidoException
   */
  private Contacto get(String nombre, String telefono) throws ContactoInexistenteException, FormatoIntroducidoException {
    try {
      return agenda.get(agenda.indexOf(new Contacto(nombre,telefono)));

    } catch (IndexOutOfBoundsException e) {
      throw new ContactoInexistenteException("El contacto no existe.");
    }
  }

  /**
   * Borramos un contacto de la agenda.
   * 
   * @param nombre del contacto a borrar
   * @param telefono del contacto a borrar
   * @return valor booleano que devuelve la baja de un contacto a través del
   *         nombre.
   * @throws FormatoIntroducidoException
   */
  public boolean baja(String nombre, String telefono) throws ContactoInexistenteException {
    return agenda.remove(new Contacto(nombre, telefono));
  }

 /**
  * Busca toda la información de una contacto.
  * @param nombre
  * @param telefono
  * @return contactos encontrados
  * @throws ContactoInexistenteException
  * @throws FormatoIntroducidoException
  */
 public Contacto buscaContacto(String nombre, String telefono) throws ContactoInexistenteException, FormatoIntroducidoException {
   return get(nombre, telefono);
  }

 /**
  * Reduce el tamaño de la agenda.
  * 
  * @param numContactosActual numero de contactos a pedir
  * @return numero maximo de contactos modificado
  * @throws MaximoContactosException
  */
 public void reduce(int numContactosActual) throws MaximoContactosException {
   if (agenda.size() < numContactosActual && numContactosActual < 100)
     NUMMAXCONTACTOS = numContactosActual;

   throw new MaximoContactosException("No puedes reducir el tamaño de la agenda. Has introducido un número mayor a los contactos permitidos (100).");
 }

 /**
  * Exportamos la información de contactos a un archivo CSV.
  * 
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
  * 
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
