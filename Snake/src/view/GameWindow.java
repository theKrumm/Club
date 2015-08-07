package view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GameWindow extends Application {
	Image snakePicture;
	Node snakeImageView;
	Canvas canvas;

	public static void main(String[] theArgs) {
		launch(theArgs);
	}
	
	@Override
    public void start(Stage primaryStage) {
		canvas = new Canvas(800, 600);
		buildBackground(canvas);
        snakePicture = new Image("https://s-media-cache-ak0.pinimg.com/originals/cb/91/72/cb9172eba64a409ebc3422a3c22ba6e7.jpg");
        snakeImageView = new ImageView(snakePicture);
        Group park = new Group(snakeImageView);
        park.getChildren().add(canvas);
        Scene scene = new Scene(park, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	private void buildBackground(Canvas canvas) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.RED);
		int x = 0;
		int y = 0;
		while (x <= 800 && y < 700) {
			gc.fillRect(x, y, 25, 25);
			x+=50;
			
			
		}
	}

}
