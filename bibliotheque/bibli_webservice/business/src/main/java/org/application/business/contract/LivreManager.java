package org.application.business.contract;

import java.util.Date;
import java.util.List;

import org.application.model.Auteur;
import org.application.model.Livre;

public interface LivreManager {
	public List<Livre> getLivres();

	void creerLivre(Livre livre);

	List<Livre> getLivreByTitre(String titre);

	Livre getLivreById(int id);

	List<Livre> getLivreByRecherche(String titre, String auteur);

	List<Livre> getLivreByAuteur(Auteur auteur);

	Date getDateRetourPlusProche(int idLivre);
}
