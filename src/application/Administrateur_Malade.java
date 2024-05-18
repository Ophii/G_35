package application;

import java.util.ArrayList;

public class Administrateur_Malade {

	private ArrayList<Malade> admn;

    public Administrateur_Malade() {
    	
        this.admn = new ArrayList<>();
    }

    // table a new Administration
    public void tableMalade(Malade newMalade) {
        admn.add(newMalade);
    }
    
    public void ramoveMalade(Malade mal) {
        admn.remove(mal);
    }


    // Retrieve a list of all scheduled appointments
    public ArrayList<Malade> getMalade() {
        return admn;
    }
}
