package org.webapp.action;

import com.opensymphony.xwork2.ActionContext;
import org.webapp.resource.AbstractRessource;
import org.webservice.services.Emprunt;
import org.webservice.services.Livre;
import org.webservice.services.Reservation;
import org.webservice.services.Utilisateur;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Recherche extends AbstractRessource {
    private String titre, nomAuteur;
    private List<Livre> listeLivres;
    private List<Emprunt> mesEmpruntsDeLivres;
    private List<Reservation> mesReservations;
    private Date dateDuJour;


    public String getTitre() {
        return titre;
    }


    public void setTitre(String titre) {
        this.titre = titre;
    }


    public String getNomAuteur() {
        return nomAuteur;
    }


    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }


    public List<Livre> getListeLivres() {
        return listeLivres;
    }


    public void setListeLivres(List<Livre> listeLivres) {
        this.listeLivres = listeLivres;
    }

    public List<Emprunt> getMesEmpruntsDeLivres() {
        return mesEmpruntsDeLivres;
    }

    public void setMesEmpruntsDeLivres(List<Emprunt> mesEmpruntsDeLivres) {
        this.mesEmpruntsDeLivres = mesEmpruntsDeLivres;
    }

    public List<Reservation> getMesReservations() {
        return mesReservations;
    }

    public void setMesReservations(List<Reservation> mesReservations) {
        this.mesReservations = mesReservations;
    }

    public Date getDateDuJour() {
        return dateDuJour;
    }

    public void setDateDuJour(Date dateDuJour) {
        this.dateDuJour = dateDuJour;
    }

    public String execute() {
        listeLivres = getManagerFactory().getLivreManager().getLivreByRecherche(titre, nomAuteur);
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


        return "success";

    }

}