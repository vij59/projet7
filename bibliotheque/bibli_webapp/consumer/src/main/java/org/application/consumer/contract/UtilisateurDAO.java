package org.application.consumer.contract;

import java.util.List;

import org.webservice.services.Utilisateur;

public interface UtilisateurDAO {
	
	List<Utilisateur> getUtilisateurs();
	boolean validerLogin(String mail, String mdp);
	Utilisateur getUtilisateurByMail(String mail);

    void setRappelInactifById(int idUser);

	void setRappelActifById(int idUser);

    Utilisateur getUtilisateurById(int idUser);
}


