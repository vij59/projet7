package org.application.consumer.impl;

import org.application.consumer.contract.ReservationDAO;
import org.webservice.services.Reservation;
import org.webservice.services.ReservationWebService;
import org.webservice.services.Reservation_Service;

import java.util.List;

public class ReservationDaoImpl implements ReservationDAO {

    Reservation_Service reservationService = new Reservation_Service();
    ReservationWebService reservationWebService = reservationService.getReservationWebServicePort();

    @Override
    public List<Reservation> getListeReservations() {

        return reservationWebService.getListeReservations();
    }

    @Override
    public List<Reservation> getReservationsByBookId(int idLivre) {

        return reservationWebService.getListeReservationsByBookId(idLivre);
    }

    @Override
    public void creerReservation(Reservation reservation) {

         reservationWebService.creerReservation(reservation);
    }

    @Override
    public Reservation getPremiereReservationDuLivreById(int idLivre) {
        return reservationWebService.getPremiereReservationDuLivreById(idLivre);
    }

    @Override
    public void supprimerReservation(Reservation reservation) {
        reservationWebService.supprimerReservation(reservation);
    }

    @Override
    public List<Reservation> getReservationsByUserId(int idUser) {
        return reservationWebService.getReservationsByUserId(idUser);
    }

    @Override
    public void annulerReservation(int idLivre, int idUser) {
         reservationWebService.annulerReservation(idLivre,idUser);
    }

}
