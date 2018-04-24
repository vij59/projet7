package org.application.consumer.impl;

import java.util.List;

import org.application.consumer.contract.LivreDAO;
import org.webservice.services.Livre;
import org.webservice.services.LivreWebservice;
import org.webservice.services.Livre_Service;

public class LivreDAOImpl implements LivreDAO{

	
	@Override
	public List<Livre> getLivres() {
		Livre_Service livreService = new Livre_Service();
		LivreWebservice livreWebService = livreService.getLivreWebservicePort();
		return livreWebService.getLivres();
	}

	@Override
	public List<Livre> getLivreByRecherche(String titre, String nomAuteur) {
		Livre_Service livreService = new Livre_Service();
		LivreWebservice livreWebService = livreService.getLivreWebservicePort();
		return livreWebService.getLivreByRecherche(titre, nomAuteur);
	}
	
	@Override
	public Livre getById(int id) {
		Livre_Service livreService = new Livre_Service();
		LivreWebservice livreWebService = livreService.getLivreWebservicePort();
		return livreWebService.getById(id);
	}

}
