package NotationEtudiante;

import java.util.Date;

public class Resultat {
	int idResultat;
	String prenom;
	String nom;
	String email;
	Date dateExam;
	int nbEtudiants;
	float moyenne;
	float mediane;
	
	
	public int getIdResultat() {
		return idResultat;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getNom() {
		return nom;
	}
	public String getEmail() {
		return email;
	}
	public Date getDateExam() {
		return dateExam;
	}
	public int getNbEtudiants() {
		return nbEtudiants;
	}
	public float getMoyenne() {
		return moyenne;
	}
	public float getMediane() {
		return mediane;
	}
	public void setIdResultat(int idResultat) {
		this.idResultat = idResultat;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDateExam(Date dateExam) {
		this.dateExam = dateExam;
	}
	public void setNbEtudiants(int nbEtudiants) {
		this.nbEtudiants = nbEtudiants;
	}
	public void setMoyenne(float moyenne) {
		this.moyenne = moyenne;
	}
	public void setMediane(float mediane) {
		this.mediane = mediane;
	}
	
	
	
}
