package org.application.consumer.contract;

import org.application.model.Utilisateur;

import java.util.List;

public interface UtilisateurDAO {

    List<Utilisateur> getUtilisateurs();

    Utilisateur getUtilisateurByMail(String mail);

    void setRappelActif(int idUser);

    void setRappelInActif(int idUser);

    Utilisateur getUtilisateurById(int idUser);
}
