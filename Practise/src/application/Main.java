package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {
	Button myButton2,myButton3,myButton4;
	Scene scene;
	MenuItem small, medium, large;
	BorderPane borderpanel;
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		try {
			
			HBox bottomMenu = new HBox();
			
			Menu fileMenu = new Menu("File");
			fileMenu.getItems().add(new MenuItem("New"));
			fileMenu.getItems().add(new MenuItem("Open"));
			fileMenu.getItems().add(new SeparatorMenuItem());
			fileMenu.getItems().add(new MenuItem("Save"));
			fileMenu.getItems().add(new MenuItem("Exit"));
			
			Menu viewMenu = new Menu("View");
		    small = new MenuItem("Small");
		    small.setOnAction(e->System.out.print("Small screen!!"));
		    //small.setOnAction(e -> scene = new Scene(borderpanel, 300,200));
			viewMenu.getItems().add(small); 
			
			medium = new MenuItem("Medium");
			viewMenu.getItems().add(medium); 
			
			
			large = new MenuItem("Large");
			viewMenu.getItems().add(large); 
		
			
			Menu highScore = new Menu("HighScore");
			highScore.getItems().add(new MenuItem("First score"));
			highScore.getItems().add(new MenuItem("Second score"));
			highScore.getItems().add(new MenuItem("Thrid score"));
			
			Menu helpMenu = new Menu("Help");
			helpMenu.getItems().add(new MenuItem("How to play?"));
			helpMenu.getItems().add(new MenuItem("Score algorithm"));
			MenuBar menuBar = new MenuBar();
			menuBar.getMenus().addAll(fileMenu,viewMenu, highScore, helpMenu);
			myButton2 = new Button();
			myButton2.setText("Start Game");
			myButton2.setOnAction(e ->System.out.println("Welcome to Game Center!!, Have fun:)"));
			
			myButton3 = new Button();
			myButton3.setText("Pause Game");
			myButton3.setOnAction(e -> AlertBox.display());
//			myButton3.setOnAction(new EventHandler<ActionEvent>(){
//
//				@Override
//				public void handle(ActionEvent event) {
//					System.out.println("Would you give me a minutes!!");
//					
//				}
//				
//			});
//			
			GridPane grid = new GridPane();
			grid.setPadding(new Insets(10,50,10,10));
			grid.setHgap(20);
			Label scoreLabel = new Label("Score: ");
			//scoreLabel.setStyle("-fx-text-fill:aliceblue");
			TextField scorefield = new TextField();
		    myButton4 = new Button();
			myButton4.setText("End Game");
			myButton4.setOnAction(this);
			//myButton6.setOnAction(e ->primaryStage.setScene(scene));
			
			
			borderpanel = new BorderPane();
			//topMenu.getItems().addAll(fileMenu, viewMenu, highScore, helpMenu);
			//fileMenu.setPadding(new Insets(0,10,10,10));
			bottomMenu.getChildren().addAll(myButton2, myButton3, myButton4, scoreLabel, scorefield);
			bottomMenu.setPadding(new Insets(10,10,10,10));
			borderpanel.setTop(menuBar);
			borderpanel.setBottom(bottomMenu);
			
			scene = new Scene(borderpanel,600,400);
			//small.setOnAction(e->new Scene(borderpanel, 800, 600));
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			scene.getStylesheets().add("application.css");
			primaryStage.setTitle("Snake Game!!");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void handle(ActionEvent event) {
		if(event.getSource() == small){
			scene = new Scene(borderpanel, 800, 800);
		}

		if(event.getSource() == myButton4){
			System.out.println("I hope you enjoyed the game, GoodBye!!");
		}
		
	}
	
}
