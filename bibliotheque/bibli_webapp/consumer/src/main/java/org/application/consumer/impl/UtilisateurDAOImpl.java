package org.application.consumer.impl;

import java.util.List;

import org.application.consumer.contract.UtilisateurDAO;
import org.webservice.services.Utilisateur;
import org.webservice.services.UtilisateurWebservice;
import org.webservice.services.Utilisateur_Service;

public class UtilisateurDAOImpl implements UtilisateurDAO{

	@Override
	public List<Utilisateur> getUtilisateurs() {
		Utilisateur_Service utilisateurService = new Utilisateur_Service();
		UtilisateurWebservice utilisateurWebService = utilisateurService.getUtilisateurWebservicePort();
		return utilisateurWebService.getUtilisateurs();
	}


	@Override
	public boolean validerLogin(String mail, String mdp) {
		// TODO Auto-generated method stub
		Utilisateur_Service utilisateurService = new Utilisateur_Service();
		UtilisateurWebservice utilisateurWebService = utilisateurService.getUtilisateurWebservicePort();
		return utilisateurWebService.validerLoginString(mail, mdp);
		
	}
	
	
}


   
