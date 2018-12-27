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
    public void creerReservation(Reservation reservation) {
        getManagerFactory().getReservationManager().creerReservation(reservation);
    }

    @WebMethod
    public List<Reservation> getListeReservationsByBookId(int idLivre) {
        return getManagerFactory().getReservationManager().getReservationsByBookId(idLivre);
    }

    @WebMethod
    public Reservation getPremiereReservationDuLivreById(int idLivre) {
        return getManagerFactory().getEmpruntManager().getPremiereReservationByBookId(idLivre);
    }

    @WebMethod
    public void supprimerReservation(Reservation reservation) {
        getManagerFactory().getReservationManager().supprimerReservation(reservation);
    }

    @WebMethod
    public List<Reservation> getReservationsByUserId(int userId) {
        return getManagerFactory().getReservationManager().getReservationsByUserId(userId);
    }

}
