package org.application.consumer.contract;

import java.util.List;
import org.application.model.Emprunt;

public interface EmpruntDAO {

	void creer(Emprunt emprunt);

	void actualiser(Emprunt emprunt);

	void empruntProlonge(int idEmprunt);

	List<Emprunt> getLateReturns();

	List<Emprunt> getListeEmprunts();

	 List<Emprunt> getEmpruntByUserId(int idUser);

	List<Emprunt> getEmpruntsEnCours();


}
