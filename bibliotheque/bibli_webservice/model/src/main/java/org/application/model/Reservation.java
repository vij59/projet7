package org.application.model;

import java.util.Date;

public class Reservation {

    private int id;
    private int idUser;
    private int idLivre;
    private Date dateReservation;

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
}
