package org.application.business.contract;

import org.webservice.services.Auteur;

import java.util.List;

public interface AuteurManager {

    List<Auteur> getAuteurs();

    List<Auteur> getAuteurByName(String nom);
}
