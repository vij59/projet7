package org.application.consumer.contract;

import java.util.List;

import org.application.model.Utilisateur;

public interface UtilisateurDAO {
	
	public List<Utilisateur> getUtilisateurs();
	 void creerUtilisateur(Utilisateur utilisateur);
	    void actualiserUtilisateur(Utilisateur utilisateur);
	    boolean validerLogin (Utilisateur utilisateur, String password);
	    Utilisateur getUtilisateurByEmail(String mail);

}
