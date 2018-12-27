package org.application.business.impl;

import java.util.Date;
import java.util.List;

import org.application.business.contract.EmpruntManager;
import org.application.model.Emprunt;
import org.application.model.Livre;
import org.application.model.Reservation;

public class EmpruntManagerImpl extends AbstractManager implements EmpruntManager {

    @Override
    public void creerEmprunt(Emprunt emprunt) {
        List<Emprunt> listeEmprunts = getDaoFactory().getEmpruntDAO().getListeEmprunts();
        // recuperer le livre en question
        Livre livre = getDaoFactory().getLivreDAO().getLivreById(emprunt.getIdLivre());
        // obtenir le nombre de reservations possibles, cad 2 fois le nb d exemplaires dispo
        int nbReservationsPossibles = 2 * livre.getNbExemplaires();
        List<Reservation> listeReservations = getDaoFactory().getReservationDAO().getListeReservations();
        int nbReservationsDuLivre = 0;


        for (Reservation reservation : listeReservations) {
            if (emprunt.getIdLivre() == reservation.getIdLivre()) {
                nbReservationsDuLivre++;
            }
        }
        if (empruntPossible(emprunt.getIdLivre())) {
            getDaoFactory().getEmpruntDAO().creerEmprunt(emprunt);
        } else if (nbReservationsPossibles > nbReservationsDuLivre) {

            Reservation reservation1 = new Reservation();
            reservation1.setIdUser(emprunt.getIdUtilisateur());
            reservation1.setIdLivre(emprunt.getIdLivre());
            getDaoFactory().getReservationDAO().creerReservation(reservation1);
        }

    }

    @Override
    public List<Emprunt> getListeEmprunts() {
        // TODO Auto-generated method stub
        List<Emprunt> liste = getDaoFactory().getEmpruntDAO().getListeEmprunts();

        for (Emprunt emprunt : liste) {

            Livre livre = getDaoFactory().getLivreDAO().getLivreById(emprunt.getIdLivre());
            emprunt.setLivre(livre);
        }
        return liste;
    }

    @Override
    public boolean empruntPossible(int id) {
        // TODO Auto-generated method stub

        List<Emprunt> listeEmprunts = getDaoFactory().getEmpruntDAO().getListeEmprunts();
        List<Livre> listeLivres = getDaoFactory().getLivreDAO().getLivres();
        Livre livre = getDaoFactory().getLivreDAO().getLivreById(id);
        boolean dispo = false;

        int nbDispo = livre.getNbExemplaires();
        int nbRestant = nbDispo;
        boolean livreDansLesEmprunts = false;

        for (Emprunt emprunt : listeEmprunts) {

            if (emprunt.getIdLivre() == id) {
                livreDansLesEmprunts = true;
            }
        }
        if (livreDansLesEmprunts) {
            for (Emprunt emprunt : listeEmprunts) {
                if (emprunt.getIdLivre() == id && emprunt.isEnCours()) {
                    livre.setNbRestant(--nbRestant);
                }
            }

            if (livre.getNbRestant() <= 0) {
                dispo = false;
            } else {
                dispo = true;
            }
        } else {
            if (livre.getNbExemplaires() >= 1) {
                dispo = true;
            }

        }

        return dispo;
    }

    @Override
    public void empruntProlonge(int idEmprunt) {
        getDaoFactory().getEmpruntDAO().empruntProlonge(idEmprunt);
    }

    @Override
    public List<Emprunt> getEmpruntByUserId(int idUser) {

        List<Emprunt> liste = getDaoFactory().getEmpruntDAO().getEmpruntByUserId(idUser);
        Date dateDuJour = new Date();

        for (Emprunt emprunt : liste) {

            Livre livre = getDaoFactory().getLivreDAO().getLivreById(emprunt.getIdLivre());
            if (emprunt.getDateFin().compareTo(dateDuJour) < 0) {
                emprunt.setRepoussable(false);
                if (emprunt.getStatut().equals("rendu")) {
                    emprunt.setStatut("rendu");
                } else {
                    emprunt.setStatut("à rendre");
                }

            } else {
                emprunt.setRepoussable(true);
                emprunt.setStatut("en cours");
            }
            emprunt.setLivre(livre);


        }
        return liste;

    }

    @Override
    public List<Emprunt> getEmpruntsEnCours() {
        List<Emprunt> liste = getDaoFactory().getEmpruntDAO().getEmpruntsEnCours();

        for (Emprunt emprunt : liste) {

            Livre livre = getDaoFactory().getLivreDAO().getLivreById(emprunt.getIdLivre());
            emprunt.setLivre(livre);

        }
        return liste;
    }

    @Override
    public Emprunt getEmpruntById(int idEmprunt) {
        return getDaoFactory().getEmpruntDAO().getEmpruntById(idEmprunt);
    }

    @Override
    public void rendreLivreDeLemprunt(Emprunt emprunt) {
        //on rend le livre, donc on met à jour l'emprunt
        getDaoFactory().getEmpruntDAO().rendreLivreDeLemprunt(emprunt);
        transfertReservationVersEmprunt(emprunt);
    }

    @Override
    public Reservation getPremiereReservationByBookId(int idLivre) {

        List<Reservation> reservationsLivre = getDaoFactory().getReservationDAO().getReservationsByBookId(idLivre);

        Date date = new Date();
        Reservation premiereReservation = new Reservation();
        for (Reservation reservation : reservationsLivre) {
            if (reservation.getDateReservation().getTime() < date.getTime()) {
                date = reservation.getDateReservation();
                premiereReservation = reservation;
            }
        }
        return premiereReservation;
    }

    @Override
    public void transfertReservationVersEmprunt(Emprunt emprunt) {

        // on transfere la premiere reservation vers l'emprunt
        Reservation premiereReservation = getPremiereReservationByBookId(emprunt.getIdLivre());
        //on crée l'emprunt depuis la reservation
        Emprunt emprunt1 = new Emprunt();
        emprunt1.setIdLivre(emprunt.getIdLivre());
        emprunt1.setIdUtilisateur(premiereReservation.getIdUser());
        getDaoFactory().getEmpruntDAO().creerEmprunt(emprunt1);

        // on supprime la réservation
        getDaoFactory().getReservationDAO().supprimerReservation(premiereReservation);
        // Reservation reservation = getDaoFactory().getReservationDAO().
    }

    @Override
    public boolean livreIsEmpruntable(int idLivre) {
        boolean empruntable = false;
        // recuperer le livre en question

        if (empruntPossible(idLivre)) {
            empruntable = true;
        }
        return empruntable;
    }

    @Override
    public boolean livreIsReservable(int idLivre) {
        boolean reservable = false;
        Livre livre = getDaoFactory().getLivreDAO().getLivreById(idLivre);
        int nbReservationsPossibles = 2 * livre.getNbExemplaires();
        List<Reservation> listeReservations = getDaoFactory().getReservationDAO().getListeReservations();
        int nbReservationsDuLivre = 0;

        for (Reservation reservation : listeReservations) {
            if (livre.getId() == reservation.getIdLivre()) {
                nbReservationsDuLivre++;
            }
        }
        if (empruntPossible(livre.getId())) {
            reservable = false;

        } else if (nbReservationsPossibles > nbReservationsDuLivre) {

            reservable = true;
        }

        return reservable;
    }
}
