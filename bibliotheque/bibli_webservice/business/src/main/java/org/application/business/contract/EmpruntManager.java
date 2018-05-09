package org.application.business.contract;

import java.util.List;

import org.application.model.Emprunt;

public interface EmpruntManager {

	List<Emprunt> getListeEmprunts();

	void creerEmprunt(Emprunt emprunt);

	boolean empruntPossible(int id);

	void empruntProlonge(int idEmprunt);

	List<Emprunt> getEmpruntByUserId(int idUser);

	List<Emprunt> getEmpruntsEnCours();

}
