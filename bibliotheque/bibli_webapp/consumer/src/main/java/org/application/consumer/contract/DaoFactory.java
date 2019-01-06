package org.application.consumer.contract;

public interface DaoFactory {

    UtilisateurDAO getUtilisateurDao();

    LivreDAO getLivreDao();

    AuteurDAO getAuteurDao();

    EmpruntDAO getEmpruntDao();

    ReservationDAO getReservationDao();
}
