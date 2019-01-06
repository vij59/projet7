package org.application.consumer.contract;

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
