package org.application.business.contract;

import org.application.model.Reservation;

import java.util.List;

public interface ReservationManager {

    public List<Reservation> getListeReservations();

    void creerReservation(Reservation reservation);

    public List<Reservation> getReservationsByBookId(int idLivre);

    void supprimerReservation(Reservation reservation);

    public List<Reservation> getReservationsByUserId(int userId);

    void annulerReservation(int idLivre, int idUser);

    int getNombreDeReservationsPourLivreId(int idLivre);

    int getPlaceDansListeReservations(int idLivre, int idUser);

    Reservation getReservationByBookIdByUserId(int pIdLivre, int pIdUser);
}
