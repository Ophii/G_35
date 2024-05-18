package application;

import java.io.IOException;
import java.util.Vector;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Ordonnance {
	private Vector<String> vec = new Vector<String>();

	@FXML
	private TextField textdate;
	@FXML
	private TextField textnom;
	@FXML
	private TextField textage;
	@FXML
	private TextField textmed;
	@FXML
	private TextArea textmedicament;
	@FXML
	private TextArea textdose;
	@FXML
	private TextArea textduree;
	@FXML
	private AnchorPane main5;
	@FXML
	private Button savebutton;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void getinfo(ActionEvent e) {
		try {
			vec.addElement(textnom.getText());
		    vec.addElement(textmed.getText());
		    vec.addElement(textmedicament.getText());
		    vec.addElement(textdose.getText());
		    vec.addElement(textage.getText());
		    vec.addElement(textduree.getText());
		    vec.addElement(textdate.getText());
		    savebutton.setStyle("-fx-background-color: green;");
		}
		catch(Exception ev) {
			System.out.println(ev);
			savebutton.setStyle("-fx-background-color: red;");
		}	
	}
	
	public void returnmain4(ActionEvent e) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("Main4.fxml"));
		 stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();	 
	}
 
	 public void exit5(ActionEvent e) {
		   stage = (Stage) main5.getScene().getWindow();
		   stage.close();
		}
    
	
}
