package vistas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class Ej4MezclaFicherosControlador implements Initializable {
	
	String archivo1;
	String archivo2;

	@FXML
	private TextArea contenidoFichero1;

	@FXML
	private TextArea contenidoFichero2;

	@FXML
	private TextArea resultado;

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}
	
	/**
	 * Botón que actua para abrir el primer fichero.
	 * @param e
	 */
	public void abrirfichero1(ActionEvent e) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Ficheros Java", "*.txt"));
		Window stage = null;
		File fichero1 = fileChooser.showOpenDialog(stage);
		archivo1 = fichero1.getAbsolutePath(); // ruta fichero
    try {
      BufferedReader fichero = new BufferedReader(new FileReader(fichero1));
      String linea = fichero.readLine();

      while (linea != null) { // lee linea a linea su contenido.
        contenidoFichero1.setText(contenidoFichero1.getText()+ linea+ "\n"); // muestra el contenido en el TextArea
        linea = fichero.readLine();

      }

      fichero.close();

    } catch (Exception exc){
      System.err.println("Error, no se ha podido abrir el fichero");
    }    

	}
	
	/**
	 * Botón que actua para abrir el segundo fichero.
	 * @param e
	 */
	public void abrirfichero2(ActionEvent e) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Ficheros Java", "*.txt"));
		Window stage = null;
		File fichero2 = fileChooser.showOpenDialog(stage);
		archivo2 = fichero2.getAbsolutePath(); // ruta fichero
		
    try {
      BufferedReader fichero = new BufferedReader(new FileReader(fichero2));
      String linea = fichero.readLine();

      while (linea != null) { // lee linea a linea su contenido.
        contenidoFichero2.setText(contenidoFichero2.getText()+ linea+ "\n"); // muestra el contenido en el TextArea
        linea = fichero.readLine();

      }

      fichero.close();

    } catch (Exception exc){
      System.err.println("Error, no se ha podido abrir el fichero");
    }  
	}
	
	/**
	 * Mezcla el contenido de ambos ficheros.
	 * @param e
	 */
	public void mezclar(ActionEvent e) {
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(archivo1));
			BufferedReader br2 = new BufferedReader(new FileReader(archivo2));
			BufferedWriter bw = new BufferedWriter(new FileWriter("fichero.txt"));
			String linea1 = br1.readLine();
			String linea2 = br2.readLine();

			while ((linea1 != null) || (linea2 != null)) {
				

				if (linea1 != null) {
					bw.write(linea1 + "\n");
					resultado.setText(resultado.getText()+ linea1 + "\n");
					
				}

				if (linea2 != null) {
					bw.write(linea2 + "\n");
					resultado.setText(resultado.getText()+ linea2 + "\n");
				}
				linea1 = br1.readLine();
				linea2 = br2.readLine();
			}
		

			br1.close();
			br2.close();
			bw.close();
			System.out.println("Archivo creado.");

		} catch (Exception exception) {
	    Alert alert = new Alert(AlertType.ERROR);
	    alert.setTitle("Error");
	    alert.setHeaderText("Error al abrir el archivo.");
	    alert.setContentText("Vuelva a introducir de nuevo un archivo.");
	    alert.showAndWait();
	  }
	}

}