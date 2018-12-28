package org.application.business.contract;

import org.webservice.services.Reservation;

import java.util.List;

public interface ReservationManager {
    List<Reservation> getListeReservations();

    List<Reservation> getReservationsByBookId(int idLivre);

    void creerReservation(Reservation reservation);

    Reservation getPremiereReservationDuLivreById(int idLivre);

    void supprimerReservation(Reservation reservation);

    List<Reservation> getReservationsByUserId(int idUser);

    void annulerReservation(int idLivre, int idUser);
}
