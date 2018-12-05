package org.webapp.action;

import java.util.Date;
import java.util.List;

import org.webapp.resource.AbstractRessource;
import org.webservice.services.Emprunt;
import org.webservice.services.Utilisateur;
import com.opensymphony.xwork2.ActionContext;

public class ListerEmprunts extends AbstractRessource  {


	private static final long serialVersionUID = 1L;
	private List<Emprunt> mesEmprunts;
	

	public List<Emprunt> getMesEmprunts() {
		return mesEmprunts;
	}
    public Date customDate;
	public void setMesEmprunts(List<Emprunt> mesEmprunts) {
		this.mesEmprunts = mesEmprunts;
	}

    public Date getCustomDate() {
        return customDate;
    }

    public void setCustomDate(Date customDate) {
        this.customDate = customDate;
    }


	// ==================== Méthodes ====================
 

	/**
     * Action listant les {@link Projet}
     * @return success
     */
    public String execute() {
    	
    	Utilisateur user = (Utilisateur) ActionContext.getContext().getSession().get("user");
    	//Utilisateur user = (Utilisateur) session.getAttribute("user");  
    	
    	//Utilisateur user = (Utilisateur) session.get("user");  

		System.currentTimeMillis();

        Date newDate;
        newDate = new Date();

        setCustomDate(newDate);

        mesEmprunts =  getManagerFactory().getEmpruntManager().getEmpruntByUserId(user.getId());

   	
        return "success";
    }

}
