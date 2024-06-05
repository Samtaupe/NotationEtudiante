package NotationEtudiante;

import java.util.List;

import Enum.Matiere;

public class UtilisateurTab {
	String email;
	String password;
	
	String nom;
	String prenom;
	int age;
	
	Enum<Matiere> matiereEnseignee;
	List<Classe> classes;
	
	
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getAge() {
		return age;
	}
	public Enum<Matiere> getMatiereEnseignee() {
		return matiereEnseignee;
	}
	public List<Classe> getClasses() {
		return classes;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMatiereEnseignee(Enum<Matiere> matiereEnseignee) {
		this.matiereEnseignee = matiereEnseignee;
	}
	public void setClasses(List<Classe> classes) {
		this.classes = classes;
	}
	
	
}
