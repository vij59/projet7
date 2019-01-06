package org.application.business.contract;

import org.application.model.Utilisateur;

import java.util.List;

public interface UtilisateurManager {

    public List<Utilisateur> getUtilisateurs();

    boolean validerLogin(String mail, String mdp);

    Utilisateur getUtilisateurByMail(String mail);

    void setRappelActif(int idUser);

    void setRappelInActif(int idUser);

    Utilisateur getUtilisateurById(int idUser);
}
