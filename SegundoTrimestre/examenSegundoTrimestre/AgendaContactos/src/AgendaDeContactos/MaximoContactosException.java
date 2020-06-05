package AgendaDeContactos;

/**
 * Excepción para que no supere los 100 contactos máximos.
 * 
 * @author Antonio Quesada Cuadrado
 *
 */

@SuppressWarnings("serial")
public class MaximoContactosException extends Exception {

  public MaximoContactosException(String mensaje) {
    super(mensaje);
  }
}
