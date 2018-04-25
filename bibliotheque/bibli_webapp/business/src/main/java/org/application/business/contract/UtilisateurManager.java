package org.application.business.contract;

import java.util.List;

import org.webservice.services.Utilisateur;

public interface UtilisateurManager {

	public List<Utilisateur> getUtilisateurs();
	public boolean validerLogin(String mail, String mdp);
	Utilisateur getUtilisateurByMail(String mail);
	
}
