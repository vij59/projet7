package org.application.consumer.impl;

import java.util.List;

import org.application.consumer.contract.EmpruntDAO;
import org.webservice.services.Emprunt;
import org.webservice.services.EmpruntWebservice;
import org.webservice.services.Emprunt_Service;
import org.webservice.services.LivreWebservice;
import org.webservice.services.Livre_Service;

public class EmpruntDAOImpl implements EmpruntDAO {

	@Override
	public List<Emprunt> getEmprunts() {
		Emprunt_Service empruntService = new Emprunt_Service();
		EmpruntWebservice empruntWebService = empruntService.getEmpruntWebservicePort();
		return empruntWebService.getAllEmprunts();
	}
	
	@Override
	public void prolongerEmprunt(Emprunt emprunt) {
		Emprunt_Service empruntService = new Emprunt_Service();
		EmpruntWebservice empruntWebService = empruntService.getEmpruntWebservicePort();
		 empruntWebService.empruntProlonge(emprunt);
	}
	
	
	@Override
	public Emprunt getEmpruntByUserId(int idUser) {
		Emprunt_Service empruntService = new Emprunt_Service();
		EmpruntWebservice empruntWebService = empruntService.getEmpruntWebservicePort();
		return empruntWebService.getEmpruntByUserId(idUser);
	}

}
