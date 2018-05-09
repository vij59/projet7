package org.application.business.contract;

import java.util.List;

import org.application.model.Utilisateur;

public interface UtilisateurManager {

	public List<Utilisateur> getUtilisateurs();

	boolean validerLogin(String mail, String mdp);

	Utilisateur getUtilisateurByMail(String mail);
}
