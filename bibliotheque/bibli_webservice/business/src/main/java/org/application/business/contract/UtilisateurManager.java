package org.application.business.contract;

import java.util.List;

import org.application.model.Utilisateur;

public interface UtilisateurManager {

	public List<Utilisateur> getUtilisateurs();
	 void creerUtilisateur(Utilisateur utilisateur);
	    void actualiserUtilisateur(Utilisateur utilisateur);
	    boolean validerLogin (Utilisateur utilisateur, String password);
	    Utilisateur afficherUtilisateur(String mail);
		boolean validerLogin(String mail, String password);
		Utilisateur getUtilisateurByEmail(String mail);
}
