package org.application.business.impl;

import java.util.List;

import org.application.business.contract.EmpruntManager;
import org.application.business.contract.LivreManager;
import org.application.model.Auteur;
import org.application.model.Emprunt;
import org.application.model.Livre;
import org.application.model.Reservation;

public class LivreManagerImpl extends AbstractManager implements LivreManager {

	public List<Livre> getLivres() {
		List<Livre> liste = getDaoFactory().getLivreDAO().getLivres();
		for(Livre livre : liste) {
			livre.setNbReservations(getDaoFactory().getReservationDAO().getNombreDeReservationsPourLivreId(livre.getId()));
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
		for(Livre livre : liste) {
			livre.setNbReservations(getDaoFactory().getReservationDAO().getNombreDeReservationsPourLivreId(livre.getId()));
		}
		return liste;
	}


}
