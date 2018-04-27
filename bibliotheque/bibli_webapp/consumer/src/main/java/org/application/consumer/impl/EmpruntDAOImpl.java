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
		System.out.println("emprunt fonctionne");
		return empruntWebService.getAllEmprunts();
	}
	
	@Override
	public void prolongerEmprunt(int emprunt) {
		Emprunt_Service empruntService = new Emprunt_Service();
		EmpruntWebservice empruntWebService = empruntService.getEmpruntWebservicePort();
		
		System.out.println("prolonger fonctionne");
		
		 empruntWebService.empruntProlonge(emprunt);
	}
	
	
	@Override
	public List<Emprunt>getEmpruntByUserId(int idUser) {
		Emprunt_Service empruntService = new Emprunt_Service();
		EmpruntWebservice empruntWebService = empruntService.getEmpruntWebservicePort();
		System.out.println("emprunt by udser id fonctionne");
		return empruntWebService.getEmpruntByUserId(idUser);
	}

}
