package org.application.consumer.impl;

import org.application.consumer.contract.AuteurDAO;
import org.application.consumer.contract.DaoFactory;
import org.application.consumer.contract.EmpruntDAO;
import org.application.consumer.contract.LivreDAO;
import org.application.consumer.contract.UtilisateurDAO;

public class DaoFactoryImpl implements DaoFactory {

	
	private AuteurDAO auteurDAO;
    private LivreDAO livreDAO;
    private EmpruntDAO empruntDAO;
    private UtilisateurDAO utilisateurDAO;
    
	public AuteurDAO getAuteurDAO() {
		return auteurDAO;
	}
	public void setAuteurDAO(AuteurDAO auteurDAO) {
		this.auteurDAO = auteurDAO;
	}
	public LivreDAO getLivreDAO() {
		return livreDAO;
	}
	public void setLivreDAO(LivreDAO livreDAO) {
		this.livreDAO = livreDAO;
	}
	public EmpruntDAO getEmpruntDAO() {
		return empruntDAO;
	}
	public void setEmpruntDAO(EmpruntDAO empruntDAO) {
		this.empruntDAO = empruntDAO;
	}
	public UtilisateurDAO getUtilisateurDAO() {
		return utilisateurDAO;
	}
	public void setUtilisateurDAO(UtilisateurDAO utilisateurDAO) {
		this.utilisateurDAO = utilisateurDAO;
	}
    
    
	
}
