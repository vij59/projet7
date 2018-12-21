package org.application.business.contract;

public interface ManagerFactory {

	public UtilisateurManager getUtilisateurManager();
	public LivreManager getLivreManager();
	public AuteurManager getAuteurManager();
	public EmpruntManager getEmpruntManager();
	public ReservationManager getReservationManager();
}
