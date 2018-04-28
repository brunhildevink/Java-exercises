package week4.les8.opdracht2;

import java.awt.Insets;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application implements EventHandler<ActionEvent> {

	private Button btn;
	private Button btn2;
	private Label label1;

	@Override
	public void start(Stage primaryStage) {
		btn = new Button();
		btn.setText("Say 'Hello World'");
		btn.setOnAction(this);
		
		Label label1 = new Label("hallo");
		

		btn2 = new Button();
		btn2.setText("Say 'Goodbye!'");
		btn2.setOnAction(this);

		HBox root = new HBox(10);
		root.getChildren().add(btn);
		root.getChildren().add(btn2);
		root.getChildren().add(label1);

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
