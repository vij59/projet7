package org.application.business.contract;

import org.application.model.Auteur;
import org.application.model.Livre;

import java.util.Date;
import java.util.List;

public interface LivreManager {
    List<Livre> getLivres();

    void creerLivre(Livre livre);

    List<Livre> getLivreByTitre(String titre);

    Livre getLivreById(int id);

    List<Livre> getLivreByRecherche(String titre, String auteur);

    List<Livre> getLivreByAuteur(Auteur auteur);

    Date getDateRetourPlusProche(int idLivre);
}
