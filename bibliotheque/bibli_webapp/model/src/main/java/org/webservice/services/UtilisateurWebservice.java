
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
@WebService(name = "UtilisateurWebservice", targetNamespace = "http://services.webservice.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UtilisateurWebservice {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validerLoginString", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.ValiderLoginString")
    @ResponseWrapper(localName = "validerLoginStringResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.ValiderLoginStringResponse")
    @Action(input = "http://services.webservice.org/UtilisateurWebservice/validerLoginStringRequest", output = "http://services.webservice.org/UtilisateurWebservice/validerLoginStringResponse")
    public boolean validerLoginString(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "actualiserUtilisateur", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.ActualiserUtilisateur")
    @ResponseWrapper(localName = "actualiserUtilisateurResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.ActualiserUtilisateurResponse")
    @Action(input = "http://services.webservice.org/UtilisateurWebservice/actualiserUtilisateurRequest", output = "http://services.webservice.org/UtilisateurWebservice/actualiserUtilisateurResponse")
    public void actualiserUtilisateur(
        @WebParam(name = "arg0", targetNamespace = "")
        Utilisateur arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.webservice.services.Utilisateur
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findUtilisateurByEmail", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.FindUtilisateurByEmail")
    @ResponseWrapper(localName = "findUtilisateurByEmailResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.FindUtilisateurByEmailResponse")
    @Action(input = "http://services.webservice.org/UtilisateurWebservice/findUtilisateurByEmailRequest", output = "http://services.webservice.org/UtilisateurWebservice/findUtilisateurByEmailResponse")
    public Utilisateur findUtilisateurByEmail(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "creerUtilisateur", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.CreerUtilisateur")
    @ResponseWrapper(localName = "creerUtilisateurResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.CreerUtilisateurResponse")
    @Action(input = "http://services.webservice.org/UtilisateurWebservice/creerUtilisateurRequest", output = "http://services.webservice.org/UtilisateurWebservice/creerUtilisateurResponse")
    public void creerUtilisateur(
        @WebParam(name = "arg0", targetNamespace = "")
        Utilisateur arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.webservice.services.Utilisateur>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUtilisateurs", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetUtilisateurs")
    @ResponseWrapper(localName = "getUtilisateursResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetUtilisateursResponse")
    @Action(input = "http://services.webservice.org/UtilisateurWebservice/getUtilisateursRequest", output = "http://services.webservice.org/UtilisateurWebservice/getUtilisateursResponse")
    public List<Utilisateur> getUtilisateurs();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "validerLogin", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.ValiderLogin")
    @ResponseWrapper(localName = "validerLoginResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.ValiderLoginResponse")
    @Action(input = "http://services.webservice.org/UtilisateurWebservice/validerLoginRequest", output = "http://services.webservice.org/UtilisateurWebservice/validerLoginResponse")
    public void validerLogin(
        @WebParam(name = "arg0", targetNamespace = "")
        Utilisateur arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.webservice.services.Utilisateur
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUtilisateurByMail", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetUtilisateurByMail")
    @ResponseWrapper(localName = "getUtilisateurByMailResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetUtilisateurByMailResponse")
    @Action(input = "http://services.webservice.org/UtilisateurWebservice/getUtilisateurByMailRequest", output = "http://services.webservice.org/UtilisateurWebservice/getUtilisateurByMailResponse")
    public Utilisateur getUtilisateurByMail(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}