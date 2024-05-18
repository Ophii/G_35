package application;

import java.util.ArrayList;

public class Administrateur_Patient {
	    private ArrayList<Patient> adm;

	    public Administrateur_Patient() {
	    	
	        this.adm = new ArrayList<>();
	    }

	    // table a new Administration
	    public void tablePatient(Patient pat) {
	        adm.add(pat);
	    }
	    
	    public void ramovePatient(Patient pat) {
	        adm.remove(pat);
	    }

	    public ArrayList<Patient> getPatient() {
	        return adm;
	    }
	}

