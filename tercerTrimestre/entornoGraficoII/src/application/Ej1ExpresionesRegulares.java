package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ej1ExpresionesRegulares extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setTitle("Busca Expresiones Regulares");
    Parent root = FXMLLoader.load(getClass().getResource("../vistas/Ej1ExpresionesRegulares.fxml"));
    primaryStage.setScene(new Scene(root));
    primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
