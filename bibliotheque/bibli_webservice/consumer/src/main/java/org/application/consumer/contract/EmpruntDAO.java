package org.application.consumer.contract;

import java.util.List;
import org.application.model.Emprunt;

public interface EmpruntDAO {

	void creer(Emprunt emprunt);

	void actualiser(Emprunt emprunt);

	void empruntProlonge(Emprunt emprunt);

	List<Emprunt> getLateReturns();

	List<Emprunt> getListeEmprunts();

	Emprunt getEmpruntByUserId(int userId);


}
