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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Certafica_medical {

	private Vector<String> vec = new Vector<String>();
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	private AnchorPane main6;
	

	@FXML
	private TextField textdate;
	@FXML
	private TextField textnom;
	@FXML
	private TextField textage;
	@FXML
	private TextField textmed;
	@FXML
	private TextField textrep;
	@FXML
	private TextField textduree;
	@FXML
	private TextField textdeb;
	@FXML
	private TextField textfin;
	@FXML
	private TextField textcua;
	@FXML
	private Button savebutton;
	
	
	
	public void getinfo(ActionEvent e) {
		try {
			vec.addElement(textnom.getText());
		    vec.addElement(textmed.getText());
		    vec.addElement(textrep.getText());
		    vec.addElement(textdeb.getText());
		    vec.addElement(textfin.getText());
		    vec.addElement(textcua.getText());
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
	
	 public void exit6(ActionEvent e) {
		   stage = (Stage) main6.getScene().getWindow();
		   stage.close();
		}

}
