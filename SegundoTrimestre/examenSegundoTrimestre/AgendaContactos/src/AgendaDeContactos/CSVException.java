package AgendaDeContactos;

/**
 * Excepción para exportar e importar el CSV.
 * 
 * @author Antonio Quesada Cuadrado
 *
 */

@SuppressWarnings("serial")
public class CSVException extends Exception {

	public CSVException(String mensaje) {
		super(mensaje);
	}

}
