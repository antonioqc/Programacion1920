package AgendaDeContactos;

import utiles.Menu;
import utiles.Teclado;

/**
 * Clase TestAgenda, donde se realiza la comunicación con el usuario (mostrar
 * menú y recuperar opción del menú mostrar errores, listar) y se manipula la
 * agenda de contactos.
 * 
 * @author Antonio Quesada Cuadrado
 * 
 */

public class TestAgenda {
  static Agenda agenda = new Agenda();

  static Menu menu = new Menu("Agenda de Contactos", new String[] { "Añadir Contacto", "Baja Contacto",
		    "Busca Contacto", "Reducir agenda", "Exporta CSV", "Importa CSV", "Mostrar", "Salir" });

  public static void main(String[] args) {
    annadeVarios();

    do {
      switch (menu.gestiona()) {
        case 1:
	  annadir();
	  break;
        case 2:
	  baja();
	  break;
	case 3:
	  buscaContacto();
	  break;
	case 4:
	  reduce();
          break;
	case 5:
	  exportaCSV();
          break;
	case 6:
	  importaCSV();
	  break;
	case 7:
	  System.out.println(agenda);
	  break;
	default:
	  System.out.println("HAS SALIDO DEL MENÚ.");
          System.exit(1);
			}
	} while (true);
    }

  /**
   * Añade varios artículos de prueba.
   */
  private static void annadeVarios() {
    try {
      agenda.annadir("Antonio", "666555444", "calle sol", "antonio@gmail.com");
      agenda.annadir("Pepe", "611123456", "av. carlos III", "pepe@hotmail.com");
    } catch (MaximoContactosException | FormatoIntroducidoException e) {
      System.err.println(e.getMessage());
    }
  }

  /**
   * Añadimos un contacto a la agenda, recogiendo los datos por usuario.
   */
  private static void annadir() {
    try {
      String nombre = Teclado.getTexto("Introduce el nombre del contacto a añadir: ");
      String telefono = Teclado.getTexto("Introduce el teléfono del contacto a añadir: ");
      String direccion = Teclado.getTexto("Introduce la dirección del contacto: ");
      String correoElectronico = Teclado.getTexto("Introduce el correo electrónico del contacto: ");
      agenda.annadir(nombre, telefono, direccion, correoElectronico);
    } catch (MaximoContactosException | FormatoIntroducidoException e) {
      System.err.println(e.getMessage() + "\n");
    }
  }

  /**
   * Borramos un contacto a la agenda, recogiendo los datos por usuario.
   */
  private static void baja() {
    try {
      String nombre = Teclado.getTexto("Introduce el nombre del contacto a dar de baja: ");
      String telefono = Teclado.getTexto("Introduce el telefono del contacto a dar de baja: ");
      agenda.baja(nombre, telefono);
    } catch (ContactoInexistenteException e) {
      System.err.println(e.getMessage() + "\n");
    }
  }

  /**
   * Buscamos un contacto en la agenda por el nombre y muestra su información.
   */
  private static void buscaContacto() {
    try {
      String nombre = Teclado.getTexto("Introduce el nombre del contacto a buscar: ");
      agenda.buscaContacto(nombre);
    } catch (ContactoInexistenteException e) {
      System.err.println(e.getMessage() + "\n");
    }
  }

  /**
   * Recogemos el numero de contactos para reducir el tamaño de la agenda.
   */
  private static void reduce() {
    try {
      int numContactos = Teclado.getEntero("Introduce el número de contactos a reducir la agenda: ");
      agenda.reduce(numContactos);
    } catch (MaximoContactosException e) {
      System.err.println(e.getMessage() + "\n");
    }

  }

  /**
   * Recogemos el nombre del archivo a exportar a CSV.
   */
  private static void exportaCSV() {
    try {
      String archivo = Teclado.getTexto("Introduce el nombre del archivo para exportar al CSV:");
      agenda.exportaCSV(archivo);
    } catch (CSVException e) {
      System.err.println(e.getMessage() + "\n");
    }
 }

  /**
   * Recogemos el nombre del archivo a importar a CSV.
   */
  private static void importaCSV() {
    try {
      String archivo = Teclado.getTexto("Introduce el nombre del archivo para exportar al CSV:");
      agenda.exportaCSV(archivo);
    } catch (CSVException e) {
      System.err.println(e.getMessage() + "\n");
    }
  }
}
