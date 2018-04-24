package org.application.consumer.impl;

import java.util.List;

import org.application.consumer.contract.AuteurDAO;
import org.webservice.services.Auteur;
import org.webservice.services.AuteurWebservice;
import org.webservice.services.Auteur_Service;
import org.webservice.services.LivreWebservice;
import org.webservice.services.Livre_Service;

public class AuteurDAOImpl implements AuteurDAO {

	@Override
	public List<Auteur> getAuteurs() {

		Auteur_Service auteurService = new Auteur_Service();
		AuteurWebservice auteurWebService = auteurService.getAuteurWebservicePort();
		return auteurWebService.listAuteurs();
		}

}
