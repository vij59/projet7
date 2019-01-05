package org.application.business.contract;

import java.util.Date;
import java.util.List;

import org.application.model.Emprunt;
import org.application.model.Livre;
import org.application.model.Reservation;

public interface EmpruntManager {

	List<Emprunt> getListeEmprunts();

	void creerEmprunt(Emprunt emprunt);

	boolean empruntPossible(int id);

	void empruntProlonge(int idEmprunt);

	List<Emprunt> getEmpruntByUserId(int idUser);

	List<Emprunt> getEmpruntsEnCours();

    Emprunt getEmpruntById(int idEmprunt);

    void rendreLivreDeLemprunt(int idEmprunt);

    Reservation getPremiereReservationByBookId(int idLivre);

    void transfertReservationVersEmprunt(Emprunt emprunt);

	boolean livreIsEmpruntable(int idLivre);

	boolean livreIsReservable(int idLivre);

    void recupererLivre(int idEmprunt);

	void livreNonRecupereByIdEmprunt(int idEmprunt);

	List<Emprunt> getEmpruntsEnCoursByUserId(int idUser);

    void setMailSentByEmpruntId(int idUser);
}
