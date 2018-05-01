package org.application.consumer.contract;

import java.util.List;

import org.webservice.services.Emprunt;

public interface EmpruntDAO {

	public List<Emprunt> getEmprunts();

	void prolongerEmprunt(int emprunt);

	public List<Emprunt>getEmpruntByUserId(int idUser);
	
	public List<Emprunt>getEmpruntsEnCours();
}
