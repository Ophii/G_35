package application;

import java.util.ArrayList;

public class Administrateur_patientF {

	  private ArrayList<PatientF> admF;

	    public Administrateur_patientF() {
	    	
	        this.admF = new ArrayList<>();
	    }

	    // table a new Administration
	    public void tablePatientF(PatientF patF) {
	        admF.add(patF);
	    }
	    
	    public void ramovePatientF(PatientF patF) {
	        admF.remove(patF);
	    }

	    public ArrayList<PatientF> getPatientF() {
	        return admF;
	    }
}
