package org.application.business.contract;

import org.application.model.Auteur;

import java.util.List;

public interface AuteurManager {

    List<Auteur> getAuteurByNom(String nom);

    List<Auteur> getAuteurs();

    Auteur getAuteurById(int i);

}
