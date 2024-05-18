package application;

public class Patient {
	
	private String nom; 
	private String prenom; 
	private String adresse; 
	private int telephone; 
	private int age;
	private String date_naiss;
	private String sexe;
    private String date; 
	private String heure; 
	private String nomMedecin;
	

	public Patient(String nom, String prenom, String date_naiss, String adresse, int telephone, 
			int age, String sexe, String heure, String date, String nomMedecin) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naiss = date_naiss;
        this.adresse = adresse;
        this.telephone = telephone;
        this.age = age;
        this.sexe = sexe;
        this.heure = heure;
        this.date = date;
        this.nomMedecin = nomMedecin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDate_naiss() {
		return date_naiss;
	}
	public void setDate_naiss(String date_naiss) {
		this.date_naiss = date_naiss;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	public String getNomMedecin() {
		return nomMedecin;
	}
	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}
	public String toString() {
		return("Nom:"+nom+"   prenom:"+prenom+"\nDate de naissance:"+date_naiss+"\nAdresse:"+adresse+
			"\nTelephone;"+telephone+"\nAge"+age+"\nSexe:"+sexe+"\nDate:"+date+
			"\nHeure "+heure+"\nNom de Medcin:"+nomMedecin);
	}
}
