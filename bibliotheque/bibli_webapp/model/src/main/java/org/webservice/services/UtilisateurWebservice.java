
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
     * @return
     *     returns org.webservice.services.Utilisateur
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUtilisateurById", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetUtilisateurById")
    @ResponseWrapper(localName = "getUtilisateurByIdResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetUtilisateurByIdResponse")
    @Action(input = "http://services.webservice.org/UtilisateurWebservice/getUtilisateurByIdRequest", output = "http://services.webservice.org/UtilisateurWebservice/getUtilisateurByIdResponse")
    public Utilisateur getUtilisateurById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setRappelInActifByUserId", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.SetRappelInActifByUserId")
    @ResponseWrapper(localName = "setRappelInActifByUserIdResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.SetRappelInActifByUserIdResponse")
    @Action(input = "http://services.webservice.org/UtilisateurWebservice/setRappelInActifByUserIdRequest", output = "http://services.webservice.org/UtilisateurWebservice/setRappelInActifByUserIdResponse")
    public void setRappelInActifByUserId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setRappelActifByUserId", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.SetRappelActifByUserId")
    @ResponseWrapper(localName = "setRappelActifByUserIdResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.SetRappelActifByUserIdResponse")
    @Action(input = "http://services.webservice.org/UtilisateurWebservice/setRappelActifByUserIdRequest", output = "http://services.webservice.org/UtilisateurWebservice/setRappelActifByUserIdResponse")
    public void setRappelActifByUserId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
