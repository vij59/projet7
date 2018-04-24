package org.webapp.action;

import java.util.List;

import org.webapp.resource.AbstractRessource;
import org.webservice.services.Livre;

public class Recherche extends AbstractRessource {
	private String titre, nomAuteur;
	private List<Livre> listeLivres;
	

	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getNomAuteur() {
		return nomAuteur;
	}


	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}


	public List<Livre> getListeLivres() {
		return listeLivres;
	}


	public void setListeLivres(List<Livre> listeLivres) {
		this.listeLivres = listeLivres;
	}


	public String execute() {
		listeLivres = getManagerFactory().getLivreManager().getLivreByRecherche(titre, nomAuteur);
			return "success";
		
	}

}