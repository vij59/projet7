package org.application.consumer.impl;

import org.application.consumer.contract.UtilisateurDAO;
import org.webservice.services.Utilisateur;
import org.webservice.services.UtilisateurWebservice;
import org.webservice.services.Utilisateur_Service;

import java.util.List;

public class UtilisateurDAOImpl implements UtilisateurDAO {

    Utilisateur_Service utilisateurService = new Utilisateur_Service();
    UtilisateurWebservice utilisateurWebService = utilisateurService.getUtilisateurWebservicePort();

    @Override
    public List<Utilisateur> getUtilisateurs() {
        return utilisateurWebService.getUtilisateurs();
    }

    @Override
    public boolean validerLogin(String mail, String mdp) {
        return utilisateurWebService.validerLoginString(mail, mdp);

    }

    @Override
    public Utilisateur getUtilisateurByMail(String mail) {
        return utilisateurWebService.getUtilisateurByMail(mail);
    }

    @Override
    public void setRappelInactifById(int idUser) {
        utilisateurWebService.setRappelInActifByUserId(idUser);
    }

    @Override
    public void setRappelActifById(int idUser) {
        utilisateurWebService.setRappelActifByUserId(idUser);
    }

    @Override
    public Utilisateur getUtilisateurById(int idUser) {
        return utilisateurWebService.getUtilisateurById(idUser);
    }

}
