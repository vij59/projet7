package org.application.consumer.impl;

import org.application.consumer.contract.AuteurDAO;
import org.application.consumer.contract.DaoFactory;
import org.application.consumer.contract.EmpruntDAO;
import org.application.consumer.contract.LivreDAO;
import org.application.consumer.contract.UtilisateurDAO;

public class DaoFactoryImpl implements DaoFactory {

	private UtilisateurDAO utilisateurDao;
	private LivreDAO livreDao;
	private AuteurDAO auteurDao;
	private EmpruntDAO empruntDao;

	public UtilisateurDAO getUtilisateurDao() {
		return utilisateurDao;
	}

	public void setUtilisateurDao(UtilisateurDAO utilisateurDao) {
		this.utilisateurDao = utilisateurDao;
	}

	public LivreDAO getLivreDao() {
		return livreDao;
	}

	public void setLivreDao(LivreDAO livreDao) {
		this.livreDao = livreDao;
	}

	public AuteurDAO getAuteurDao() {
		return auteurDao;
	}

	public void setAuteurDao(AuteurDAO auteurDao) {
		this.auteurDao = auteurDao;
	}

	public EmpruntDAO getEmpruntDao() {
		return empruntDao;
	}

	public void setEmpruntDao(EmpruntDAO empruntDao) {
		this.empruntDao = empruntDao;
	}

	
}
