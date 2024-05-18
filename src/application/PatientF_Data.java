package application;

import java.util.ArrayList;

public class PatientF_Data {
	
	 private ArrayList<PatientF> patientF;

	    // constructor to initialize the ArrayList
	    public PatientF_Data() {
	    	patientF = new ArrayList<PatientF>();
	    }

	    // method to add a new patient
	    public void addPatientF(PatientF patF) {
	    	patientF.add(patF);
	    }

	    // method to find a patient by name
	    public PatientF findPByName(String nom) {
	        for (PatientF p : patientF) {
	            if (p.getNom().equals(nom)) {
	                return p;
	            }
	        }
	        return null;
	    }
	    
	    // method to remove a patient from the database
	    public void deletePatientF(int id) {
	    	patientF.remove(id);
	    }


	    // method to get the number of patients 
	    public int getPatientFCount() {
	        return patientF.size();
	    }

}
