package org.application.model;

import java.util.Date;

public class Reservation {

    private int id;
    private int idUser;
    private int idLivre;
    private Date dateReservation;
    private int placeDansReservations;
    private Livre livre;

    public int getIdReservation() {
        return id;
    }

    public void setIdReservation(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdLivre() {
        return idLivre;
    }

    public void setIdLivre(int idLivre) {
        this.idLivre = idLivre;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public int getPlaceDansReservations() {
        return placeDansReservations;
    }

    public void setPlaceDansReservations(int placeDansReservations) {
        this.placeDansReservations = placeDansReservations;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }
}
