package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ej3MetodoCesar extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setTitle("Método César");
    Parent root = FXMLLoader.load(getClass().getResource("../vistas/Ej3MetodoCesar.fxml"));
    primaryStage.setScene(new Scene(root));
    primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
