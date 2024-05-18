package application;

import java.util.ArrayList;

public class PatientData {

	 private ArrayList<Patient> patientList;

	    // constructor to initialize the ArrayList
	    public PatientData() {
	        patientList = new ArrayList<Patient>();
	    }

	    // method to add a new patient
	    public void addPatient(Patient pat) {
	        patientList.add(pat);
	    }

	    // method to find a patient by name
	    public Patient findPByName(String nom) {
	        for (Patient p : patientList) {
	            if (p.getNom().equals(nom)) {
	                return p;
	            }
	        }
	        return null;
	    }
	    
	    // method to remove a patient from the database
	    public void deletePatient(int id) {
	    	patientList.remove(id);
	    }


	    // method to get the number of patients 
	    public int getPatientCount() {
	        return patientList.size();
	    }

}
