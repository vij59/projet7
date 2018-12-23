package org.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.application.model.Livre;

@WebService(serviceName = "Livre")
public class LivreWebservice extends AbstractWebservice {

	@WebMethod
	public List<Livre> getByNom(String nom) {
		return getManagerFactory().getLivreManager().getLivreByTitre(nom);
	}

	@WebMethod
	public Livre getLivreById(int id) {

			return getManagerFactory().getLivreManager().getLivreById(id);
	}

	@WebMethod
	public List<Livre> getLivres() {
		List<Livre> listeLivres = getManagerFactory().getLivreManager().getLivres();
		for (Livre livre : listeLivres) {

			livre.setAuteur(getManagerFactory().getAuteurManager().getAuteurById(livre.getIdAuteur()));
			boolean dispo = getManagerFactory().getEmpruntManager().empruntPossible(livre.getId());
			livre.setDisponible(dispo);
		}
		return listeLivres;
	}

	@WebMethod
	public List<Livre> getLivreByRecherche(String titre, String auteur) {

		List<Livre> listeLivres = getManagerFactory().getLivreManager().getLivres();
		try {
			if (titre.equals(("")) && auteur.equals((""))){
				for (Livre livre : listeLivres) {


					boolean dispo = getManagerFactory().getEmpruntManager().empruntPossible(livre.getId());
					livre.setDisponible(dispo);
				}
				return listeLivres;
			}
			else {

				List<Livre> listeLivresRecherchés = getManagerFactory().getLivreManager().getLivreByRecherche(titre, auteur);
				for (Livre livre : listeLivresRecherchés) {

					livre.setAuteur(getManagerFactory().getAuteurManager().getAuteurById(livre.getIdAuteur()));
					boolean dispo = getManagerFactory().getEmpruntManager().empruntPossible(livre.getId());
					livre.setDisponible(dispo);
				}
				return listeLivresRecherchés;
			}

		}
		catch (Exception e) {
			e.getMessage();
			return listeLivres;
		}
	}
}
