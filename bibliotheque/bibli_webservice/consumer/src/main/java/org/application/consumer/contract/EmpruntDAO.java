package org.application.consumer.contract;

import org.application.model.Emprunt;

import java.util.Date;
import java.util.List;

public interface EmpruntDAO {

    void creerEmprunt(Emprunt emprunt);

    void empruntProlonge(int idEmprunt);

    List<Emprunt> getListeEmprunts();

    List<Emprunt> getListeEmpruntsEnCours();

    List<Emprunt> getEmpruntByUserId(int idUser);

    Emprunt getEmpruntById(int idEmprunt);

    List<Emprunt> getEmpruntsEnCours();

    // méthode qui va mettre fin à l'emprunt, et donc permet de rendre le livre
    void rendreLivreDeLemprunt(int idEmprunt);

    // méthode qui va mettre fin à l'emprunt, et donc permet de rendre le livre
    void recupererLivre(int idEmprunt);

    // méthode qui va permettre de valider l'emprunt une fois transferé de la reservation
    void livreNonRecupereByIdEmprunt(int idEmprunt);

    Date getDateRetourPlusProche(int idLivre);

    List<Emprunt> getEmpruntsEnCoursByUserId(int idUser);

    void setMailSentByEmpruntId(int idUser);
}
