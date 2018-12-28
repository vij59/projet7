package org.application.business.impl;

import org.application.business.contract.ReservationManager;
import org.application.model.Reservation;

import java.sql.Date;
import java.util.List;

public class ReservationManagerImpl extends AbstractManager implements ReservationManager {


    @Override
    public List<Reservation> getListeReservations() {
        return getDaoFactory().getReservationDAO().getListeReservations();
    }

    @Override
    public void creerReservation(Reservation reservation) {
        getDaoFactory().getReservationDAO().creerReservation(reservation);
    }

    @Override
    public List<Reservation> getReservationsByBookId(int idLivre) {
        return getDaoFactory().getReservationDAO().getReservationsByBookId(idLivre);
    }

    @Override
    public void supprimerReservation(Reservation reservation) {
        getDaoFactory().getReservationDAO().supprimerReservation(reservation);
    }

    @Override
    public List<Reservation> getReservationsByUserId(int userId) {
        return getDaoFactory().getReservationDAO().getReservationsByUserId(userId);
    }

    @Override
    public void annulerReservation(int idLivre, int idUser) {
        getDaoFactory().getReservationDAO().annulerReservation(idLivre, idUser);
    }
}
