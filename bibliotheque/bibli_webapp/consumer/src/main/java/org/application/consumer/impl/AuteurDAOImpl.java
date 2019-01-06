package org.application.consumer.impl;

import org.application.consumer.contract.AuteurDAO;
import org.webservice.services.Auteur;
import org.webservice.services.AuteurWebservice;
import org.webservice.services.Auteur_Service;

import java.util.List;

public class AuteurDAOImpl implements AuteurDAO {

    Auteur_Service auteurService = new Auteur_Service();
    AuteurWebservice auteurWebService = auteurService.getAuteurWebservicePort();

    @Override
    public List<Auteur> getAuteurs() {
        return auteurWebService.listAuteurs();
    }

    @Override
    public List<Auteur> getAuteurByName(String nom) {
        return auteurWebService.getAuteurByName(nom);
    }
}
