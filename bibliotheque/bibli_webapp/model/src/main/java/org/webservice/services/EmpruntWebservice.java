
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

}
