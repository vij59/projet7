
package org.webservice.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UtilisateurWebservice", targetNamespace = "http://services.webservice.org/", wsdlLocation = "http://vij-pc:8080/webservice2396852418528692936/UtilisateurWebservice?wsdl")
public class UtilisateurWebservice_Service
    extends Service
{

    private final static URL UTILISATEURWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException UTILISATEURWEBSERVICE_EXCEPTION;
    private final static QName UTILISATEURWEBSERVICE_QNAME = new QName("http://services.webservice.org/", "UtilisateurWebservice");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://vij-pc:8080/webservice2396852418528692936/UtilisateurWebservice?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        UTILISATEURWEBSERVICE_WSDL_LOCATION = url;
        UTILISATEURWEBSERVICE_EXCEPTION = e;
    }

    public UtilisateurWebservice_Service() {
        super(__getWsdlLocation(), UTILISATEURWEBSERVICE_QNAME);
    }

    public UtilisateurWebservice_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), UTILISATEURWEBSERVICE_QNAME, features);
    }

    public UtilisateurWebservice_Service(URL wsdlLocation) {
        super(wsdlLocation, UTILISATEURWEBSERVICE_QNAME);
    }

    public UtilisateurWebservice_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, UTILISATEURWEBSERVICE_QNAME, features);
    }

    public UtilisateurWebservice_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UtilisateurWebservice_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UtilisateurWebservice
     */
    @WebEndpoint(name = "UtilisateurWebservicePort")
    public UtilisateurWebservice getUtilisateurWebservicePort() {
        return super.getPort(new QName("http://services.webservice.org/", "UtilisateurWebservicePort"), UtilisateurWebservice.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UtilisateurWebservice
     */
    @WebEndpoint(name = "UtilisateurWebservicePort")
    public UtilisateurWebservice getUtilisateurWebservicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.webservice.org/", "UtilisateurWebservicePort"), UtilisateurWebservice.class, features);
    }

    private static URL __getWsdlLocation() {
        if (UTILISATEURWEBSERVICE_EXCEPTION!= null) {
            throw UTILISATEURWEBSERVICE_EXCEPTION;
        }
        return UTILISATEURWEBSERVICE_WSDL_LOCATION;
    }

}