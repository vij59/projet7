package org.application.business.impl;

import org.application.business.contract.AuteurManager;
import org.application.business.contract.EmpruntManager;
import org.application.business.contract.LivreManager;
import org.application.business.contract.ManagerFactory;
import org.application.business.contract.UtilisateurManager;

public class ManagerFactoryImpl implements ManagerFactory {

	private UtilisateurManager utilisateurManager;
	private LivreManager livreManager;
	private AuteurManager auteurManager;
	private EmpruntManager empruntManager;

	public void setUtilisateurManager(UtilisateurManager utilisateurManager) {
		this.utilisateurManager = utilisateurManager;
	}

	@Override
	public UtilisateurManager getUtilisateurManager() {
		// TODO Auto-generated method stub
		return utilisateurManager;
	}

	public void setLivreManager(LivreManager livreManager) {
		this.livreManager = livreManager;
	}

	@Override
	public LivreManager getLivreManager() {
		// TODO Auto-generated method stub
		return livreManager;
	}

	public void setAuteurManager(AuteurManager auteurManager) {
		this.auteurManager = auteurManager;
	}

	@Override
	public AuteurManager getAuteurManager() {
		// TODO Auto-generated method stub
		return auteurManager;
	}

	public void setEmpruntManager(EmpruntManager empruntManager) {
		this.empruntManager = empruntManager;
	}

	@Override
	public EmpruntManager getEmpruntManager() {
		// TODO Auto-generated method stub
		return empruntManager;
	}

}
