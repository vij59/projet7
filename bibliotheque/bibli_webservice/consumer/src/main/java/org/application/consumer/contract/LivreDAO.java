package org.application.consumer.contract;


import java.util.List;

import org.application.model.Auteur;
import org.application.model.Livre;

public interface LivreDAO {

    void creer(Livre livre);
    Livre getById(int id);
    List<Livre> getLivres();
    List<Livre> getByNom(String nom);
    List<Livre> getByAuteur(Auteur auteur);
	Livre getById(long id);
	List<Livre> getLivreByRecherche(String titre, String auteur);



}
