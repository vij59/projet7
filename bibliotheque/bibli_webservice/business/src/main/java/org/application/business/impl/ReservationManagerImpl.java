package org.application.business.impl;

import org.application.business.contract.ReservationManager;
import org.application.model.Reservation;

import java.util.List;

public class ReservationManagerImpl extends AbstractManager implements ReservationManager {


    @Override
    public List<Reservation> getListeReservations() {
        return getDaoFactory().getReservationDAO().getListeReservations();
    }

    @Override
    public void creerReservation(Reservation reservation) {

    }

    @Override
    public List<Reservation> getReservationsByIdLivre() {
        return null;
    }
}
