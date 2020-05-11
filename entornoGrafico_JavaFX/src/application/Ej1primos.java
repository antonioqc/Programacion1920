package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ej1primos extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		FXMLLoader fxml = new FXMLLoader(this.getClass().getResource("/vistas/Ej1primos.fxml"));
		GridPane root = fxml.<GridPane>load();
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("Números Primos"); 
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
