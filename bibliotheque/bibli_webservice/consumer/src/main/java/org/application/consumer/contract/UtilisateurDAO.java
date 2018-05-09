package org.application.consumer.contract;

import java.util.List;

import org.application.model.Utilisateur;

public interface UtilisateurDAO {

	public List<Utilisateur> getUtilisateurs();

	Utilisateur getUtilisateurByMail(String mail);

}
