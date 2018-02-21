package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class MainController {
    @FXML
    private Label status;
    @FXML
    private TextField textUsername;
    @FXML
    private TextField password;
    
    public void Login(ActionEvent event) throws Exception{
    	if(textUsername.getText().equals("user") && password.getText().equals("pass")) {
    		status.setText("login Sucess");
    		Stage primaryStage=new Stage();
    		Parent root =FXMLLoader.load(getClass().getResource("MainFxml.fxml"));
    		Scene scene = new Scene(root,400,400);
    		primaryStage.setScene(scene);
    		primaryStage.show();
    	}
    	else {
    		status.setText("login is not  Sucess");
    	}
    }
}
