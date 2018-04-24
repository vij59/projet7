package org.webapp.action;

import java.util.List;

import org.webapp.resource.AbstractRessource;
import org.webservice.services.Emprunt;

public class ListerEmprunts extends AbstractRessource {

	 private List<Emprunt> mesEmprunts;
	 

	public List<Emprunt> getMesEmprunts() {
		return mesEmprunts;
	}


	public void setMesEmprunts(List<Emprunt> mesEmprunts) {
		this.mesEmprunts = mesEmprunts;
	}


	// ==================== Méthodes ====================
    /**
     * Action listant les {@link Projet}
     * @return success
     */
    public String execute() {
    		// listeUtilisateurs = getManagerFactory().getUtilisateurManager().getUtilisateurs();
    	// listeLivres = getManagerFactory().getLivreManager().getLivres();
    	// listeAuteurs = getManagerFactory().getAuteurManager().getAuteurs();
   	mesEmprunts =  getManagerFactory().getEmpruntManager().getEmprunts();
        return "success";
    }

}
