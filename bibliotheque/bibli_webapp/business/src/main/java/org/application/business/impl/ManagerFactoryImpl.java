package org.application.business.impl;

import org.application.business.contract.*;

public class ManagerFactoryImpl implements ManagerFactory {

    private UtilisateurManager utilisateurManager;
    private LivreManager livreManager;
    private AuteurManager auteurManager;
    private EmpruntManager empruntManager;
    private ReservationManager reservationManager;

    public UtilisateurManager getUtilisateurManager() {
        return utilisateurManager;
    }

    public void setUtilisateurManager(UtilisateurManager utilisateurManager) {
        this.utilisateurManager = utilisateurManager;
    }

    public LivreManager getLivreManager() {
        return livreManager;
    }

    public void setLivreManager(LivreManager livreManager) {
        this.livreManager = livreManager;
    }

    public AuteurManager getAuteurManager() {
        return auteurManager;
    }

    public void setAuteurManager(AuteurManager auteurManager) {
        this.auteurManager = auteurManager;
    }

    public EmpruntManager getEmpruntManager() {
        return empruntManager;
    }

    public void setEmpruntManager(EmpruntManager empruntManager) {
        this.empruntManager = empruntManager;
    }

    public ReservationManager getReservationManager() {
        return reservationManager;
    }

    public void setReservationManager(ReservationManager reservationManager) {
        this.reservationManager = reservationManager;
    }
}
