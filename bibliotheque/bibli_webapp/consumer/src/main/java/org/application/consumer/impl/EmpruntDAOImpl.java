package org.application.consumer.impl;

import org.application.consumer.contract.EmpruntDAO;
import org.webservice.services.Emprunt;
import org.webservice.services.EmpruntWebservice;
import org.webservice.services.Emprunt_Service;

import java.util.List;

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
    public List<Emprunt> getEmpruntByUserId(int idUser) {
        System.out.println("emprunt by udser id fonctionne");
        return empruntWebService.getEmpruntByUserId(idUser);
    }

    @Override
    public List<Emprunt> getEmpruntsEnCours() {
        // TODO Auto-generated method stub
        return empruntWebService.getEmpruntsEnCours();
    }

    @Override
    public void creerEmprunt(Emprunt emprunt) {
        empruntWebService.creerEmprunt(emprunt);
    }

    @Override
    public void rendreLivreDeLemprunt(int idEmprunt) {
        empruntWebService.rendreLivreDeLemprunt(idEmprunt);
    }

    @Override
    public Emprunt getEmpruntById(int idEmprunt) {
        return empruntWebService.getEmpruntById(idEmprunt);
    }

    @Override
    public void recupererLivreByIdEmprunt(int idEmprunt) {
        empruntWebService.recupererLivreByIdEmprunt(idEmprunt);
    }

    @Override
    public void livreNonRecupereByIdEmprunt(int idEmprunt) {
        empruntWebService.livreNonRecupereByIdEmprunt(idEmprunt);
    }

    @Override
    public List<Emprunt> getEmpruntsEnCoursByUserId(int idUser) {
        return empruntWebService.getEmpruntsEnCoursByUserId(idUser);
    }
}
