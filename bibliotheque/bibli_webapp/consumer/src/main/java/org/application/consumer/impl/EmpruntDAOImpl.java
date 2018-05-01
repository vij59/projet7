package org.application.consumer.impl;

import java.util.List;

import org.application.consumer.contract.EmpruntDAO;
import org.webservice.services.Emprunt;
import org.webservice.services.EmpruntWebservice;
import org.webservice.services.Emprunt_Service;
import org.webservice.services.LivreWebservice;
import org.webservice.services.Livre_Service;

public class EmpruntDAOImpl implements EmpruntDAO {

	Emprunt_Service empruntService = new Emprunt_Service();
	EmpruntWebservice empruntWebService = empruntService.getEmpruntWebservicePort();
	
	@Override
	public List<Emprunt> getEmprunts() {
		
		System.out.println("emprunt fonctionne");
		return empruntWebService.getAllEmprunts();
	}
	
	@Override
	public void prolongerEmprunt(int emprunt) {
		
		System.out.println("prolonger fonctionne");
		
		 empruntWebService.empruntProlonge(emprunt);
	}
	
	
	@Override
	public List<Emprunt>getEmpruntByUserId(int idUser) {
		System.out.println("emprunt by udser id fonctionne");
		return empruntWebService.getEmpruntByUserId(idUser);
	}

	@Override
	public List<Emprunt> getEmpruntsEnCours() {
		// TODO Auto-generated method stub
		return empruntWebService.getEmpruntsEnCours();
	}

}
