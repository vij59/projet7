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

    @WebMethod
    public void annulerReservation(int idLivre, int idUser) {
        getManagerFactory().getReservationManager().annulerReservation(idLivre, idUser);
    }

    @WebMethod
    public int getNombreDeReservationsPourLivreId(int idLivre) {
        return getManagerFactory().getReservationManager().getNombreDeReservationsPourLivreId(idLivre);
    }

    @WebMethod
    public int getPlaceDansListeReservationsBookUser(int idLivre, int idUser) {
        return getManagerFactory().getReservationManager().getPlaceDansListeReservations(idLivre, idUser);
    }

    @WebMethod
    public Reservation getReservationByBookIdByUserId(int pIdLivre, int pIdUser) {
        return getManagerFactory().getReservationManager().getReservationByBookIdByUserId(pIdLivre, pIdUser);

    }
}
