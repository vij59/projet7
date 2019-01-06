package org.application.consumer.contract;

import org.webservice.services.Livre;

import java.util.List;


public interface LivreDAO {

    List<Livre> getLivres();

    List<Livre> getLivreByRecherche(String titre, String nomAuteur);

    Livre getLivreById(int id);
}
