package application;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * 2. Calcular el perí­metro y área de un rectángulo dada su base y su altura.
 * 
 * Componentes gráficos:
 * Etiquetas.
 * Cajas de texto para base y altura.
 * Botón para calcular.
 * Caja de texto resultado.
 * 
 * No utilizar Scene Builder.
 * 
 * @author Antonio Quesada Cuadrado
 *
 */

public class Ej2rectangulo extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Perímetro y área del rectángulo");
		primaryStage.show();
		
		Label etiqueta = new Label("Calcula el perímetro y el área:");
		etiqueta.setFont(new Font("Gothic", 20));
		Label etiquetaBase = new Label("Introduce la base:");
		TextField base = new TextField(" ");
		Label etiquetaAltura = new Label("Introduce la altura:");
		TextField altura = new TextField();
		Button button = new Button("Calcular");
		Label etiquetaResultadoPerimetro = new Label("Resultado Perímetro:");
		TextField resultadoPerimetro = new TextField(" ");
		Label etiquetaResultadoArea = new Label("Resultado Área:");
		TextField resultadoArea = new TextField(" ");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.add(etiqueta, 0, 0);
		grid.add(etiquetaBase, 0, 1);
		grid.add(base, 1, 1);
		grid.add(etiquetaAltura, 0, 3);
		grid.add(altura, 1, 3);
		grid.add(button, 0, 4);	
		grid.add(etiquetaResultadoPerimetro, 0, 5);
		grid.add(resultadoPerimetro, 1, 5);
		grid.add(etiquetaResultadoArea, 0, 6);
		grid.add(resultadoArea, 1, 6);
		Scene scene = new Scene(grid);
		
		primaryStage.setScene(scene);
		primaryStage.setHeight(600); //Alto de la ventana.
		primaryStage.setWidth(600); //Ancho de la ventana.
		
		//Calcula el perímetro y el área y le damos funcionalidad al botón.
		button.setOnAction(new EventHandler<ActionEvent>() {
			public void handle (ActionEvent event) {
				double baseRectangulo = Double.parseDouble(base.getText());
				double alturaRectangulo = Double.parseDouble(altura.getText());
				
				double area = baseRectangulo*alturaRectangulo;
				resultadoArea.setText(area + "");
				
				double perimetro = (baseRectangulo*alturaRectangulo) * 2;
				resultadoPerimetro.setText(perimetro + "");
			}
			
		});
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
