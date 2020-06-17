package vistas;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Ej2FraccionControlador implements Initializable {
	
	@FXML
	private TextField numf1;
	
	@FXML
	private TextField denf1;
	
	@FXML
	private TextField numf2;
	
	@FXML
	private TextField denf2;
	
	@FXML
	private RadioButton suma;

	@FXML
	private RadioButton resta;

	@FXML
	private RadioButton producto;

	@FXML
	private RadioButton division;
	
	@FXML
	private ToggleGroup toggleGroup;
	
	@FXML
	private TextField numresultado;
	
	@FXML
	private TextField denresultado;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	private int numeradorf1() {
		return Integer.parseInt(numf1.getText());
	}
	
	private int denominadorf1() {
		return Integer.parseInt(denf1.getText());
	}
	
	private int numeradorf2() {
		return Integer.parseInt(numf2.getText());
	}
	
	private int denominadorf2() {
		return Integer.parseInt(denf2.getText());
	}
	
	void sumaFraccion() {
		int numerador = (numeradorf1() * denominadorf2()) + (denominadorf1() * numeradorf2());
		int denominador = (denominadorf1() * denominadorf2());
		numresultado.setText(numerador + " ");
		denresultado.setText(denominador + " ");
	}
	
	void restaFraccion() {
		int numerador = (numeradorf1() * denominadorf2()) - (denominadorf1() * numeradorf2());
		int denominador = (denominadorf1() * denominadorf2());
		numresultado.setText(numerador + " ");
		denresultado.setText(denominador + " ");
	}

	void multiplicaFraccion() {
		int numerador = numeradorf1() * numeradorf2();
		int denominador = denominadorf1() * denominadorf2();
		numresultado.setText(numerador + " ");
		denresultado.setText(denominador + " ");
	}
	
	void dividirFraccion() {
		int numerador = numeradorf1() * denominadorf2();
		int denominador = denominadorf1() * numeradorf2();
		numresultado.setText(numerador + " ");
		denresultado.setText(denominador + " ");
	}
	
	public void calcula(ActionEvent e) {
		try {

			if (suma.isSelected()) {
				sumaFraccion();
			
			} else if (resta.isSelected()) {
				restaFraccion();

			} else if (producto.isSelected()) {
				multiplicaFraccion();
	
			} else if (division.isSelected()) {
				dividirFraccion();
	
			} 

		} catch (NumberFormatException exception) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("¡ERROR!");
	    alert.setContentText("El dato introducido es incorrecto. Se debe introducir un valor NUMÉRICO ENTERO.");
	    alert.showAndWait();
	}

	}
	
}		