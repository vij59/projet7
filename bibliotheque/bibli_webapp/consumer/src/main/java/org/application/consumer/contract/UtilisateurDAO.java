package org.application.consumer.contract;

import java.util.List;

import org.webservice.services.Utilisateur;

public interface UtilisateurDAO {
	
	public List<Utilisateur> getUtilisateurs();
	public boolean validerLogin(String mail, String mdp);
	Utilisateur getUtilisateurByMail(String mail);

}


