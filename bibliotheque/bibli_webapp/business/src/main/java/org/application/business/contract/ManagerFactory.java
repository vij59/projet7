package org.application.business.contract;

public interface ManagerFactory {

    UtilisateurManager getUtilisateurManager();

    LivreManager getLivreManager();

    AuteurManager getAuteurManager();

    EmpruntManager getEmpruntManager();

    ReservationManager getReservationManager();

}
