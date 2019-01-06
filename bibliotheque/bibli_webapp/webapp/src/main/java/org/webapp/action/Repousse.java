package org.webapp.action;

import com.opensymphony.xwork2.ActionContext;
import org.webapp.resource.AbstractRessource;
import org.webservice.services.Emprunt;
import org.webservice.services.Utilisateur;

import java.util.List;

public class Repousse extends AbstractRessource {
    private int id_emprunt;
    private List<Emprunt> mesEmprunts;
    String result = "error";


    public int getId_emprunt() {
        return id_emprunt;
    }


    public void setId_emprunt(int id_emprunt) {
        this.id_emprunt = id_emprunt;
    }


    public List<Emprunt> getMesEmprunts() {
        return mesEmprunts;
    }


    public void setMesEmprunts(List<Emprunt> mesEmprunts) {
        this.mesEmprunts = mesEmprunts;
    }


    public String execute() {
        Utilisateur user = (Utilisateur) ActionContext.getContext().getSession().get("user");


        mesEmprunts = getManagerFactory().getEmpruntManager().getEmpruntByUserId(user.getId());

        for (Emprunt emprunt : mesEmprunts) {
            if (emprunt.getId() == id_emprunt) {
                getManagerFactory().getEmpruntManager().prolongerEmprunt(emprunt.getId());
                result = "success";
            }
        }

        return result;

    }

}