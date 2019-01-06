package org.application.business.impl;

import org.application.business.contract.LivreManager;
import org.application.model.Auteur;
import org.application.model.Livre;

import java.util.Date;
import java.util.List;

public class LivreManagerImpl extends AbstractManager implements LivreManager {

    public List<Livre> getLivres() {
        List<Livre> liste = getDaoFactory().getLivreDAO().getLivres();
        for (Livre livre : liste) {
            livre.setNbReservations(getDaoFactory().getReservationDAO().getNombreDeReservationsPourLivreId(livre.getId()));
            livre.setDateRetourProche(getDaoFactory().getEmpruntDAO().getDateRetourPlusProche(livre.getId()));
        }
        return liste;
    }

    @Override
    public void creerLivre(Livre livre) {

        getDaoFactory().getLivreDAO().creer(livre);

    }

    @Override
    public List<Livre> getLivreByTitre(String titre) {
        List<Livre> liste = getDaoFactory().getLivreDAO().getLivreByTitre(titre);

        return liste;
    }

    @Override
    public Livre getLivreById(int id) {
        Livre livre = getDaoFactory().getLivreDAO().getLivreById(id);
        livre.setNbReservations(getDaoFactory().getReservationDAO().getNombreDeReservationsPourLivreId(livre.getId()));
        livre.setDateRetourProche(getDaoFactory().getEmpruntDAO().getDateRetourPlusProche(id));
        return livre;
    }

    @Override
    public List<Livre> getLivreByAuteur(Auteur auteur) {
        List<Livre> livre = getDaoFactory().getLivreDAO().getLivreByAuteur(auteur);

        return livre;
    }

    @Override
    public List<Livre> getLivreByRecherche(String titre, String auteur) {
        List<Livre> liste = getDaoFactory().getLivreDAO().getLivreByRecherche(titre, auteur);
        for (Livre livre : liste) {
            livre.setNbReservations(getDaoFactory().getReservationDAO().getNombreDeReservationsPourLivreId(livre.getId()));
            livre.setDateRetourProche(getDaoFactory().getEmpruntDAO().getDateRetourPlusProche(livre.getId()));
        }
        return liste;
    }


    @Override
    public Date getDateRetourPlusProche(int idLivre) {
        return getDaoFactory().getEmpruntDAO().getDateRetourPlusProche(idLivre);
    }

}
