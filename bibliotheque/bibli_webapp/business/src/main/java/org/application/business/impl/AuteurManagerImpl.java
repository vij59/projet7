package org.application.business.impl;

import org.application.business.contract.AuteurManager;
import org.webservice.services.Auteur;

import java.util.List;

public class AuteurManagerImpl extends AbstractManager implements AuteurManager {

    @Override
    public List<Auteur> getAuteurs() {
        return getDaoFactory().getAuteurDao().getAuteurs();
    }

    @Override
    public List<Auteur> getAuteurByName(String nom) {
        return getDaoFactory().getAuteurDao().getAuteurByName(nom);
    }

}
