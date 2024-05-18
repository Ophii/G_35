package application;

import java.util.ArrayList;

public class MaladeData {

	 private ArrayList<Malade> malade = new ArrayList<>();

	    public void ajouterMalade(Malade malades) {
	        malade.add(malades);
	    }

	    public void supprimerMalade(int indexMalade) {
	        malade.remove(indexMalade);
	    }
	    public Malade findPByName(String nom) {
	        for (Malade m : malade) {
	            if (m.getNom().equals(nom)) {
	                return m;
	            }
	        }
	        return null;
	    }

	    public ArrayList<Malade> getMalade() {
	        return malade;
	    }

}
