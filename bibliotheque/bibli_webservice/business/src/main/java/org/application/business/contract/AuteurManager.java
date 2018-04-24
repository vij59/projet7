package org.application.business.contract;


import java.util.List;

import org.application.model.Auteur;

public interface AuteurManager {

    List<Auteur> getByNom(String nom);
    void creerAuteur(Auteur auteur);
   public List<Auteur> getAuteurs();
Auteur getAuteurById(int i);




}
