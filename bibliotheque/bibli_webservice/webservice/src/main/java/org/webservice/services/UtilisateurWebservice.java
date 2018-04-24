package org.webservice.services;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.application.business.contract.ManagerFactory;
import org.application.model.Utilisateur;

	@WebService(serviceName= "Utilisateur")
	public class UtilisateurWebservice extends AbstractWebservice {


	@WebMethod
	public List<Utilisateur> getUtilisateurs() {

		List<Utilisateur> list = getManagerFactory().getUtilisateurManager().getUtilisateurs();

		return list;
	}


    @WebMethod
    public Utilisateur findUtilisateurByEmail(String mail)
    {
        return getManagerFactory().getUtilisateurManager().afficherUtilisateur(mail);
    }

    @WebMethod
    public void creerUtilisateur(Utilisateur utilisateur)
    {
        getManagerFactory().getUtilisateurManager().creerUtilisateur(utilisateur);
    }

    @WebMethod
    public void actualiserUtilisateur(Utilisateur utilisateur)
    {
        getManagerFactory().getUtilisateurManager().actualiserUtilisateur(utilisateur);
    }

    @WebMethod
    public void validerLogin(Utilisateur utilisateur, String mdp)
    {
        getManagerFactory().getUtilisateurManager().validerLogin(utilisateur, mdp);
    }
    
    @WebMethod
    public boolean validerLoginString(String utilisateur, String mdp)
    {
        return getManagerFactory().getUtilisateurManager().validerLogin(utilisateur, mdp);
    }
    

}