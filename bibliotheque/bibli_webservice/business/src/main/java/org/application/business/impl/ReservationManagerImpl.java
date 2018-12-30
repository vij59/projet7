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
        List<Reservation> listeResa = getDaoFactory().getReservationDAO().getReservationsByUserId(userId);
        for(Reservation reservation : listeResa) {
            reservation.setPlaceDansReservations(getPlaceDansListeReservations(reservation.getIdLivre(),userId ));
        }
        return listeResa;
    }

    @Override
    public void annulerReservation(int idLivre, int idUser) {
        getDaoFactory().getReservationDAO().annulerReservation(idLivre, idUser);
    }

    @Override
    public int getNombreDeReservationsPourLivreId(int idLivre) {
        return getDaoFactory().getReservationDAO().getNombreDeReservationsPourLivreId(idLivre);
    }

    @Override
    public int getPlaceDansListeReservations(int idLivre, int idUser) {

        List<Reservation> reservationsLivre = getDaoFactory().getReservationDAO().getReservationsByBookId(idLivre);
        Reservation reservationsLivreByUserByBookId = getDaoFactory().getReservationDAO().getReservationByBookIdByUserId(idLivre,idUser);
        int placeDansResa=1;
        for (Reservation reservation : reservationsLivre) {
            if (reservation.getIdReservation() < reservationsLivreByUserByBookId.getIdReservation()) {
               placeDansResa++;
            }

        }
        return placeDansResa;
    }

    @Override
    public Reservation getReservationByBookIdByUserId(int pIdLivre, int pIdUser) {
        return getDaoFactory().getReservationDAO().getReservationByBookIdByUserId(pIdLivre,pIdUser);
    }
}
