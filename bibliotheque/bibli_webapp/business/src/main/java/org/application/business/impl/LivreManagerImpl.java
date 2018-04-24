package org.application.business.impl;

import java.util.List;

import org.application.business.contract.LivreManager;
import org.webservice.services.Livre;

public class LivreManagerImpl extends AbstractManager implements LivreManager {

	@Override
	public List<Livre> getLivres() {
		// TODO Auto-generated method stub
		return getDaoFactory().getLivreDao().getLivres();
	}

	@Override
	public List<Livre> getLivreByRecherche(String titre, String nomAuteur) {
		// TODO Auto-generated method stub
		return getDaoFactory().getLivreDao().getLivreByRecherche(titre, nomAuteur) ;
	}
	
	@Override
	public Livre getById(int id) {
		return getDaoFactory().getLivreDao().getById( id) ;
	}
}
