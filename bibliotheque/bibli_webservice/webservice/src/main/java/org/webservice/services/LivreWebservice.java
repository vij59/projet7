package org.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.application.model.Auteur;
import org.application.model.Livre;

@WebService(serviceName = "Livre")
	public class LivreWebservice extends AbstractWebservice {

	    @WebMethod
	    public List<Livre> getByNom(String nom) {
	        return getManagerFactory().getLivreManager().getLivreByNom(nom);
	    }

	    @WebMethod
	    public Livre getById(long id) {
	        return getManagerFactory().getLivreManager().getLivre(id);
	    }

	    @WebMethod
	    public List<Livre> getLivres() {
	    	List<Livre> listeLivres = getManagerFactory().getLivreManager().getLivres();
	    	for(Livre livre : listeLivres ) {
	    		Auteur auteur = getManagerFactory().getAuteurManager().getAuteurById(livre.getIdAuteur());
	    		livre.setAuteur(auteur);
	    		boolean dispo = getManagerFactory().getEmpruntManager().empruntPossible(livre.getId());	  
	    		livre.setDisponible(dispo);}
	        return listeLivres;
	    }
	    
	   
	   
	    @WebMethod
	    public List<Livre>  getLivreByRecherche(String titre, String auteur) {
//	    if (titre == null) {
//	    	titre = "";
//	    }
//	    if (auteur == null) {
//	    	auteur = "";
//	    }
	        return getManagerFactory().getLivreManager().getLivreByRecherche(titre,auteur);
	    }
}
