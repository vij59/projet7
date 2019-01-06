package org.application.consumer.contract;

import org.application.model.Auteur;

import java.util.List;

public interface AuteurDAO {

    public List<Auteur> getAuteurs();

    public List<Auteur> getAuteurByNom(String nom);

    public Auteur getAuteurById(int id);

}
