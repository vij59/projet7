package org.webapp.action;


import com.opensymphony.xwork2.ActionContext;
import org.webapp.resource.AbstractRessource;
import org.webservice.services.Emprunt;
import org.webservice.services.Livre;
import org.webservice.services.Reservation;
import org.webservice.services.Utilisateur;

import java.util.ArrayList;
import java.util.List;

public class EmprunterReserver extends AbstractRessource {


    private List<Emprunt> mesEmprunts;
    String result = "error";

    private Emprunt empruntReservation;
    private Livre livreEmprunter;
    private int id_livre;


    public int getId_livre() {
        return id_livre;
    }

    public void setId_livre(int id_livre) {
        this.id_livre = id_livre;
    }

    public List<Emprunt> getMesEmprunts() {
        return mesEmprunts;
    }

    public void setMesEmprunts(List<Emprunt> mesEmprunts) {
        this.mesEmprunts = mesEmprunts;
    }

    public Livre getLivreEmprunter() {
        return livreEmprunter;
    }

    public void setLivreEmprunter(Livre livreEmprunter) {
        this.livreEmprunter = livreEmprunter;
    }

    public String execute() {
        Utilisateur user = (Utilisateur) ActionContext.getContext().getSession().get("user");

        mesEmprunts = getManagerFactory().getEmpruntManager().getEmpruntByUserId(user.getId());
        Emprunt emprunt = new Emprunt();
        emprunt.setIdUtilisateur(user.getId());
        emprunt.setIdLivre(id_livre);

        List<Reservation> listeReservations = getManagerFactory().getReservationManager().getListeReservations();
        List<Reservation> mesReservations = new ArrayList<>();
        for (Reservation reservation : listeReservations) {
            if (reservation.getIdUser() == user.getId()) {
                mesReservations.add(reservation);
            }
        }
        result = "success";
        boolean dejaReserve = false;
        for (Emprunt emprunt1 : mesEmprunts) {
            if ((id_livre == emprunt1.getIdLivre()) && (emprunt1.isEnCours())) {
                dejaReserve = true;
            }
        }
        if (mesReservations != null) {
            for (Reservation reservation : mesReservations) {
                if (id_livre == reservation.getIdLivre()) {
                    dejaReserve = true;
                }
            }
        }
        if (!dejaReserve) {
            getManagerFactory().getEmpruntManager().creerEmprunt(emprunt);
        }

        return result;

    }

    public String deleteReservation() {
        Utilisateur user = (Utilisateur) ActionContext.getContext().getSession().get("user");
        String message = "error";
        try {
            if (user.getId() != 0 && id_livre != 0) {
                getManagerFactory().getReservationManager().annulerReservation(id_livre, user.getId());
                message = "success";
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return message;
    }

}