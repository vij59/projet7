package org.application.business.contract;

import org.webservice.services.Livre;

import java.util.List;

public interface LivreManager {

    List<Livre> getLivres();

    List<Livre> getLivreByRecherche(String titre, String nomAuteur);

    Livre getLivreById(int id);
}
