package org.webservice.services;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.application.model.Emprunt;

@WebService(serviceName = "Emprunt")
	public class EmpruntWebservice extends AbstractWebservice {

	    @WebMethod
	    public List<Emprunt> getAllEmprunts(){

	        return getManagerFactory().getEmpruntManager().getAllEmprunts();
	    }

	    @WebMethod
	    public void empruntProlonge(int idEmprunt) {
	        getManagerFactory().getEmpruntManager().empruntProlonge(idEmprunt);
	    }
	    
	    @WebMethod
	    public List<Emprunt> getEmpruntByUserId(int idUser) {
	        return getManagerFactory().getEmpruntManager().getEmpruntByUserId(idUser);
	    }
	    
//
//	    @WebMethod
//	    public void saveNewEmprunt(Emprunt emprunt)
//	    {
//	        getManagerFactory().getEmpruntManager().newEmprunt(emprunt);
//	    }
//
//	    @WebMethod
//	    public void updateEmprunt(Emprunt emprunt)
//	    {
//	        getManagerFactory().getEmpruntManager().updateEmprunt(emprunt);
//	    }
//
//	    @WebMethod
//	    public List<Emprunt> getLateEmprunts()
//	    {
//	        return getManagerFactory().getEmpruntManager().getLateEmprunts();
//	    }

}
