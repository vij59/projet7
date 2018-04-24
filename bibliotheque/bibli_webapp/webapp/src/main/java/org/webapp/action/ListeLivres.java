package org.webapp.action;

import java.util.List;

import org.webapp.resource.AbstractRessource;
import org.webservice.services.Auteur;
import org.webservice.services.Livre;

public class ListeLivres extends AbstractRessource{

	 private List<Livre> listeLivres;
	 private Livre livre;
	 private Auteur auteur;
	 private List<Auteur> listeAuteurs;

	public List<Livre> getListeLivres() {
		return listeLivres;
	}

	public void setListeLivres(List<Livre> listeLivres) {
		this.listeLivres = listeLivres;
	}
	 
	 public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public List<Auteur> getListeAuteurs() {
		return listeAuteurs;
	}

	public void setListeAuteurs(List<Auteur> listeAuteurs) {
		this.listeAuteurs = listeAuteurs;
	}

	public String execute(){
	        listeLivres = getManagerFactory().getLivreManager().getLivres();
	        listeAuteurs = getManagerFactory().getAuteurManager().getAuteurs();
	        
	        return "success";
	 }

}
