package org.application.consumer.contract;

import java.util.List;

import org.application.model.Auteur;

public interface AuteurDAO {

    void creer(Auteur author);
   public  List<Auteur> getAuteurs();
	public List<Auteur> getByNom(String nom);
	public Auteur getAuteurById(int id);


}
