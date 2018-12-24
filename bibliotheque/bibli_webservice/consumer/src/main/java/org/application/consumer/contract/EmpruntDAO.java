package org.application.consumer.contract;

import java.util.List;

import org.application.model.Emprunt;

public interface EmpruntDAO {

	void creerEmprunt(Emprunt emprunt);

	void empruntProlonge(int idEmprunt);

	List<Emprunt> getListeEmprunts();

	List<Emprunt> getEmpruntByUserId(int idUser);

	Emprunt getEmpruntById(int idEmprunt);

	List<Emprunt> getEmpruntsEnCours();

	// méthode qui va mettre fin à l'emprunt, et donc permet de rendre le livre
	void rendreLivreDeLemprunt(Emprunt emprunt);
}
