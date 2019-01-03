package org.webapp.action;

import com.opensymphony.xwork2.ActionContext;
import org.webapp.resource.AbstractRessource;
import org.webservice.services.Utilisateur;

import java.util.List;

public class UtilisateurInfos extends AbstractRessource {

    private static final long serialVersionUID = 1L;
    private Utilisateur utilisateur;
    private int idUser;

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    /**
     * Action listant les {@link Projet}
     * @return success
     */

    public String execute(){
        Utilisateur user = (Utilisateur) ActionContext.getContext().getSession().get("user");
        utilisateur = getManagerFactory().getUtilisateurManager().getUtilisateurById(user.getId());
        return "success";
    }

        public String desactiverRappel() {
        Utilisateur user = (Utilisateur) ActionContext.getContext().getSession().get("user");
            utilisateur = getManagerFactory().getUtilisateurManager().getUtilisateurById(user.getId());
        getManagerFactory().getUtilisateurManager().setRappelInactifById(user.getId());

        return "success";
    }
    public String activerRappel() {
        Utilisateur user = (Utilisateur) ActionContext.getContext().getSession().get("user");
        utilisateur = getManagerFactory().getUtilisateurManager().getUtilisateurById(user.getId());
        getManagerFactory().getUtilisateurManager().setRappelActifById(user.getId());

        return "success";
    }

}
