package org.application.consumer.contract;

public interface DaoFactory {

	public UtilisateurDAO getUtilisateurDao();
	public LivreDAO getLivreDao();
	public AuteurDAO getAuteurDao();
	public EmpruntDAO getEmpruntDao();
}
