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

public class Render_vous  {
	
	
	Administrateur_Patient adm = new Administrateur_Patient();
	PatientData patientdata= new PatientData();
	
	@FXML
	private AnchorPane main3;
	private Stage stage;
	private Scene scene;
	private Parent root;
    @FXML
	private TextField textnom; 
	@FXML
	private TextField textprenom; 
	@FXML
	private TextField textadresse; 
	@FXML
	private TextField textage; 
	@FXML
	private TextField textsexe; 
	@FXML
	private TextField texttelephon;
	@FXML
	private TextField textmedecin;
	@FXML
	private TextField textdate;
	@FXML
	private TextField textheure;
	@FXML
	private TextField textdate_naiss;
	@FXML
	private Button savebutton;
	
	
	public void getinfo(ActionEvent e) {
		try {
	
			String nom = textnom.getText();
	        String prenom = textprenom.getText();
	        String date_naiss = textdate_naiss.getText();
	        String adresse = textadresse.getText();
	        int telephon = Integer.parseInt(texttelephon.getText());
	        int age = Integer.parseInt(textage.getText());
	        String sexe = textsexe.getText();
	        String heure = textheure.getText();
	        String date = textdate.getText();
	        String nomMedecin = textmedecin.getText();

	        // create a new patient object
	        Patient newPatient = new Patient(nom, prenom, date_naiss, adresse,
	        		telephon, age, sexe, heure, date, nomMedecin);
	        
	        // add the patient's data to the patient database
	        patientdata.addPatient(newPatient);
	        // schedule the appointment
	        adm.tablePatient(newPatient);
  
	        ArrayList<Patient> list = adm.getPatient();
	    	for (Patient m : list) {  
	    	    System.out.println(m.toString());
	    	}
	        
	        // set the button style to green to indicate success
	        savebutton.setStyle("-fx-background-color: green;");
	    }
	    catch(Exception ev) {
	        System.out.println(ev);
	        // set the button style to red to indicate failure
	        savebutton.setStyle("-fx-background-color: red;");
		}	
	}
		
	public void exit3(ActionEvent e) {
		   stage = (Stage) main3.getScene().getWindow();
		   stage.close();
		}
	public void returnmain2(ActionEvent e) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("Main2.fxml"));
		 stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();	 
	}
	

}
