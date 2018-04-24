package org.application.business.impl;

import java.util.List;

import org.application.business.contract.AuteurManager;
import org.application.model.Auteur;

public class AuteurManagerImpl extends AbstractManager implements AuteurManager{


    @Override
    public List<Auteur> getByNom(String nom) {
        List<Auteur> auteurs = getDaoFactory().getAuteurDAO().getByNom(nom);
        return auteurs;
    }

    @Override
    public void creerAuteur(Auteur auteur) {
        getDaoFactory().getAuteurDAO().creer(auteur);

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
