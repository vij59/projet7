package org.application.business.impl;


import java.util.List;

import org.application.business.contract.EmpruntManager;
import org.application.model.Emprunt;
import org.application.model.Livre;

public class EmpruntManagerImpl extends AbstractManager implements EmpruntManager {


//    @Override
//    public List<Emprunt> getEmpruntByUserEmail(String email) {
//        return getDaoFactory().getEmpruntDAO().getByUserEmail(email);
//    }
//
//    @Override
//    public List<Emprunt> getAllEmprunts() {
//     return getDaoFactory().getEmpruntDAO().getListEmprunts();
//    }

    @Override
    public void newEmprunt(Emprunt emprunt) {
        getDaoFactory().getEmpruntDAO().creer(emprunt);

    }

    @Override
    public void updateEmprunt(Emprunt emprunt) {
        getDaoFactory().getEmpruntDAO().actualiser(emprunt);
    }

    @Override
    public List<Emprunt> getLateEmprunts() {
        return getDaoFactory().getEmpruntDAO().getLateReturns();
    }

	@Override
	public List<Emprunt> getEmpruntByUserEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emprunt> getAllEmprunts() {
		// TODO Auto-generated method stub
		List<Emprunt> liste = getDaoFactory().getEmpruntDAO().getListeEmprunts();
		
		for (Emprunt emprunt : liste) {
			
			Livre livre = getDaoFactory().getLivreDAO().getById(emprunt.getIdLivre());
			emprunt.setLivre(livre);
		
		}
		return liste;
	}
	
	@Override
	public boolean empruntPossible(int id) {
		// TODO Auto-generated method stub
		
		List<Emprunt> listeEmprunts = getDaoFactory().getEmpruntDAO().getListeEmprunts();
		List<Livre> listeLivres  = getDaoFactory().getLivreDAO().getLivres();
		Livre livre =  getDaoFactory().getLivreDAO().getById(id);
		boolean dispo = false;
	
			int nbDispo = livre.getNbExemplaires();
			int nbRestant = nbDispo;
			
			for(Emprunt emprunt : listeEmprunts) {
				if(emprunt.getIdLivre() ==id && emprunt.isEnCours()) {
					livre.setNbRestant(--nbRestant);
				}
			}
		
			if (livre.getNbRestant()<= 0)
			{
				dispo = false;
			}
			else {
				dispo = true;
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
		
		for (Emprunt emprunt : liste) {
			
			Livre livre = getDaoFactory().getLivreDAO().getById(emprunt.getIdLivre());
			emprunt.setLivre(livre);
		
		}
		return liste;
		
	}
}
