package org.webservice.services;

import org.application.model.Reservation;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;


@WebService(serviceName = "Reservation")
    public class ReservationWebService extends AbstractWebservice {

        @WebMethod
        public List<Reservation> getListeReservations() {
            return getManagerFactory().getReservationManager().getListeReservations();
        }

        @WebMethod
        public void creerReservation(int idUser , int idLivre) {
            Reservation reservation = null;
            reservation.setIdLivre(idLivre);
            reservation.setIdUser(idUser);
            getManagerFactory().getReservationManager().creerReservation(idUser, idLivre);
        }
}
