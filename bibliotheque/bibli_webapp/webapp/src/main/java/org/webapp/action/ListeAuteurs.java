package org.webapp.action;

import java.util.List;

import org.webapp.resource.AbstractRessource;
import org.webservice.services.Auteur;

public class ListeAuteurs extends AbstractRessource {
	
	private List<Auteur> listeAuteurs;
	private Auteur auteur;
	public List<Auteur> getListeAuteurs() {
		return listeAuteurs;
	}
	public void setListeAuteurs(List<Auteur> listeAuteurs) {
		this.listeAuteurs = listeAuteurs;
	}
	public Auteur getAuteur() {
		return auteur;
	}
	public void setAuteur(Auteur auteur) {
		this.auteur = auteur;
	}

	public String execute(){
        listeAuteurs = getManagerFactory().getAuteurManager().getAuteurs();
        return "success";
 }
	
}
