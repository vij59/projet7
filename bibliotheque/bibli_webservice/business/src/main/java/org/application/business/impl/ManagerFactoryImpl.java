package org.application.business.impl;

import org.application.business.contract.*;

public class ManagerFactoryImpl implements ManagerFactory {

	private UtilisateurManager utilisateurManager;
	private LivreManager livreManager;
	private AuteurManager auteurManager;
	private EmpruntManager empruntManager;
	private ReservationManager reservationManager;

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

	@Override
	public ReservationManager getReservationManager() {
		return reservationManager;
	}

	public void setReservationManager(ReservationManager reservationManager) {
		this.reservationManager = reservationManager;
	}
}
