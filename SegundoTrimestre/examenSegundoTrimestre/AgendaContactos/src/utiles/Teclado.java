package utiles;

import java.util.Scanner;

/**
 * Implementamos clase teclado.
 * 
 * @author Antonio Quesada Cuadrado
 *
 */
public class Teclado {
  private static Scanner sc = new Scanner(System.in);

  /**
   * Lee teclado cuando se introduce cadena.
   * 
   * @param mensaje
   * @return lee cadena
   */
  public static String getTexto(String mensaje) {
    System.out.println(mensaje);
    return getTexto();
  }

  public static String getTexto() {
    return sc.nextLine();	
  }

  /**
   * Lee teclado cuando se introduce un entero.
   * 
   * @param mensaje
   * @return lee entero
   */
  public static int getEntero(String mensaje) {
    System.out.println(mensaje);
    return getEntero();
  }

  public static int getEntero() {
    do {

      try {
        return Integer.parseInt(getTexto());

      } catch (NumberFormatException e) {

	System.err.println("¡ERROR! Debes introducir un número entero:");

      }

    } while (true);
  }
	
  /**
   * Lee teclado cuando se introduce decimal.
   * 
   * @param mensaje
   * @return lee entero
   */
  public static int getDecimal(String mensaje) {
    System.out.println(mensaje);
    return getDecimal();
  }

  public static int getDecimal() {
    do {

      try {
        return Double.parseDouble(getTexto());

      } catch (NumberFormatException e) {

	System.err.println("¡ERROR! Vuelve a introducir un número:");

      }

    } while (true);
  }
