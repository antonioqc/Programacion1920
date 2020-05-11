package vistas;

import java.net.URL;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class Ej1ContarPalabrasControlador implements Initializable {

	@FXML
	private TextArea texto;

	@FXML
	private TextArea resultado;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	/**
	 * Método asociado al botón. Cuenta las palabras del texto.
	 * 
	 * @param e
	 */
	public void contarPalabras(ActionEvent e) {
		String cadena;
		int contadorPalabras = 0;

		// Pedimos datos y borro los posibles espacios al principio y final de la cadena
		cadena = texto.getText().trim(); 

		// Si nos dan la cadena vacía salta una ventana de información.
		if (cadena.isEmpty()) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("Texto Vacío");
			alert.setContentText("Has introducido texto vacío. Vuelve a introducir datos de nuevo.");
			alert.showAndWait();
		}

		// Desde el primer caracter distinto de espacio
		for (int posicion = 0; posicion <= cadena.length() - 1; posicion++) {
			if (cadena.charAt(posicion) == '\n' || cadena.charAt(posicion) == ' ') {
				contadorPalabras++;

				while (posicion <= cadena.length() - 1 && cadena.charAt(posicion) == '\n' || cadena.charAt(posicion) == ' ') {
					posicion++;
				}
			}
		}
		contadorPalabras++;

			// Muestra el resultado en un textArea.
			resultado.setText("El texto tiene " + contadorPalabras + " palabras.");

	}

}