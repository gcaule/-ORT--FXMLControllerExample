package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import application.view.*
;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			//On charge le fichier FXML pour l'utiliser comme scène
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/loginForm.fxml"));
			AnchorPane root = (AnchorPane) loader.load();
			
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}