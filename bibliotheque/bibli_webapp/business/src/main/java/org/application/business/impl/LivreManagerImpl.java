package org.application.business.impl;

import org.application.business.contract.LivreManager;
import org.webservice.services.Livre;

import java.util.List;

public class LivreManagerImpl extends AbstractManager implements LivreManager {

    @Override
    public List<Livre> getLivres() {
        // TODO Auto-generated method stub
        return getDaoFactory().getLivreDao().getLivres();
    }

    @Override
    public List<Livre> getLivreByRecherche(String titre, String nomAuteur) {
        // TODO Auto-generated method stub
        return getDaoFactory().getLivreDao().getLivreByRecherche(titre, nomAuteur);
    }

    @Override
    public Livre getLivreById(int id) {
        return getDaoFactory().getLivreDao().getLivreById(id);
    }
}
