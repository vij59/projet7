package org.application.business.impl;

import java.util.Date;
import java.util.List;

import org.application.business.contract.EmpruntManager;
import org.application.model.Emprunt;
import org.application.model.Livre;

public class EmpruntManagerImpl extends AbstractManager implements EmpruntManager {

	@Override
	public void creerEmprunt(Emprunt emprunt) {
		getDaoFactory().getEmpruntDAO().creer(emprunt);
	}

	@Override
	public List<Emprunt> getListeEmprunts() {
		// TODO Auto-generated method stub
		List<Emprunt> liste = getDaoFactory().getEmpruntDAO().getListeEmprunts();

		for (Emprunt emprunt : liste) {

			Livre livre = getDaoFactory().getLivreDAO().getLivreById(emprunt.getIdLivre());
			emprunt.setLivre(livre);
		}
		return liste;
	}

	@Override
	public boolean empruntPossible(int id) {
		// TODO Auto-generated method stub

		List<Emprunt> listeEmprunts = getDaoFactory().getEmpruntDAO().getListeEmprunts();
		List<Livre> listeLivres = getDaoFactory().getLivreDAO().getLivres();
		Livre livre = getDaoFactory().getLivreDAO().getLivreById(id);
		boolean dispo = false;

		int nbDispo = livre.getNbExemplaires();
		int nbRestant = nbDispo;

		for (Emprunt emprunt : listeEmprunts) {
			if (emprunt.getIdLivre() == id && emprunt.isEnCours()) {
				livre.setNbRestant(--nbRestant);
			}
		}

		if (livre.getNbRestant() <= 0) {
			dispo = false;
		} else {
			dispo = true;
		}

		return dispo;
	}

	@Override
	public void empruntProlonge(int idEmprunt) {
		getDaoFactory().getEmpruntDAO().empruntProlonge(idEmprunt);
	}

	@Override
	public List<Emprunt> getEmpruntByUserId(int idUser) {

		List<Emprunt> liste = getDaoFactory().getEmpruntDAO().getEmpruntByUserId(idUser);
		Date dateDuJour = new Date();

		for (Emprunt emprunt : liste) {

			Livre livre = getDaoFactory().getLivreDAO().getLivreById(emprunt.getIdLivre());
			if (emprunt.getDateFin().compareTo(dateDuJour)<0){
				emprunt.setRepoussable(false);
			}
			else {
				emprunt.setRepoussable(true);
			}
			emprunt.setLivre(livre);

		}
		return liste;

	}

	@Override
	public List<Emprunt> getEmpruntsEnCours() {
		List<Emprunt> liste = getDaoFactory().getEmpruntDAO().getEmpruntsEnCours();

		for (Emprunt emprunt : liste) {

			Livre livre = getDaoFactory().getLivreDAO().getLivreById(emprunt.getIdLivre());
			emprunt.setLivre(livre);

		}
		return liste;
	}
}
