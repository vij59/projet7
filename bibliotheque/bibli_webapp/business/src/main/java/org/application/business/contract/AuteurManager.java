package org.application.business.contract;

import java.util.List;

import org.webservice.services.Auteur;

public interface AuteurManager {

	List<Auteur> getAuteurs();

	List<Auteur> getAuteurByName(String nom);
}
