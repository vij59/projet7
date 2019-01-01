package org.webapp.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import org.webapp.resource.AbstractRessource;
import org.webservice.services.*;

public class ListeLivres extends AbstractRessource {

    private List<Livre> listeLivres;
    private Livre livre;
    private List<Emprunt> mesEmpruntsDeLivres;
    private List<Reservation> mesReservations;
    private int idlivre;
    private Date dateDuJour;

    public List<Livre> getListeLivres() {
        return listeLivres;
    }

    public void setListeLivres(List<Livre> listeLivres) {
        this.listeLivres = listeLivres;
    }

    public Livre getLivre() {
        return livre;
    }

    public void setLivre(Livre livre) {
        this.livre = livre;
    }

    public List<Emprunt> getMesEmpruntsDeLivres() {
        return mesEmpruntsDeLivres;
    }
    public void setMesEmpruntsDeLivres(List<Emprunt> mesEmpruntsDeLivres) {
        this.mesEmpruntsDeLivres = mesEmpruntsDeLivres;
    }

    public int getIdlivre() {
        return idlivre;
    }

    public void setIdlivre(int idlivre) {
        this.idlivre = idlivre;
    }

    public Date getDateDuJour() {
        return dateDuJour;
    }

    public void setDateDuJour(Date dateDuJour) {
        this.dateDuJour = dateDuJour;
    }

    public List<Reservation> getMesReservations() {
        return mesReservations;
    }

    public void setMesReservations(List<Reservation> mesReservations) {
        this.mesReservations = mesReservations;
    }

    public String execute() {

        try {
            listeLivres = getManagerFactory().getLivreManager().getLivres();
            dateDuJour = new Date();

            Utilisateur user = (Utilisateur) ActionContext.getContext().getSession().get("user");

            if (user != null) {
                List<Integer> mesIdsReservations = new ArrayList<>();
                List<Integer> mesIdsEmpruntsDeLivres = new ArrayList<>();

                mesEmpruntsDeLivres = getManagerFactory().getEmpruntManager().getMesEmpruntsEnCours(user.getId());
                mesReservations = getManagerFactory().getReservationManager().getReservationsByUserId(user.getId());

                for (Emprunt emprunt : mesEmpruntsDeLivres) {
                    mesIdsEmpruntsDeLivres.add(emprunt.getIdLivre());
                }

                for (Reservation reservation : mesReservations) {
                    mesIdsReservations.add(reservation.getIdLivre());
                }


                for (Livre livre : listeLivres) {
                    Integer idLivre = livre.getId();
                    if (mesIdsEmpruntsDeLivres.contains(idLivre)) {
                        livre.setLivreEmprunteByUserId(true);
                    }
                    if (mesIdsReservations.contains(idLivre)) {
                        livre.setLivreReserveByUserId(true);
                    }
                }
            }
        }
        catch
                (Exception e) {
            e.getMessage();
        }

        return "success";
    }




}
