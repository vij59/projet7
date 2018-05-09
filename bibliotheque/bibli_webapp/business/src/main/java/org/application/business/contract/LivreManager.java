package org.application.business.contract;

import java.util.List;

import org.webservice.services.Livre;

public interface LivreManager {

	public List<Livre> getLivres();

	List<Livre> getLivreByRecherche(String titre, String nomAuteur);

	Livre getLivreById(int id);
}
