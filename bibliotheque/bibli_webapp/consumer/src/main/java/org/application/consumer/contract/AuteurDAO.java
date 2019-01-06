package org.application.consumer.contract;

import org.webservice.services.Auteur;

import java.util.List;

public interface AuteurDAO {

    List<Auteur> getAuteurs();

    List<Auteur> getAuteurByName(String nom);
}
