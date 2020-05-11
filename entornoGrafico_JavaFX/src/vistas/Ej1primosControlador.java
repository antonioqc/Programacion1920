package vistas;

import java.net.URL;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class Ej1primosControlador implements Initializable {
	
	
	@FXML
	private TextField numeros;
	
	@FXML
	private TextArea muestraResultado;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	public void okAction(ActionEvent e) {
		try {
		  int cantidadAMostrar = Integer.parseInt(numeros.getText());
			muestraResultado.setText("1º: 2 ");
		// el primer primo es 2, los otros son todos impares...
		  int cantidadMostrados = 1;
		  // ...a partir de 3
		  int num = 3;
		  while (cantidadMostrados < cantidadAMostrar) {
		    // pienso que es primo hasta que encuentre con que dividirlo
		    boolean esPrimo = true;
		    // ya sabemos que es impar
		    for (int divisor=3; divisor<=Math.sqrt(num) && esPrimo; divisor+=2) {
		      // si la división da exacta...
		      if (num%divisor==0) {
		        // ...ya no es primo
		        esPrimo = false;
		      }
		    }
		    if (esPrimo) {
		      cantidadMostrados++;
		      muestraResultado.setText(muestraResultado.getText() + "\n" + cantidadMostrados + "º: " + num);
		    }
		    num += 2;
		  }
		} catch (NumberFormatException exception) {
				muestraResultado.setText("Dato introducido incorrecto. Introduzca un número");
				Alert alert = new Alert(Alert.AlertType.ERROR);
				alert.setHeaderText("¡ERROR!");
		    alert.setContentText("El dato introducido es incorrecto. Se debe introducir un valor numérico.");
		    alert.showAndWait();
		}

	}
	
	}	
