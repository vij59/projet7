package org.application.business.contract;

import org.application.model.Reservation;

import java.util.List;

public interface ReservationManager {

    public List<Reservation> getListeReservations();

    void creerReservation(Reservation reservation);

    public List<Reservation> getReservationsByBookId(int idLivre);
}
