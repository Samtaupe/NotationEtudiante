package NotationEtudiante;

import java.util.List;

import Enum.NiveauClasse;

public class Classe {
	int idClasse;
	// Car parfois les classes c'est des lettres donc ils clc
	String numClasse;
	List<Eleves> listesEleves;
	Enum<NiveauClasse> niveauClasse;
	public int getIdClasse() {
		return idClasse;
	}
	public String getNumClasse() {
		return numClasse;
	}
	public List<Eleves> getListesEleves() {
		return listesEleves;
	}
	public Enum<NiveauClasse> getNiveauClasse() {
		return niveauClasse;
	}
	public void setIdClasse(int idClasse) {
		this.idClasse = idClasse;
	}
	public void setNumClasse(String numClasse) {
		this.numClasse = numClasse;
	}
	public void setListesEleves(List<Eleves> listesEleves) {
		this.listesEleves = listesEleves;
	}
	public void setNiveauClasse(Enum<NiveauClasse> niveauClasse) {
		this.niveauClasse = niveauClasse;
	}
	
}
