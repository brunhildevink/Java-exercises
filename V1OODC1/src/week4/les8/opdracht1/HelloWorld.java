package week4.les8.opdracht1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application implements EventHandler<ActionEvent> {

	private Button btn;
	private Button btn2;
	
	@Override
	public void start(Stage primaryStage) {
		btn = new Button();
		btn.setText("Say 'Hello World'");
		btn.setOnAction(this);

		btn2 = new Button();
		btn2.setText("Say 'Goodbye!'");
		btn2.setOnAction(this);

		StackPane root = new StackPane();
		root.getChildren().add(btn);
		root.getChildren().add(btn2);

		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void handle(ActionEvent event) {
		if (event.getSource() == btn) {
			System.out.println("Hello World!");
			btn.toBack();
		} else {
			System.out.println("Goodbye world");
			btn2.toBack();
		}
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
