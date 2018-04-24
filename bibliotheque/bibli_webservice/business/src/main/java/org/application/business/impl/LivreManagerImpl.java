package org.application.business.impl;

import java.util.List;

import org.application.business.contract.LivreManager;
import org.application.model.Auteur;
import org.application.model.Livre;

public class LivreManagerImpl extends AbstractManager implements LivreManager {

	public List<Livre> getLivres() {
		
		return getDaoFactory().getLivreDAO().getLivres();
	}

	  @Override
	    public Livre getLivre(long id) {

	        return getDaoFactory().getLivreDAO().getById(id);

	    }

	    @Override
	    public void creerLivre(Livre livre) {

	        getDaoFactory().getLivreDAO().creer(livre);

	    }


	    @Override
	    public List<Livre> getLivreByNom(String nom) {
	        List<Livre> liste = getDaoFactory().getLivreDAO().getByNom(nom);

	        return liste;
	    }
	    
	    @Override
	    public Livre getLivreById(int id) {
	        Livre livre = getDaoFactory().getLivreDAO().getById(id);

	        return livre;
	    }
	    
	    @Override
	    public List<Livre> getLivreByRecherche(String titre, String auteur) {
	    	List<Livre> liste = getDaoFactory().getLivreDAO().getLivreByRecherche( titre,  auteur);

	        return liste;
	    }
	    
}
