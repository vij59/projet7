package org.application.business.contract;

import java.util.List;

import org.webservice.services.Emprunt;

public interface EmpruntManager {

	List<Emprunt> getEmprunts();

	void prolongerEmprunt(int emprunt);

	List<Emprunt>getEmpruntByUserId(int idUser);

	List<Emprunt> getEmpruntsEnCours();

	void creerEmprunt(Emprunt emprunt);

	void rendreLivreDeLemprunt(int idEmprunt);

	Emprunt getEmpruntById(int idEmprunt) ;

	List<Emprunt>  getMesEmpruntsEnCours(int idUser);

    void recupererLivreByIdEmprunt(int idEmprunt);

	void livreNonRecupereByIdEmprunt(int idEmprunt);
}
