package org.application.consumer.contract;

import org.application.model.Auteur;

import java.util.List;

public interface AuteurDAO {

    List<Auteur> getAuteurs();

    List<Auteur> getAuteurByNom(String nom);

    Auteur getAuteurById(int id);

}
