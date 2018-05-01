package org.application.business.contract;

import java.util.List;

import org.webservice.services.Emprunt;

public interface EmpruntManager {
	public List<Emprunt> getEmprunts();

	void prolongerEmprunt(int emprunt);

	public List<Emprunt>getEmpruntByUserId(int idUser);

	public List<Emprunt> getEmpruntsEnCours();
}
