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

	public UtilisateurManager getUtilisateurManager() {
		return utilisateurManager;
	}

	public void setUtilisateurManager(UtilisateurManager utilisateurManager) {
		this.utilisateurManager = utilisateurManager;
	}

	public LivreManager getLivreManager() {
		return livreManager;
	}

	public void setLivreManager(LivreManager livreManager) {
		this.livreManager = livreManager;
	}

	public AuteurManager getAuteurManager() {
		return auteurManager;
	}

	public void setAuteurManager(AuteurManager auteurManager) {
		this.auteurManager = auteurManager;
	}

	public EmpruntManager getEmpruntManager() {
		return empruntManager;
	}

	public void setEmpruntManager(EmpruntManager empruntManager) {
		this.empruntManager = empruntManager;
	}

	
	
}
