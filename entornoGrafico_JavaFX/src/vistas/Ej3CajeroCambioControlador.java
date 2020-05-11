package vistas;

import java.net.URL;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

public class Ej3CajeroCambioControlador implements Initializable {
	
	@FXML
	private TextField numero;
	
	//euros
	@FXML
	private TextArea resultado500e;
	
	@FXML
	private TextArea resultado200e;
	
	@FXML
	private TextArea resultado100e;
	
	@FXML
	private TextArea resultado50e;
	
	@FXML
	private TextArea resultado20e;
	
	@FXML
	private TextArea resultado10e;
	
	@FXML
	private TextArea resultado5e;
	
	@FXML
	private TextArea resultado2e;
	
	@FXML
	private TextArea resultado1e;
	
	//céntimos
	@FXML
	private TextArea resultado50cts;
	
	@FXML
	private TextArea resultado20cts;
	
	@FXML
	private TextArea resultado10cts;
	
	@FXML
	private TextArea resultado5cts;
	
	@FXML
	private TextArea resultado2cts;
	
	@FXML
	private TextArea resultado1cts;


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	
	/**
	 * Botón calcular que desglosa en billetes y monedas el dinero introducido.
	 * @param e
	 */
	public void calcular(ActionEvent e) {
		try {
			double dinero = Double.parseDouble(numero.getText());
	    int billete500 = 0;
	    int billete200 = 0;
	    int billete100 = 0;
	    int billete50 = 0;
	    int billete20 = 0;
	    int billete10 = 0;
	    int billete5 = 0;
	    int moneda2e = 0;
	    int moneda1e = 0;
	    int moneda50cts = 0;
	    int moneda20cts = 0;
	    int moneda10cts = 0;
	    int moneda5cts = 0;
	    int moneda2cts = 0;
	    int moneda1cts = 0;
	        
	    while(dinero>=500) {
	      billete500 += 1;
	      dinero = dinero - 500;
	     }
	    
	    while(dinero>=200) {
	      billete200 += 1;
	      dinero = dinero - 200;
	    }
	    
	    while(dinero >= 100) {
	      billete100 += 1;
	      dinero = dinero - 100;
	    }
	    
	    while(dinero >= 50) {
	      billete50 += 1;
	      dinero = dinero - 50;
	    }
	    
	    while(dinero >= 20) {
	      billete20 += 1;
	      dinero = dinero - 20;
	    }
	    
	    while(dinero >=10) {
	      billete10 += 1;
	      dinero = dinero-10;
	    }
	    
	    while(dinero >=5) {
	      billete5 += 1;
	      dinero = dinero-5;
	    }
	    
	    while(dinero>=2) {
	      moneda2e += 1;
	      dinero = dinero -2;
	    }
	    
	    while(dinero>=1) {
	      moneda1e += 1;
	      dinero = dinero -1;
	    }
	    
	    while(dinero>=0.50) {
	      moneda50cts += 1;
	      dinero = dinero - 0.50;
	    }
	    
	    while(dinero>=0.20) {
	      moneda20cts += 1;
	      dinero = dinero - 0.20;
	    }
	    
	    while(dinero>=0.10) {
	      moneda10cts += 1;
	      dinero = dinero - 0.10;
	    }
	    
	    while(dinero>=0.05) {
	      moneda5cts += 1;
	      dinero=dinero-0.05;
	    }
	    
	    while(dinero>=0.02) {
	      moneda2cts += 1;
	      dinero=dinero-0.02;
	    }
	    
	    while(dinero>=0.01) {
	      moneda1cts += 1;
	      dinero=dinero-0.01;
	    }
	    
	    //resultados.
	    resultado500e.setText(billete500 + " billetes");
	    resultado200e.setText(billete200 + " billetes");
	    resultado100e.setText(billete100 + " billetes");
	    resultado50e.setText(billete50 + " billetes");
	    resultado20e.setText(billete20 + " billetes");
	    resultado10e.setText(billete10 + " billetes");
	    resultado5e.setText(billete5 + " billetes");
	    resultado2e.setText(moneda2e + " monedas");
	    resultado1e.setText(moneda1e + " monedas");
	    resultado50cts.setText(moneda50cts + " monedas");
	    resultado20cts.setText(moneda20cts + " monedas");
	    resultado10cts.setText(moneda10cts + " monedas");
	    resultado5cts.setText(moneda5cts + " monedas");
	    resultado2cts.setText(moneda2cts + " monedas");
	    resultado1cts.setText(moneda1cts + " monedas");

		} catch (NumberFormatException exception) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setHeaderText("¡ERROR!");
	    alert.setContentText("El dato introducido es incorrecto. Se debe introducir un valor numérico.");
	    alert.showAndWait();
		}
	
	}
	
	/**
	 * Botón que resetea todos los datos.
	 * @param e
	 */
	public void resetear(ActionEvent e) {
		numero.clear();
    resultado500e.clear();
    resultado200e.clear();
    resultado100e.clear();
    resultado50e.clear();
    resultado20e.clear();
    resultado10e.clear();
    resultado5e.clear();
    resultado2e.clear();
    resultado1e.clear();
    resultado50cts.clear();
    resultado20cts.clear();
    resultado10cts.clear();
    resultado5cts.clear();
    resultado2cts.clear();
    resultado1cts.clear();
	}	
}
