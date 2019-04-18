package application.view;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.application.Application;

public class loginFormController {
	
	//La balise @FXML permet de récupérer l'ID dans Scene Builder
	@FXML
	private TextField tfInputText;
	@FXML
	private Label labOutputText;
	
	//Sans balise @FXML, la portée public est nécessaire
	public void handleclickMe() {
		System.out.println("Hello !");
		labOutputText.setText(tfInputText.getText());
	}

}