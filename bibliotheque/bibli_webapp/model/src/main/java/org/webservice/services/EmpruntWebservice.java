
package org.webservice.services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmpruntWebservice", targetNamespace = "http://services.webservice.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmpruntWebservice {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "empruntProlonge", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.EmpruntProlonge")
    @ResponseWrapper(localName = "empruntProlongeResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.EmpruntProlongeResponse")
    @Action(input = "http://services.webservice.org/EmpruntWebservice/empruntProlongeRequest", output = "http://services.webservice.org/EmpruntWebservice/empruntProlongeResponse")
    public void empruntProlonge(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "creerEmprunt", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.CreerEmprunt")
    @ResponseWrapper(localName = "creerEmpruntResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.CreerEmpruntResponse")
    @Action(input = "http://services.webservice.org/EmpruntWebservice/creerEmpruntRequest", output = "http://services.webservice.org/EmpruntWebservice/creerEmpruntResponse")
    public void creerEmprunt(
        @WebParam(name = "arg0", targetNamespace = "")
        Emprunt arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.webservice.services.Emprunt>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllEmprunts", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetAllEmprunts")
    @ResponseWrapper(localName = "getAllEmpruntsResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetAllEmpruntsResponse")
    @Action(input = "http://services.webservice.org/EmpruntWebservice/getAllEmpruntsRequest", output = "http://services.webservice.org/EmpruntWebservice/getAllEmpruntsResponse")
    public List<Emprunt> getAllEmprunts();

    /**
     * 
     * @param arg0
     * @return
     *     returns org.webservice.services.Emprunt
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEmpruntById", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetEmpruntById")
    @ResponseWrapper(localName = "getEmpruntByIdResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetEmpruntByIdResponse")
    @Action(input = "http://services.webservice.org/EmpruntWebservice/getEmpruntByIdRequest", output = "http://services.webservice.org/EmpruntWebservice/getEmpruntByIdResponse")
    public Emprunt getEmpruntById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "recupererLivreByIdEmprunt", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.RecupererLivreByIdEmprunt")
    @ResponseWrapper(localName = "recupererLivreByIdEmpruntResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.RecupererLivreByIdEmpruntResponse")
    @Action(input = "http://services.webservice.org/EmpruntWebservice/recupererLivreByIdEmpruntRequest", output = "http://services.webservice.org/EmpruntWebservice/recupererLivreByIdEmpruntResponse")
    public void recupererLivreByIdEmprunt(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "livreNonRecupereByIdEmprunt", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.LivreNonRecupereByIdEmprunt")
    @ResponseWrapper(localName = "livreNonRecupereByIdEmpruntResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.LivreNonRecupereByIdEmpruntResponse")
    @Action(input = "http://services.webservice.org/EmpruntWebservice/livreNonRecupereByIdEmpruntRequest", output = "http://services.webservice.org/EmpruntWebservice/livreNonRecupereByIdEmpruntResponse")
    public void livreNonRecupereByIdEmprunt(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.webservice.services.Emprunt>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEmpruntByUserId", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetEmpruntByUserId")
    @ResponseWrapper(localName = "getEmpruntByUserIdResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetEmpruntByUserIdResponse")
    @Action(input = "http://services.webservice.org/EmpruntWebservice/getEmpruntByUserIdRequest", output = "http://services.webservice.org/EmpruntWebservice/getEmpruntByUserIdResponse")
    public List<Emprunt> getEmpruntByUserId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.webservice.services.Emprunt>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEmpruntsEnCours", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetEmpruntsEnCours")
    @ResponseWrapper(localName = "getEmpruntsEnCoursResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetEmpruntsEnCoursResponse")
    @Action(input = "http://services.webservice.org/EmpruntWebservice/getEmpruntsEnCoursRequest", output = "http://services.webservice.org/EmpruntWebservice/getEmpruntsEnCoursResponse")
    public List<Emprunt> getEmpruntsEnCours();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "rendreLivreDeLemprunt", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.RendreLivreDeLemprunt")
    @ResponseWrapper(localName = "rendreLivreDeLempruntResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.RendreLivreDeLempruntResponse")
    @Action(input = "http://services.webservice.org/EmpruntWebservice/rendreLivreDeLempruntRequest", output = "http://services.webservice.org/EmpruntWebservice/rendreLivreDeLempruntResponse")
    public void rendreLivreDeLemprunt(
        @WebParam(name = "arg0", targetNamespace = "")
        Emprunt arg0);

}
