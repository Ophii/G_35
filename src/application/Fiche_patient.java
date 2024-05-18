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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Fiche_patient {
	
	Administrateur_patientF admF = new Administrateur_patientF();
	PatientF_Data patientFdata= new PatientF_Data();
	
	@FXML
	private AnchorPane main7;
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
	private TextField texttelephon;
	@FXML
	private TextField textdate_naiss;
	@FXML
	private TextField textmail;
	@FXML
	private TextField textsexe;
	@FXML
	private TextField textage;
	@FXML
	private TextField textpoid;
	@FXML
	private TextField texttaill;
	@FXML 
	private TextField textcus_1;
	@FXML
	private TextField textcus_2;
	@FXML
	private TextArea textmed;
	@FXML
	private TextArea textdos;
	@FXML
	private TextArea textrapp;
	@FXML
	private CheckBox check_1;
	@FXML
	private CheckBox check_2;
	@FXML
	private CheckBox check_3;
	@FXML
	private Label res_1;
	@FXML
	private Label res_2;
	@FXML
	private Label res_3;
	@FXML
	private Button savebutton;
	
	
	
	public void getinfo(ActionEvent e) {
		try {
			String nom = textnom.getText();
			String prenom = textprenom.getText();
			String sexe = textsexe.getText();
			String date_naiss = textdate_naiss.getText();
			String cus_1 = textcus_1.getText();
			String cus_2 = textcus_2.getText();
			String adresse = textadresse.getText();
			String poid = textpoid.getText();
			String tail = texttaill.getText();
			int telephon = Integer.parseInt(texttelephon.getText());
			int age = Integer.parseInt(textage.getText());
			String mail = textmail.getText();
			String med = textmed.getText();
			String dos = textdos.getText();
			String rapp = textrapp.getText();
			
			 // create a new patient object
	        PatientF newPatientF = new PatientF(nom,prenom,adresse,telephon,age,date_naiss,sexe,mail,poid,tail,
	        		cus_1,cus_2,med,dos,rapp);
	        
	        // add the patient's data to the patient database
	        patientFdata.addPatientF(newPatientF);
	        // schedule the appointment
	        admF.tablePatientF(newPatientF);
  
	        ArrayList<PatientF> list = admF.getPatientF();
	    	for (PatientF m : list) {  
	    	    System.out.println(m.toString());
	    	}
	        
			
			
			
			
			
			savebutton.setStyle("-fx-background-color: green;");
		}
		catch(Exception ev) {
			System.out.println(ev);
			savebutton.setStyle("-fx-background-color: red;");
		}	
	}
	
	public void check1(ActionEvent e) {
		if(check_1.isSelected()) {
			res_1.setText("Oui");
		}else res_1.setText("Non");
	}
	public void check2(ActionEvent e) {
		if(check_2.isSelected()) {
			res_2.setText("Oui");
		}else res_2.setText("Non");
	}
	public void check3(ActionEvent e) {
		if(check_3.isSelected()) {
			res_3.setText("Oui");
		}else res_3.setText("Non");
	}
	
	
	public void returnmain2(ActionEvent e) throws IOException {
		 root = FXMLLoader.load(getClass().getResource("Main2.fxml"));
		 stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		 scene = new Scene(root);
		 stage.setScene(scene);
		 stage.show();	 
	}
	 public void exit7(ActionEvent e) {
		   stage = (Stage) main7.getScene().getWindow();
		   stage.close();
		}
}
