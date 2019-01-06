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

    @Override
    public List<Reservation> getReservationsByUserId(int idUser) {
        // TODO Auto-generated method stub
        return getDaoFactory().getReservationDao().getReservationsByUserId(idUser);
    }

    @Override
    public void annulerReservation(int idLivre, int idUser) {
        getDaoFactory().getReservationDao().annulerReservation(idLivre, idUser);
    }

    @Override
    public int getNombreDeReservationsPourLivreId(int idLivre) {
        return getDaoFactory().getReservationDao().getNombreDeReservationsPourLivreId(idLivre);
    }

    @Override
    public int getPlaceDansListeReservationsBookUser(int idLivre, int idUser) {
        return getDaoFactory().getReservationDao().getPlaceDansListeReservationsBookUser(idLivre, idUser);
    }

    @Override
    public Reservation getReservationByBookIdByUserId(int pIdLivre, int pIdUser) {
        return getDaoFactory().getReservationDao().getReservationByBookIdByUserId(pIdLivre, pIdUser);
    }
}
