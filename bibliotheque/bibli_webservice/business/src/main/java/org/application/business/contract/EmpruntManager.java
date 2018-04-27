package org.application.business.contract;

import java.util.List;

import org.application.model.Emprunt;

public interface EmpruntManager {


    List<Emprunt> getEmpruntByUserEmail(String email);
    List<Emprunt> getAllEmprunts();
    void newEmprunt(Emprunt emprunt);
    void updateEmprunt(Emprunt emprunt);
    List<Emprunt> getLateEmprunts();
	boolean empruntPossible(int id);
	 void empruntProlonge(int idEmprunt);
	 List<Emprunt> getEmpruntByUserId(int idUser);
	



}
