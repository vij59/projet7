package org.application.consumer.contract;

import org.application.model.Reservation;

import java.util.List;

public interface DaoFactory {


	AuteurDAO getAuteurDAO();
    void setAuteurDAO(AuteurDAO auteurDAO);

    LivreDAO getLivreDAO();
    void setLivreDAO(LivreDAO livreDAO);

    EmpruntDAO getEmpruntDAO();
    void setEmpruntDAO(EmpruntDAO empruntDAO);

    UtilisateurDAO getUtilisateurDAO();
    void setUtilisateurDAO(UtilisateurDAO utilisateurDAO);


    ReservationDAO getReservationDAO();
    void setReservationDAO(ReservationDAO reservationDAO);
}
