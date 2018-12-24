package org.application.business.impl;

import org.application.business.contract.ReservationManager;
import org.webservice.services.Reservation;

import java.util.List;

public class ReservationManagerImpl extends AbstractManager implements ReservationManager {

    @Override
    public List<Reservation> getListeReservations() {
        // TODO Auto-generated method stub
        return getDaoFactory().getReservationDao().getListeReservations();
    }

    @Override
    public List<Reservation> getReservationsByBookId(int idLivre) {
        // TODO Auto-generated method stub
        return getDaoFactory().getReservationDao().getReservationsByBookId(idLivre);
    }

    @Override
    public void creerReservation(Reservation reservation) {
        getDaoFactory().getReservationDao().creerReservation(reservation);
    }

    @Override
    public Reservation getPremiereReservationDuLivreById(int idLivre) {
        return getDaoFactory().getReservationDao().getPremiereReservationDuLivreById(idLivre);
    }

    @Override
    public void supprimerReservation(Reservation reservation) {
        getDaoFactory().getReservationDao().supprimerReservation(reservation);
    }
}
