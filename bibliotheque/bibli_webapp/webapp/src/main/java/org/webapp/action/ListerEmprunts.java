package org.webapp.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.webapp.resource.AbstractRessource;
import org.webservice.services.Emprunt;
import org.webservice.services.Livre;
import org.webservice.services.Reservation;
import org.webservice.services.Utilisateur;
import com.opensymphony.xwork2.ActionContext;

public class ListerEmprunts extends AbstractRessource  {

// reliée à la jsp monCompte

	private static final long serialVersionUID = 1L;
	private List<Emprunt> mesEmprunts;
    private List<Reservation> mesReservations;
    private int idLivreRecupere;


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


    public List<Reservation> getMesReservations() {
        return mesReservations;
    }

    public void setMesReservations(List<Reservation> mesReservations) {
        this.mesReservations = mesReservations;
    }

    public int getIdLivreRecupere() {
        return idLivreRecupere;
    }

    public void setIdLivreRecupere(int idLivreRecupere) {
        this.idLivreRecupere = idLivreRecupere;
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

        List<Integer> mesIdsReservations = new ArrayList<>();

        mesReservations = getManagerFactory().getReservationManager().getReservationsByUserId(user.getId());
        for (Reservation reservation : mesReservations) {
            mesIdsReservations.add(reservation.getIdLivre());
            reservation.setLivre(getManagerFactory().getLivreManager().getLivreById(reservation.getIdLivre()));
        }

        mesEmprunts =  getManagerFactory().getEmpruntManager().getEmpruntByUserId(user.getId());
        List<Livre> listeLivres = getManagerFactory().getLivreManager().getLivres();
        for(Emprunt  emprunt : mesEmprunts) {
            for(Livre livre : listeLivres) {
                if(livre.getId() ==  emprunt.getIdLivre()) {
                    emprunt.setLivre(livre);
                }
            }
        }

   	
        return "success";
    }

    public String recupererLivre() {

        getManagerFactory().getEmpruntManager().recupererLivreByIdEmprunt(idLivreRecupere);
    return "success";
    }

    public String rendreLivre() {

        getManagerFactory().getEmpruntManager().rendreLivreDeLemprunt(idLivreRecupere);
        return "success";
    }

}
