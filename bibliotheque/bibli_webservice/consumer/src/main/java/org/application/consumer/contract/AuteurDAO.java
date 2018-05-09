package org.application.consumer.contract;

import java.util.List;

import org.application.model.Auteur;

public interface AuteurDAO {

	public List<Auteur> getAuteurs();

	public List<Auteur> getAuteurByNom(String nom);

	public Auteur getAuteurById(int id);

}
