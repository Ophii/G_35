
package application;

public class Malade {
	private String nom; 
	private String prenom; 
	private String date_naiss; 
	private int telephone; 
	private String adresse;
	private String nomMedecin;
	private String mail;
	private String nom_arg;
	private int num_arg;
	private int num_ass;
	private String comp_ass;
	private int num_assur;
	private int tele_med;
	
	public Malade( String nom , String prenom,String date_naiss, int telephone,String adresse,String nomMedecin,
	               String mail,String nom_arg,int num_arg,int num_ass,String comp_ass,int num_assur,int tele_med) {
		this.nom = nom;
		this.prenom = prenom;
		this.date_naiss = date_naiss;
		this.telephone = telephone;
		this.adresse = adresse;
		this.nomMedecin = nomMedecin;
		this.mail = mail;
		this.nom_arg = nom_arg;
		this.num_arg = num_arg;
		this.num_ass = num_ass;
		this.comp_ass = comp_ass;
		this.num_assur = num_assur;
		this.tele_med = tele_med;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNom_arg() {
		return nom_arg;
	}
	public void setNom_arg(String nom_arg) {
		this.nom_arg = nom_arg;
	}
	public int getNum_arg() {
		return num_arg;
	}
	public void setNum_arg(int num_arg) {
		this.num_arg = num_arg;
	}
	public int getNum_ass() {
		return num_ass;
	}
	public void setNum_ass(int num_ass) {
		this.num_ass = num_ass;
	}
	public String getComp_ass() {
		return comp_ass;
	}
	public void setComp_ass(String comp_ass) {
		this.comp_ass = comp_ass;
	}
	public int getNum_assur() {
		return num_assur;
	}
	public void setNum_assur(int num_assur) {
		this.num_assur = num_assur;
	}
	public int getTele_med() {
		return tele_med;
	}
	public void setTele_med(int tele_med) {
		this.tele_med = tele_med;}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
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
	public String getNomMedecin() {
		return nomMedecin;
	}
	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDate_naiss() {
		return date_naiss;
	}
	public void setDate_naiss(String date_naiss) {
		this.date_naiss = date_naiss;
	}
	public String toString() {
		return("Nom:"+nom+"   prenom:"+prenom+"\nDate de naissance:"+date_naiss+"\nAdresse:"+adresse+
			"\nTelephone;"+telephone+"\nMail"+mail+"\nNom de medecin:"+nomMedecin+"\nTelephon de medecin:"+tele_med+
			"\nNom d'urgence "+nom_arg+"\nNuméro de téléphone d'urgence:"+num_arg+"\nN° d'assurance maladie :"+num_ass+
			"\nCompagnie d'assurance :"+comp_ass+"\nN° d'ssuré :"+num_assur);
	}
}
