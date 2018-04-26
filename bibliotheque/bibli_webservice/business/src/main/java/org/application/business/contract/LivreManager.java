package org.application.business.contract;

import java.util.List;

import org.application.model.Auteur;
import org.application.model.Livre;

public interface LivreManager {
	public List<Livre> getLivres();

	Livre getLivre(long id);

	void creerLivre(Livre livre);

	List<Livre> getLivreByNom(String nom);

	Livre getLivreById(int id);

	List<Livre>  getLivreByRecherche(String titre, String auteur);

	List<Livre> getByAuteur(Auteur auteur);
}
