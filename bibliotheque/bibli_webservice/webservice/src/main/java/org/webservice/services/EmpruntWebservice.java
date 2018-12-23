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
	public void creerEmprunt() {
		Emprunt emprunt = new Emprunt();
		emprunt.setIdUtilisateur(2);
		emprunt.setIdLivre(5);
		getManagerFactory().getEmpruntManager().creerEmprunt(emprunt);
	}
}
