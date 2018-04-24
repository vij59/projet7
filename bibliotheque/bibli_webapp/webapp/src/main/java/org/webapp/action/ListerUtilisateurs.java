package org.webapp.action;

import java.util.List;

import org.webapp.resource.AbstractRessource;
import org.webservice.services.Auteur;
import org.webservice.services.Emprunt;
import org.webservice.services.Livre;
import org.webservice.services.Utilisateur;




public class ListerUtilisateurs extends AbstractRessource {

	  // ==================== Attributs ====================
    // ----- Paramètres en entrée
    private Integer id;

    // ----- Eléments en sortie
    private List<Utilisateur> listeUtilisateurs;
    private Utilisateur utilisateur;
    private List<Livre> listeLivres;
    private List<Auteur> listeAuteurs;
    private List<Emprunt> listeEmprunts;


    public List<Auteur> getListeAuteurs() {
		return listeAuteurs;
	}
	public void setListeAuteurs(List<Auteur> listeAuteurs) {
		this.listeAuteurs = listeAuteurs;
	}
	public List<Livre> getListeLivres() {
		return listeLivres;
	}
	public void setListeLivres(List<Livre> listeLivres) {
		this.listeLivres = listeLivres;
	}
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
     * @return success
     */
    public String execute() {
    		// listeUtilisateurs = getManagerFactory().getUtilisateurManager().getUtilisateurs();
    	// listeLivres = getManagerFactory().getLivreManager().getLivres();
    	// listeAuteurs = getManagerFactory().getAuteurManager().getAuteurs();
   	listeEmprunts =  getManagerFactory().getEmpruntManager().getEmprunts();
        return "success";
    }


}
