package org.application.consumer.contract;

import org.webservice.services.Emprunt;

import java.util.List;

public interface EmpruntDAO {

    List<Emprunt> getEmprunts();

    void prolongerEmprunt(int emprunt);

    List<Emprunt> getEmpruntByUserId(int idUser);

    List<Emprunt> getEmpruntsEnCours();

    void creerEmprunt(Emprunt emprunt);

    void rendreLivreDeLemprunt(int idEmprunt);

    Emprunt getEmpruntById(int idEmprunt);

    void recupererLivreByIdEmprunt(int idEmprunt);

    void livreNonRecupereByIdEmprunt(int idEmprunt);

    List<Emprunt> getEmpruntsEnCoursByUserId(int idUser);
}
