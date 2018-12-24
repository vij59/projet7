package org.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.application.model.Emprunt;

@WebService(serviceName = "Emprunt")
public class EmpruntWebservice extends AbstractWebservice {

	@WebMethod
	public List<Emprunt> getAllEmprunts() {

		return getManagerFactory().getEmpruntManager().getListeEmprunts();
	}

	@WebMethod
	public void empruntProlonge(int idEmprunt) {
		getManagerFactory().getEmpruntManager().empruntProlonge(idEmprunt);
	}

	@WebMethod
	public List<Emprunt> getEmpruntByUserId(int idUser) {
		return getManagerFactory().getEmpruntManager().getEmpruntByUserId(idUser);
	}

	@WebMethod
	public List<Emprunt> getEmpruntsEnCours() {
		return getManagerFactory().getEmpruntManager().getEmpruntsEnCours();
	}

	@WebMethod
	public void creerEmprunt(Emprunt emprunt) {
		getManagerFactory().getEmpruntManager().creerEmprunt(emprunt);
	}

	@WebMethod
	public void rendreLivreDeLemprunt(Emprunt emprunt) {
		getManagerFactory().getEmpruntManager().rendreLivreDeLemprunt(emprunt);
	}

	@WebMethod
	public Emprunt getEmpruntById(int idEmprunt) {
		return getManagerFactory().getEmpruntManager().getEmpruntById(idEmprunt);
	}
}
