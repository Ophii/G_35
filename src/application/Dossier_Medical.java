package application;

import java.io.IOException;
import java.util.ArrayList;

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

public class Dossier_Medical {
	
	Administrateur_Malade admn = new Administrateur_Malade();
	MaladeData maladedata= new MaladeData();
	
	
	private Scene scene;
	private Parent root;
	private Stage stage;
	
	 
	@FXML
	private AnchorPane main4;
	@FXML
	private TextField textnom; 
	@FXML
	private TextField textprenom; 
	@FXML
	private TextField textadresse; 
	@FXML
	private TextField texttelephon;
	@FXML
	private TextField textmedecin;
	@FXML
	private TextField textdate_naiss;
	@FXML
	private TextField textmail;
	@FXML
	private TextField textnom_arg;
	@FXML
	private TextField textnum_arg;
	@FXML
	private TextField textnum_ass;
	@FXML
	private TextField textcomp_ass;
	@FXML
	private TextField textnum_assur;
	@FXML
	private TextField texttele_med;
	@FXML
	private Button savebutton;
	
		
	
	public void getinfo(ActionEvent e) {
		try {
			
			String nom = textnom.getText();
	        String prenom = textprenom.getText();
	        String date_naiss = textdate_naiss.getText();
	        String adresse = textadresse.getText();
	        int telephon = Integer.parseInt(texttelephon.getText());
			String medecin = textmedecin.getText();
		    String mail = textmail.getText();
		    int num_arg = Integer.parseInt(textnum_arg.getText());
		    int num_ass =Integer.parseInt(textnum_ass.getText());
		    String comp_ass = textcomp_ass.getText();
		    int num_assur =Integer.parseInt(textnum_assur.getText());
		    int tele_med =Integer.parseInt(texttele_med.getText());
		    String nom_arg =textnom_arg.getText();
		    
		    // create a new patient object
	        Malade newMalade = new Malade(nom,prenom,date_naiss,telephon,adresse,medecin,
		                mail, nom_arg, num_arg, num_ass, comp_ass, num_assur, tele_med) ;
	    		
	        
	        // add the patient's data to the patient database
	        maladedata.ajouterMalade(newMalade);
	        // schedule the appointment
	        admn.tableMalade(newMalade);

	    
	    	ArrayList<Malade> list = admn.getMalade();
	    	for (Malade m : list) {  
	    	    System.out.println(m.toString());
	    	}
		    savebutton.setStyle("-fx-background-color: green;");
		}
		catch(Exception ev) {
			System.out.println(ev);
			savebutton.setStyle("-fx-background-color: red;");
		}
		
	}
	
	public void ouvrirMain5(ActionEvent e) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("Main5.fxml"));
		 stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();
	}
 public void ouvrirMain6(ActionEvent e) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("Main6.fxml"));
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
	
 public void exit4(ActionEvent e) {
	   stage = (Stage) main4.getScene().getWindow();
	   stage.close();
	}

}
