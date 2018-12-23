
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

    private final static QName _CreerReservation_QNAME = new QName("http://services.webservice.org/", "creerReservation");
    private final static QName _CreerReservationResponse_QNAME = new QName("http://services.webservice.org/", "creerReservationResponse");
    private final static QName _GetListeReservations_QNAME = new QName("http://services.webservice.org/", "getListeReservations");
    private final static QName _GetListeReservationsResponse_QNAME = new QName("http://services.webservice.org/", "getListeReservationsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.webservice.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreerReservation }
     * 
     */
    public CreerReservation createCreerReservation() {
        return new CreerReservation();
    }

    /**
     * Create an instance of {@link CreerReservationResponse }
     * 
     */
    public CreerReservationResponse createCreerReservationResponse() {
        return new CreerReservationResponse();
    }

    /**
     * Create an instance of {@link GetListeReservations }
     * 
     */
    public GetListeReservations createGetListeReservations() {
        return new GetListeReservations();
    }

    /**
     * Create an instance of {@link GetListeReservationsResponse }
     * 
     */
    public GetListeReservationsResponse createGetListeReservationsResponse() {
        return new GetListeReservationsResponse();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "creerReservation")
    public JAXBElement<CreerReservation> createCreerReservation(CreerReservation value) {
        return new JAXBElement<CreerReservation>(_CreerReservation_QNAME, CreerReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "creerReservationResponse")
    public JAXBElement<CreerReservationResponse> createCreerReservationResponse(CreerReservationResponse value) {
        return new JAXBElement<CreerReservationResponse>(_CreerReservationResponse_QNAME, CreerReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeReservations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getListeReservations")
    public JAXBElement<GetListeReservations> createGetListeReservations(GetListeReservations value) {
        return new JAXBElement<GetListeReservations>(_GetListeReservations_QNAME, GetListeReservations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeReservationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getListeReservationsResponse")
    public JAXBElement<GetListeReservationsResponse> createGetListeReservationsResponse(GetListeReservationsResponse value) {
        return new JAXBElement<GetListeReservationsResponse>(_GetListeReservationsResponse_QNAME, GetListeReservationsResponse.class, null, value);
    }

}
