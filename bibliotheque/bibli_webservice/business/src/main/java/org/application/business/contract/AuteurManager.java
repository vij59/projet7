package org.application.business.contract;

import java.util.List;

import org.application.model.Auteur;

public interface AuteurManager {

	List<Auteur> getAuteurByNom(String nom);

	public List<Auteur> getAuteurs();

	Auteur getAuteurById(int i);

}
