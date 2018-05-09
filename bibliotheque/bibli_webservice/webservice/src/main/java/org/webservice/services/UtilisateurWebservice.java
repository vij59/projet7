package org.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.application.model.Utilisateur;

@WebService(serviceName = "Utilisateur")
public class UtilisateurWebservice extends AbstractWebservice {

	@WebMethod
	public List<Utilisateur> getUtilisateurs() {

		List<Utilisateur> list = getManagerFactory().getUtilisateurManager().getUtilisateurs();

		return list;
	}

	@WebMethod
	public boolean validerLoginString(String utilisateur, String mdp) {
		return getManagerFactory().getUtilisateurManager().validerLogin(utilisateur, mdp);
	}

	@WebMethod
	public Utilisateur getUtilisateurByMail(String mail) {
		return getManagerFactory().getUtilisateurManager().getUtilisateurByMail(mail);
	}

}