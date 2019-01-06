package org.application.business.impl;

import org.application.business.contract.AuteurManager;
import org.application.model.Auteur;

import java.util.List;

public class AuteurManagerImpl extends AbstractManager implements AuteurManager {

    @Override
    public List<Auteur> getAuteurByNom(String nom) {
        List<Auteur> auteurs = getDaoFactory().getAuteurDAO().getAuteurByNom(nom);
        return auteurs;
    }

    @Override
    public List<Auteur> getAuteurs() {
        List<Auteur> listeAuteurs = getDaoFactory().getAuteurDAO().getAuteurs();
        return listeAuteurs;
    }

    @Override
    public Auteur getAuteurById(int i) {
        Auteur auteur = getDaoFactory().getAuteurDAO().getAuteurById(i);
        return auteur;
    }

}
