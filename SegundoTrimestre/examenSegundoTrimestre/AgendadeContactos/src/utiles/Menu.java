package utiles;

/**
 * Implementamos el menú para Test Almacen.
 * 
 * @author Antonio Quesada Cuadrado
 *
 */

public class Menu {
  private String nombre;
  private String opciones[];
  
  /**
	 * 
	 * @param nombre titulo del menú
	 * @param opciones opciones del menú
	 */
  public Menu(String nombre, String[] opciones) {
    this.nombre = nombre;
    this.opciones = opciones;
  } 
  
  /**
   * Método que gestiona el funcionamiento del menú.
   * @return recoge las opciones del menú.
   */
  public int gestiona(){
    mostrar();
    return recogerOpciones();
  }
  
	/**
	 * Recoge la opción válida del menú
	 * 
	 * @return opción válida
	 */
  private int recogerOpciones() {
    int opcion = -1;
    do {
      opcion = Teclado.getEntero("Elige una opción: ");
    }while (opcion < 1 || opcion > opciones.length);
    
    return opcion;
  }

  /**
	 * Muestra las opciones del menú
	 */
  private void mostrar() {
    int i = 1;
    System.out.println(nombre);
    System.out.println("--------------------");
    for (String elemento : opciones) {
      System.out.println((i++) + ". " + elemento);
    }
  }
}
