package vistas;

import java.net.URL;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class Ej1MaxMinMediaVarControlador implements Initializable {
	
	
	@FXML
	private TextArea numeros;
	
	@FXML
	private TextArea resultados;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	
	static final int NUMERO_NOTAS = 10;
	public void calculo(ActionEvent e) {
		try {
			double media = 0;
	    double suma = 0;
	    double maximo = Integer.MIN_VALUE;
	    double minimo = Integer.MAX_VALUE;
	    double varianza = 0;

	    String numero = numeros.getText();
	   
	    String notas [] = numero.split(",");
	    
	    double[] prueba = new double[notas.length];
	    

	    for (int i = 0 ; i< notas.length;i++) {     
	      System.out.println(notas[i]);
	      prueba[i] = Double.parseDouble(notas[i]);
	      
	      if (prueba[i] < 0 || prueba[i] > 10) {
	      	Alert alert = new Alert(Alert.AlertType.ERROR);
	  			alert.setHeaderText("¡ERROR!");
	  	    alert.setContentText("Debes introducir un número entre 1 y 10.");
	  	    alert.showAndWait();
	  	    System.exit(1);
	  	    numeros.clear();
	      }
	      suma += prueba[i];
	      if (prueba[i] > maximo) {
	        maximo = prueba[i];
	      }
	      if (prueba[i] < minimo) {
	        minimo = prueba[i];
	      }   

	    }
	    
	    media += suma/notas.length;

	    // Calculamos varianza
	    double sumaVarianza = 0;
	    for (int j=0; j<notas.length; j++) {

	      sumaVarianza += Math.pow(prueba[j]-(suma/notas.length), 2);
	    }
	    varianza = sumaVarianza/notas.length;
	    
	    // Mostramos resultados 
	    resultados.setText(resultados.getText() + "\n" + "El MÁXIMO de las notas es " + maximo);
	    resultados.setText(resultados.getText() + "\n" + "El MÍNIMO de las notas es " + minimo);
	    resultados.setText(resultados.getText() + "\n" + "La MEDIA de las notas es " + media);
	    resultados.setText(resultados.getText() + "\n" + "La VARIANZA es: " + varianza);
	    
		} catch (NumberFormatException exception) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("¡ERROR!");
	    alert.setContentText("El dato introducido es incorrecto. Se debe introducir un valor numérico.");
	    alert.showAndWait();
		}
  	
		}

	}	