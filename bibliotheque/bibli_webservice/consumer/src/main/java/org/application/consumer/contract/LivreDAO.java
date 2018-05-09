package org.application.consumer.contract;


import java.util.List;

import org.application.model.Auteur;
import org.application.model.Livre;

public interface LivreDAO {

    void creer(Livre livre);
    Livre getLivreById(int id);
    List<Livre> getLivres();
    List<Livre> getLivreByTitre(String titre);
    List<Livre> getLivreByAuteur(Auteur auteur);
	List<Livre> getLivreByRecherche(String titre, String auteur);



}
