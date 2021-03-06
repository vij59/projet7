package org.application.consumer.contract;

import org.application.model.Reservation;

import java.util.List;

public interface ReservationDAO {

    void creerReservation(Reservation reservation);

    List<Reservation> getListeReservations();

    List<Reservation> getReservationsByBookId(int idLivre);

    void supprimerReservation(Reservation reservation);

    List<Reservation> getReservationsByUserId(int idUser);

    void annulerReservation(int idLivre, int idUser);

    int getNombreDeReservationsPourLivreId(int idLivre);

    Reservation getReservationByBookIdByUserId(int idLivre, int idUser);
}
