package org.webservice.services;

import org.application.model.Livre;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "Livre")
public class LivreWebservice extends AbstractWebservice {

    @WebMethod
    public List<Livre> getByNom(String nom) {
        return getManagerFactory().getLivreManager().getLivreByTitre(nom);
    }

    @WebMethod
    public Livre getLivreById(int id) {

        return getManagerFactory().getLivreManager().getLivreById(id);
    }

    @WebMethod
    public List<Livre> getLivres() {
        List<Livre> listeLivres = getManagerFactory().getLivreManager().getLivres();
        listeLivres = setAuteurAndStatus(listeLivres);
        return listeLivres;
    }

    public List<Livre> setAuteurAndStatus(List<Livre> listeLivres) {
        for (Livre livre : listeLivres) {

            livre.setAuteur(getManagerFactory().getAuteurManager().getAuteurById(livre.getIdAuteur()));
            boolean dispo = getManagerFactory().getEmpruntManager().empruntPossible(livre.getId());
            livre.setDisponible(dispo);
            if (getManagerFactory().getEmpruntManager().livreIsEmpruntable(livre.getId())) {
                livre.setEmpruntable(true);
            } else {
                livre.setEmpruntable(false);
            }
            if (getManagerFactory().getEmpruntManager().livreIsReservable(livre.getId())) {
                livre.setReservable(true);
            } else {
                livre.setReservable(false);
            }
        }
        return listeLivres;
    }

    @WebMethod
    public List<Livre> getLivreByRecherche(String titre, String auteur) {

        List<Livre> listeLivres = getManagerFactory().getLivreManager().getLivres();
        try {
            if (titre.equals(("")) && auteur.equals((""))) {
                for (Livre livre : listeLivres) {

                    livre.setAuteur(getManagerFactory().getAuteurManager().getAuteurById(livre.getIdAuteur()));
                    boolean dispo = getManagerFactory().getEmpruntManager().empruntPossible(livre.getId());
                    livre.setDisponible(dispo);
                }
                listeLivres = setAuteurAndStatus(listeLivres);
                return listeLivres;
            } else {

                List<Livre> listeLivresRecherchés = getManagerFactory().getLivreManager().getLivreByRecherche(titre, auteur);
                listeLivresRecherchés = setAuteurAndStatus(listeLivresRecherchés);
                return listeLivresRecherchés;
            }

        } catch (Exception e) {
            e.getMessage();
            return listeLivres;
        }
    }
}
