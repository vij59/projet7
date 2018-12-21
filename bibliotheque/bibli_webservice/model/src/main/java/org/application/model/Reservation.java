package org.application.model;

import java.sql.Timestamp;
import java.util.Date;

public class Reservation {

    private int id;
    private int idUser;
    private int idLivre;
    private Timestamp dateReservation;

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

    public Timestamp getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Timestamp dateReservation) {
        this.dateReservation = dateReservation;
    }
}
