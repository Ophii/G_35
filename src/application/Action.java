package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Action {

	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML 
	private Button exitbutton;
	@FXML 
	private AnchorPane main;
	@FXML
	private AnchorPane main2;
	

       public void ouvrirMain2(ActionEvent e) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("Main2.fxml"));
		 stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
		 
	}
       public void ouvrirMain3(ActionEvent e) throws IOException {
			 root = FXMLLoader.load(getClass().getResource("Main3.fxml"));
			 stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			 scene = new Scene(root);
			 stage.setScene(scene);
			 stage.show();
		}
       public void ouvrirMain4(ActionEvent e) throws IOException {
    	   root = FXMLLoader.load(getClass().getResource("Main4.fxml"));
			 stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			 scene = new Scene(root);
			 stage.setScene(scene);
			 stage.show();	 
		}
       
       public void ouvrirMain7(ActionEvent e) throws IOException {
			 root = FXMLLoader.load(getClass().getResource("Main7.fxml"));
			 stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			 scene = new Scene(root);
			 stage.setScene(scene);
			 stage.show();
		
		}
       
       public void returnmain2(ActionEvent e) throws IOException {
			 root = FXMLLoader.load(getClass().getResource("Main2.fxml"));
			 stage = (Stage)((Node)e.getSource()).getScene().getWindow();
			 scene = new Scene(root);
			 stage.setScene(scene);
			 stage.show();	 
		}
       
       public void exit(ActionEvent e) {
			   stage = (Stage) main.getScene().getWindow();
			   stage.close();
			}
       public void exit2(ActionEvent e) {
			   stage = (Stage) main2.getScene().getWindow();
			   stage.close();
			}
}

