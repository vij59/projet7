package org.application.consumer.impl;

import java.util.List;

import org.application.consumer.contract.AuteurDAO;
import org.webservice.services.Auteur;
import org.webservice.services.AuteurWebservice;
import org.webservice.services.Auteur_Service;

public class AuteurDAOImpl implements AuteurDAO {

	Auteur_Service auteurService = new Auteur_Service();
	AuteurWebservice auteurWebService = auteurService.getAuteurWebservicePort();

	@Override
	public List<Auteur> getAuteurs() {
		return auteurWebService.listAuteurs();
	}

}
