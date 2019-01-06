package org.webservice.services;

import org.application.model.Emprunt;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

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
    public void rendreLivreDeLemprunt(int idEmprunt) {
        getManagerFactory().getEmpruntManager().rendreLivreDeLemprunt(idEmprunt);
    }

    @WebMethod
    public Emprunt getEmpruntById(int idEmprunt) {
        return getManagerFactory().getEmpruntManager().getEmpruntById(idEmprunt);
    }

    @WebMethod
    public void recupererLivreByIdEmprunt(int idEmprunt) {
        getManagerFactory().getEmpruntManager().recupererLivre(idEmprunt);
    }

    @WebMethod
    public void livreNonRecupereByIdEmprunt(int idEmprunt) {
        getManagerFactory().getEmpruntManager().livreNonRecupereByIdEmprunt(idEmprunt);
    }

    @WebMethod
    public List<Emprunt> getEmpruntsEnCoursByUserId(int idUser) {
        return getManagerFactory().getEmpruntManager().getEmpruntsEnCoursByUserId(idUser);
    }

    @WebMethod
    public void setMailSentByEmpruntId(int id) {
        getManagerFactory().getEmpruntManager().setMailSentByEmpruntId(id);
    }
}
