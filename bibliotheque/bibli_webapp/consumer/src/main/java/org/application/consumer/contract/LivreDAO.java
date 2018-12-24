package org.application.consumer.contract;

import java.util.List;

import org.webservice.services.Livre;


public interface LivreDAO {

	List<Livre> getLivres();

	List<Livre> getLivreByRecherche(String titre, String nomAuteur);

	Livre getLivreById(int id);
}
