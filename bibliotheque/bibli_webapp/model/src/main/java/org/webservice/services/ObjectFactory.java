
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

    private final static QName _SupprimerReservationResponse_QNAME = new QName("http://services.webservice.org/", "supprimerReservationResponse");
    private final static QName _CreerReservation_QNAME = new QName("http://services.webservice.org/", "creerReservation");
    private final static QName _GetListeReservationsByBookId_QNAME = new QName("http://services.webservice.org/", "getListeReservationsByBookId");
    private final static QName _GetPremiereReservationDuLivreByIdResponse_QNAME = new QName("http://services.webservice.org/", "getPremiereReservationDuLivreByIdResponse");
    private final static QName _CreerReservationResponse_QNAME = new QName("http://services.webservice.org/", "creerReservationResponse");
    private final static QName _GetListeReservationsByBookIdResponse_QNAME = new QName("http://services.webservice.org/", "getListeReservationsByBookIdResponse");
    private final static QName _GetPremiereReservationDuLivreById_QNAME = new QName("http://services.webservice.org/", "getPremiereReservationDuLivreById");
    private final static QName _GetListeReservations_QNAME = new QName("http://services.webservice.org/", "getListeReservations");
    private final static QName _GetListeReservationsResponse_QNAME = new QName("http://services.webservice.org/", "getListeReservationsResponse");
    private final static QName _SupprimerReservation_QNAME = new QName("http://services.webservice.org/", "supprimerReservation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.webservice.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SupprimerReservationResponse }
     * 
     */
    public SupprimerReservationResponse createSupprimerReservationResponse() {
        return new SupprimerReservationResponse();
    }

    /**
     * Create an instance of {@link GetListeReservationsByBookId }
     * 
     */
    public GetListeReservationsByBookId createGetListeReservationsByBookId() {
        return new GetListeReservationsByBookId();
    }

    /**
     * Create an instance of {@link CreerReservation }
     * 
     */
    public CreerReservation createCreerReservation() {
        return new CreerReservation();
    }

    /**
     * Create an instance of {@link GetPremiereReservationDuLivreByIdResponse }
     * 
     */
    public GetPremiereReservationDuLivreByIdResponse createGetPremiereReservationDuLivreByIdResponse() {
        return new GetPremiereReservationDuLivreByIdResponse();
    }

    /**
     * Create an instance of {@link CreerReservationResponse }
     * 
     */
    public CreerReservationResponse createCreerReservationResponse() {
        return new CreerReservationResponse();
    }

    /**
     * Create an instance of {@link GetListeReservationsByBookIdResponse }
     * 
     */
    public GetListeReservationsByBookIdResponse createGetListeReservationsByBookIdResponse() {
        return new GetListeReservationsByBookIdResponse();
    }

    /**
     * Create an instance of {@link GetPremiereReservationDuLivreById }
     * 
     */
    public GetPremiereReservationDuLivreById createGetPremiereReservationDuLivreById() {
        return new GetPremiereReservationDuLivreById();
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
     * Create an instance of {@link SupprimerReservation }
     * 
     */
    public SupprimerReservation createSupprimerReservation() {
        return new SupprimerReservation();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "supprimerReservationResponse")
    public JAXBElement<SupprimerReservationResponse> createSupprimerReservationResponse(SupprimerReservationResponse value) {
        return new JAXBElement<SupprimerReservationResponse>(_SupprimerReservationResponse_QNAME, SupprimerReservationResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeReservationsByBookId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getListeReservationsByBookId")
    public JAXBElement<GetListeReservationsByBookId> createGetListeReservationsByBookId(GetListeReservationsByBookId value) {
        return new JAXBElement<GetListeReservationsByBookId>(_GetListeReservationsByBookId_QNAME, GetListeReservationsByBookId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPremiereReservationDuLivreByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getPremiereReservationDuLivreByIdResponse")
    public JAXBElement<GetPremiereReservationDuLivreByIdResponse> createGetPremiereReservationDuLivreByIdResponse(GetPremiereReservationDuLivreByIdResponse value) {
        return new JAXBElement<GetPremiereReservationDuLivreByIdResponse>(_GetPremiereReservationDuLivreByIdResponse_QNAME, GetPremiereReservationDuLivreByIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeReservationsByBookIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getListeReservationsByBookIdResponse")
    public JAXBElement<GetListeReservationsByBookIdResponse> createGetListeReservationsByBookIdResponse(GetListeReservationsByBookIdResponse value) {
        return new JAXBElement<GetListeReservationsByBookIdResponse>(_GetListeReservationsByBookIdResponse_QNAME, GetListeReservationsByBookIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPremiereReservationDuLivreById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getPremiereReservationDuLivreById")
    public JAXBElement<GetPremiereReservationDuLivreById> createGetPremiereReservationDuLivreById(GetPremiereReservationDuLivreById value) {
        return new JAXBElement<GetPremiereReservationDuLivreById>(_GetPremiereReservationDuLivreById_QNAME, GetPremiereReservationDuLivreById.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "supprimerReservation")
    public JAXBElement<SupprimerReservation> createSupprimerReservation(SupprimerReservation value) {
        return new JAXBElement<SupprimerReservation>(_SupprimerReservation_QNAME, SupprimerReservation.class, null, value);
    }

}
