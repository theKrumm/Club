package view;


import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
	public static void display(){
		Stage window = new Stage();
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("The Game Stataus!");
		window.setMinWidth(250);
		window.setMinHeight(150);
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,30));
		grid.setHgap(10);
		grid.setVgap(8);
		
		Label myLabel = new Label();
		GridPane.setConstraints(myLabel, 0, 0);
		myLabel.setText("The game is Paused!!");
		
		Button myButton1 = new Button("Close");
		GridPane.setConstraints(myButton1, 0, 1);
		myButton1.setOnAction(e->window.close());
		
		Button myButton2 = new Button("Continue");
		GridPane.setConstraints(myButton2, 0, 2);
		myButton2.setOnAction(e->window.close());
		
		Button myButton3 = new Button("newGame");
		GridPane.setConstraints(myButton3, 0, 3);
		myButton3.setOnAction(e->window.close());
		
//		VBox BottomMenu = new VBox();
     	grid.getChildren().addAll(myLabel, myButton1,myButton2,myButton3);
//		//BottomMenu.setAlignment();
		
		Scene scene = new Scene(grid, 300, 200);
		window.setScene(scene); 
		window.showAndWait();
	}
}
