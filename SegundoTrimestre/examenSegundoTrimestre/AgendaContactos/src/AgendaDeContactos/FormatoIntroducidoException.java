package AgendaDeContactos;

/**
 * Excepción para las expresiones regulares. Controla que el usuario introduzca
 * datos con formato correcto.
 * @author Antonio Quesada Cuadrado
 *
 */

@SuppressWarnings("serial")
public class FormatoIntroducidoException extends Exception {
	
  public FormatoIntroducidoException(String mensaje) {
    super(mensaje);
  }

}
