package org.application.consumer.impl;

import org.application.consumer.contract.LivreDAO;
import org.webservice.services.Livre;
import org.webservice.services.LivreWebservice;
import org.webservice.services.Livre_Service;

import java.util.List;

public class LivreDAOImpl implements LivreDAO {

    Livre_Service livreService = new Livre_Service();
    LivreWebservice livreWebService = livreService.getLivreWebservicePort();

    @Override
    public List<Livre> getLivres() {
        return livreWebService.getLivres();
    }

    @Override
    public List<Livre> getLivreByRecherche(String titre, String nomAuteur) {
        return livreWebService.getLivreByRecherche(titre, nomAuteur);
    }

    @Override
    public Livre getLivreById(int id) {
        return livreWebService.getLivreById(id);
    }

}
