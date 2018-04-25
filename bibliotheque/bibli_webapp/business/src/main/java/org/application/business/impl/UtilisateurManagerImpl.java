package org.application.business.impl;

import java.util.List;

import org.application.business.contract.UtilisateurManager;
import org.webservice.services.Utilisateur;


public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager {

	public List<Utilisateur> getUtilisateurs() {

		return getDaoFactory().getUtilisateurDao().getUtilisateurs();
	}

	@Override
	public boolean validerLogin(String mail, String mdp) {
		return getDaoFactory().getUtilisateurDao().validerLogin(mail,mdp);
		
	}
	
	@Override
	public Utilisateur getUtilisateurByMail(String mail) {
		return getDaoFactory().getUtilisateurDao().getUtilisateurByMail(mail);
		
	}
	

}
