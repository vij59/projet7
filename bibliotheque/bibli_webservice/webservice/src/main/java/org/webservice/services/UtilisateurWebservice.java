package org.webservice.services;

import org.application.model.Utilisateur;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

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

    @WebMethod
    public void setRappelActifByUserId(int idUser) {
        getManagerFactory().getUtilisateurManager().setRappelActif(idUser);
    }

    @WebMethod
    public void setRappelInActifByUserId(int idUser) {
        getManagerFactory().getUtilisateurManager().setRappelInActif(idUser);
    }

    @WebMethod
    public Utilisateur getUtilisateurById(int idUser) {
        return getManagerFactory().getUtilisateurManager().getUtilisateurById(idUser);

    }

}