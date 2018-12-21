
package org.webservice.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.webservice.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetListeReservationResponse_QNAME = new QName("http://services.webservice.org/", "getListeReservationResponse");
    private final static QName _GetListeReservation_QNAME = new QName("http://services.webservice.org/", "getListeReservation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.webservice.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetListeReservationResponse }
     * 
     */
    public GetListeReservationResponse createGetListeReservationResponse() {
        return new GetListeReservationResponse();
    }

    /**
     * Create an instance of {@link GetListeReservation }
     * 
     */
    public GetListeReservation createGetListeReservation() {
        return new GetListeReservation();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getListeReservationResponse")
    public JAXBElement<GetListeReservationResponse> createGetListeReservationResponse(GetListeReservationResponse value) {
        return new JAXBElement<GetListeReservationResponse>(_GetListeReservationResponse_QNAME, GetListeReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getListeReservation")
    public JAXBElement<GetListeReservation> createGetListeReservation(GetListeReservation value) {
        return new JAXBElement<GetListeReservation>(_GetListeReservation_QNAME, GetListeReservation.class, null, value);
    }

}
