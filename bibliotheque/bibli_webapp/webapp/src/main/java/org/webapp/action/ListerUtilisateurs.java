package org.webapp.action;

import org.webapp.resource.AbstractRessource;
import org.webservice.services.Emprunt;
import org.webservice.services.Utilisateur;

import java.util.List;

public class ListerUtilisateurs extends AbstractRessource {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // ==================== Attributs ====================
    // ----- Paramètres en entrée
    private Integer id;

    // ----- Eléments en sortie
    private List<Utilisateur> listeUtilisateurs;
    private Utilisateur utilisateur;
    private List<Emprunt> listeEmprunts;

    // ==================== Getters/Setters ====================
    public Integer getId() {
        return id;
    }

    public void setId(Integer pId) {
        id = pId;
    }

    public List<Utilisateur> getListeUtilisateurs() {
        return listeUtilisateurs;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public List<Emprunt> getListeEmprunts() {
        return listeEmprunts;
    }

    public void setListeEmprunts(List<Emprunt> listeEmprunts) {
        this.listeEmprunts = listeEmprunts;
    }

    // ==================== Méthodes ====================

    /**
     * Action listant les {@link Projet}
     *
     * @return success
     */
    public String execute() {
        listeEmprunts = getManagerFactory().getEmpruntManager().getEmprunts();
        return "success";
    }

}
