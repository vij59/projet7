package org.application.consumer.contract;

import java.util.List;

import org.webservice.services.Auteur;

public interface AuteurDAO {

	List<Auteur> getAuteurs();

	List<Auteur> getAuteurByName(String nom);
}
