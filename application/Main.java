package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {						
			Pane root1 = (Pane)FXMLLoader.load(getClass().getResource("TestEkran.fxml"));			
			Scene scene1 = new Scene(root1,1024,600);
			primaryStage.setScene(scene1);
			primaryStage.show();	
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
