package org.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.application.model.Auteur;

@WebService(serviceName = "Auteur")
	public class AuteurWebservice extends AbstractWebservice {

	    @WebMethod
	    public List<Auteur> getAuteurByName(String nom) {
	        return getManagerFactory().getAuteurManager().getByNom(nom);
	    }

	    @WebMethod
	    public List<Auteur> listAuteurs() {
	        return getManagerFactory().getAuteurManager().getAuteurs();
	    }

	    @WebMethod
	    public void createAuteur(Auteur auteur){
	        getManagerFactory().getAuteurManager().creerAuteur(auteur);
	    }


}
