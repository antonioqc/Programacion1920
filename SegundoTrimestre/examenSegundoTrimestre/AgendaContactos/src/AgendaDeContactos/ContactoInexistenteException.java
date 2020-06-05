package AgendaDeContactos;

/**
 * Excepción para cuando el contacto indicado no exista.
 * @author Antonio Quesada Cuadrado
 *
 */

@SuppressWarnings("serial")
public class ContactoInexistenteException extends Exception {

  public ContactoInexistenteException(String mensaje) {
    super(mensaje);
  }
}
