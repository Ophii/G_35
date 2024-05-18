package application;

public class PatientF {

	private String nom; 
	private String prenom; 
	private String adresse; 
	private int telephone; 
	private int age;
	private String date_naiss;
	private String sexe;
    private String mail;
    private String poids;
    private String tail;
    private String ope;
    private String medi;
    private String nom_med;
    private String dos;
    private String rapp;
    
    public PatientF(String nom,String prenom,String adresse, int telephon ,int age, String date_naiss,String sexe,
    		 String mail, String poids, String tail, String ope,String medi, String nom_med,String dos,String rapp) {
    	this.nom = nom;
    	this.prenom = prenom;
    	this.adresse = adresse;
    	this.telephone = telephon;
    	this.age = age;
    	this.date_naiss = date_naiss;
    	this.sexe = sexe;
    	this.mail = mail;
    	this.poids = poids;
    	this.tail = tail;
    	this.ope = ope;
    	this.medi = medi;
    	this.nom_med = nom_med;
    	this.dos = dos;
    	this.rapp = rapp;
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
	public String getEmail() {
		return mail;
	}
	public void setEmail(String email) {
		this.mail = email;
	}
	public String getPoids() {
		return poids;
	}
	public void setPoids(String poids) {
		this.poids = poids;
	}
	public String getTail() {
		return tail;
	}
	public void setTail(String tail) {
		this.tail = tail;
	}
	public String getOpe() {
		return ope;
	}
	public void setOpe(String ope) {
		this.ope = ope;
	}
	public String getMedi() {
		return medi;
	}
	public void setMedi(String medi) {
		this.medi = medi;
	}
	public String getNom_med() {
		return nom_med;
	}
	public void setNom_med(String nom_med) {
		this.nom_med = nom_med;
	}
	public String getDos() {
		return dos;
	}
	public void setDos(String dos) {
		this.dos = dos;
	}
	public String getRapp() {
		return rapp;
	}
	public void setRapp(String rapp) {
		this.rapp = rapp;
	}
	public String toString() {
		return("Nom:"+nom+"   prenom:"+prenom+"\nDate de naissance:"+date_naiss+"\nAdresse:"+adresse+
			"\nTelephone;"+telephone+"\nAge"+age+"\nSexe:"+sexe+"\nPoids:"+poids+
			"\nTaille "+tail+"\nEmail:"+mail+"\nles operation est:"+ope+"\nMedicaments:"+medi+"\nNom de medicaments:"
			+nom_med+"\nLa dose est :"+dos+"\nle rapport medical:"+rapp);
	}
	 
}
