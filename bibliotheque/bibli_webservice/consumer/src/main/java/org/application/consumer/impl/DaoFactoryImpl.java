package org.application.consumer.impl;

import org.application.consumer.contract.*;

public class DaoFactoryImpl implements DaoFactory {


    private AuteurDAO auteurDAO;
    private LivreDAO livreDAO;
    private EmpruntDAO empruntDAO;
    private UtilisateurDAO utilisateurDAO;
    private ReservationDAO reservationDAO;

    public AuteurDAO getAuteurDAO() {
        return auteurDAO;
    }

    public void setAuteurDAO(AuteurDAO auteurDAO) {
        this.auteurDAO = auteurDAO;
    }

    public LivreDAO getLivreDAO() {
        return livreDAO;
    }

    public void setLivreDAO(LivreDAO livreDAO) {
        this.livreDAO = livreDAO;
    }

    public EmpruntDAO getEmpruntDAO() {
        return empruntDAO;
    }

    public void setEmpruntDAO(EmpruntDAO empruntDAO) {
        this.empruntDAO = empruntDAO;
    }

    public UtilisateurDAO getUtilisateurDAO() {
        return utilisateurDAO;
    }

    public void setUtilisateurDAO(UtilisateurDAO utilisateurDAO) {
        this.utilisateurDAO = utilisateurDAO;
    }

    public ReservationDAO getReservationDAO() {
        return reservationDAO;
    }

    public void setReservationDAO(ReservationDAO reservationDAO) {
        this.reservationDAO = reservationDAO;
    }
}
