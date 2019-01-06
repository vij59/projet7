package org.application.business.impl;

import org.application.business.contract.UtilisateurManager;
import org.webservice.services.Utilisateur;

import java.util.List;


public class UtilisateurManagerImpl extends AbstractManager implements UtilisateurManager {

    public List<Utilisateur> getUtilisateurs() {

        return getDaoFactory().getUtilisateurDao().getUtilisateurs();
    }

    @Override
    public boolean validerLogin(String mail, String mdp) {
        return getDaoFactory().getUtilisateurDao().validerLogin(mail, mdp);

    }

    @Override
    public Utilisateur getUtilisateurByMail(String mail) {
        return getDaoFactory().getUtilisateurDao().getUtilisateurByMail(mail);
    }

    @Override
    public void setRappelInactifById(int idUser) {
        getDaoFactory().getUtilisateurDao().setRappelInactifById(idUser);
    }

    @Override
    public void setRappelActifById(int idUser) {
        getDaoFactory().getUtilisateurDao().setRappelActifById(idUser);
    }

    @Override
    public Utilisateur getUtilisateurById(int idUser) {
        return getDaoFactory().getUtilisateurDao().getUtilisateurById(idUser);
    }
}
