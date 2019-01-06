package org.application.consumer.contract;

import org.webservice.services.Utilisateur;

import java.util.List;

public interface UtilisateurDAO {

    List<Utilisateur> getUtilisateurs();

    boolean validerLogin(String mail, String mdp);

    Utilisateur getUtilisateurByMail(String mail);

    void setRappelInactifById(int idUser);

    void setRappelActifById(int idUser);

    Utilisateur getUtilisateurById(int idUser);
}


