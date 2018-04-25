
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
@WebService(name = "LivreWebservice", targetNamespace = "http://services.webservice.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LivreWebservice {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<org.webservice.services.Livre>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLivreByRecherche", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetLivreByRecherche")
    @ResponseWrapper(localName = "getLivreByRechercheResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetLivreByRechercheResponse")
    @Action(input = "http://services.webservice.org/LivreWebservice/getLivreByRechercheRequest", output = "http://services.webservice.org/LivreWebservice/getLivreByRechercheResponse")
    public List<Livre> getLivreByRecherche(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<org.webservice.services.Livre>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getByNom", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetByNom")
    @ResponseWrapper(localName = "getByNomResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetByNomResponse")
    @Action(input = "http://services.webservice.org/LivreWebservice/getByNomRequest", output = "http://services.webservice.org/LivreWebservice/getByNomResponse")
    public List<Livre> getByNom(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.webservice.services.Livre
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getById", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetById")
    @ResponseWrapper(localName = "getByIdResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetByIdResponse")
    @Action(input = "http://services.webservice.org/LivreWebservice/getByIdRequest", output = "http://services.webservice.org/LivreWebservice/getByIdResponse")
    public Livre getById(
        @WebParam(name = "arg0", targetNamespace = "")
        long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<org.webservice.services.Livre>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLivres", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetLivres")
    @ResponseWrapper(localName = "getLivresResponse", targetNamespace = "http://services.webservice.org/", className = "org.webservice.services.GetLivresResponse")
    @Action(input = "http://services.webservice.org/LivreWebservice/getLivresRequest", output = "http://services.webservice.org/LivreWebservice/getLivresResponse")
    public List<Livre> getLivres();

}