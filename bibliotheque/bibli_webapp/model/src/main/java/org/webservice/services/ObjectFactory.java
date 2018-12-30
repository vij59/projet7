
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

    private final static QName _AnnulerReservation_QNAME = new QName("http://services.webservice.org/", "annulerReservation");
    private final static QName _SupprimerReservationResponse_QNAME = new QName("http://services.webservice.org/", "supprimerReservationResponse");
    private final static QName _GetListeReservationsByBookId_QNAME = new QName("http://services.webservice.org/", "getListeReservationsByBookId");
    private final static QName _GetPremiereReservationDuLivreByIdResponse_QNAME = new QName("http://services.webservice.org/", "getPremiereReservationDuLivreByIdResponse");
    private final static QName _GetPlaceDansListeReservationsBookUserResponse_QNAME = new QName("http://services.webservice.org/", "getPlaceDansListeReservationsBookUserResponse");
    private final static QName _GetPremiereReservationDuLivreById_QNAME = new QName("http://services.webservice.org/", "getPremiereReservationDuLivreById");
    private final static QName _GetListeReservationsResponse_QNAME = new QName("http://services.webservice.org/", "getListeReservationsResponse");
    private final static QName _AnnulerReservationResponse_QNAME = new QName("http://services.webservice.org/", "annulerReservationResponse");
    private final static QName _GetReservationByBookIdByUserIdResponse_QNAME = new QName("http://services.webservice.org/", "getReservationByBookIdByUserIdResponse");
    private final static QName _GetReservationsByUserId_QNAME = new QName("http://services.webservice.org/", "getReservationsByUserId");
    private final static QName _GetNombreDeReservationsPourLivreIdResponse_QNAME = new QName("http://services.webservice.org/", "getNombreDeReservationsPourLivreIdResponse");
    private final static QName _CreerReservation_QNAME = new QName("http://services.webservice.org/", "creerReservation");
    private final static QName _GetReservationsByUserIdResponse_QNAME = new QName("http://services.webservice.org/", "getReservationsByUserIdResponse");
    private final static QName _CreerReservationResponse_QNAME = new QName("http://services.webservice.org/", "creerReservationResponse");
    private final static QName _GetListeReservationsByBookIdResponse_QNAME = new QName("http://services.webservice.org/", "getListeReservationsByBookIdResponse");
    private final static QName _GetPlaceDansListeReservationsBookUser_QNAME = new QName("http://services.webservice.org/", "getPlaceDansListeReservationsBookUser");
    private final static QName _GetNombreDeReservationsPourLivreId_QNAME = new QName("http://services.webservice.org/", "getNombreDeReservationsPourLivreId");
    private final static QName _GetReservationByBookIdByUserId_QNAME = new QName("http://services.webservice.org/", "getReservationByBookIdByUserId");
    private final static QName _GetListeReservations_QNAME = new QName("http://services.webservice.org/", "getListeReservations");
    private final static QName _SupprimerReservation_QNAME = new QName("http://services.webservice.org/", "supprimerReservation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.webservice.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNombreDeReservationsPourLivreIdResponse }
     * 
     */
    public GetNombreDeReservationsPourLivreIdResponse createGetNombreDeReservationsPourLivreIdResponse() {
        return new GetNombreDeReservationsPourLivreIdResponse();
    }

    /**
     * Create an instance of {@link CreerReservation }
     * 
     */
    public CreerReservation createCreerReservation() {
        return new CreerReservation();
    }

    /**
     * Create an instance of {@link GetReservationsByUserIdResponse }
     * 
     */
    public GetReservationsByUserIdResponse createGetReservationsByUserIdResponse() {
        return new GetReservationsByUserIdResponse();
    }

    /**
     * Create an instance of {@link GetNombreDeReservationsPourLivreId }
     * 
     */
    public GetNombreDeReservationsPourLivreId createGetNombreDeReservationsPourLivreId() {
        return new GetNombreDeReservationsPourLivreId();
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
     * Create an instance of {@link GetPlaceDansListeReservationsBookUser }
     * 
     */
    public GetPlaceDansListeReservationsBookUser createGetPlaceDansListeReservationsBookUser() {
        return new GetPlaceDansListeReservationsBookUser();
    }

    /**
     * Create an instance of {@link GetReservationByBookIdByUserId }
     * 
     */
    public GetReservationByBookIdByUserId createGetReservationByBookIdByUserId() {
        return new GetReservationByBookIdByUserId();
    }

    /**
     * Create an instance of {@link GetListeReservations }
     * 
     */
    public GetListeReservations createGetListeReservations() {
        return new GetListeReservations();
    }

    /**
     * Create an instance of {@link SupprimerReservation }
     * 
     */
    public SupprimerReservation createSupprimerReservation() {
        return new SupprimerReservation();
    }

    /**
     * Create an instance of {@link AnnulerReservation }
     * 
     */
    public AnnulerReservation createAnnulerReservation() {
        return new AnnulerReservation();
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
     * Create an instance of {@link GetPremiereReservationDuLivreByIdResponse }
     * 
     */
    public GetPremiereReservationDuLivreByIdResponse createGetPremiereReservationDuLivreByIdResponse() {
        return new GetPremiereReservationDuLivreByIdResponse();
    }

    /**
     * Create an instance of {@link GetPlaceDansListeReservationsBookUserResponse }
     * 
     */
    public GetPlaceDansListeReservationsBookUserResponse createGetPlaceDansListeReservationsBookUserResponse() {
        return new GetPlaceDansListeReservationsBookUserResponse();
    }

    /**
     * Create an instance of {@link GetPremiereReservationDuLivreById }
     * 
     */
    public GetPremiereReservationDuLivreById createGetPremiereReservationDuLivreById() {
        return new GetPremiereReservationDuLivreById();
    }

    /**
     * Create an instance of {@link GetListeReservationsResponse }
     * 
     */
    public GetListeReservationsResponse createGetListeReservationsResponse() {
        return new GetListeReservationsResponse();
    }

    /**
     * Create an instance of {@link AnnulerReservationResponse }
     * 
     */
    public AnnulerReservationResponse createAnnulerReservationResponse() {
        return new AnnulerReservationResponse();
    }

    /**
     * Create an instance of {@link GetReservationByBookIdByUserIdResponse }
     * 
     */
    public GetReservationByBookIdByUserIdResponse createGetReservationByBookIdByUserIdResponse() {
        return new GetReservationByBookIdByUserIdResponse();
    }

    /**
     * Create an instance of {@link GetReservationsByUserId }
     * 
     */
    public GetReservationsByUserId createGetReservationsByUserId() {
        return new GetReservationsByUserId();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "annulerReservation")
    public JAXBElement<AnnulerReservation> createAnnulerReservation(AnnulerReservation value) {
        return new JAXBElement<AnnulerReservation>(_AnnulerReservation_QNAME, AnnulerReservation.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlaceDansListeReservationsBookUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getPlaceDansListeReservationsBookUserResponse")
    public JAXBElement<GetPlaceDansListeReservationsBookUserResponse> createGetPlaceDansListeReservationsBookUserResponse(GetPlaceDansListeReservationsBookUserResponse value) {
        return new JAXBElement<GetPlaceDansListeReservationsBookUserResponse>(_GetPlaceDansListeReservationsBookUserResponse_QNAME, GetPlaceDansListeReservationsBookUserResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListeReservationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getListeReservationsResponse")
    public JAXBElement<GetListeReservationsResponse> createGetListeReservationsResponse(GetListeReservationsResponse value) {
        return new JAXBElement<GetListeReservationsResponse>(_GetListeReservationsResponse_QNAME, GetListeReservationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "annulerReservationResponse")
    public JAXBElement<AnnulerReservationResponse> createAnnulerReservationResponse(AnnulerReservationResponse value) {
        return new JAXBElement<AnnulerReservationResponse>(_AnnulerReservationResponse_QNAME, AnnulerReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationByBookIdByUserIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getReservationByBookIdByUserIdResponse")
    public JAXBElement<GetReservationByBookIdByUserIdResponse> createGetReservationByBookIdByUserIdResponse(GetReservationByBookIdByUserIdResponse value) {
        return new JAXBElement<GetReservationByBookIdByUserIdResponse>(_GetReservationByBookIdByUserIdResponse_QNAME, GetReservationByBookIdByUserIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationsByUserId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getReservationsByUserId")
    public JAXBElement<GetReservationsByUserId> createGetReservationsByUserId(GetReservationsByUserId value) {
        return new JAXBElement<GetReservationsByUserId>(_GetReservationsByUserId_QNAME, GetReservationsByUserId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNombreDeReservationsPourLivreIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getNombreDeReservationsPourLivreIdResponse")
    public JAXBElement<GetNombreDeReservationsPourLivreIdResponse> createGetNombreDeReservationsPourLivreIdResponse(GetNombreDeReservationsPourLivreIdResponse value) {
        return new JAXBElement<GetNombreDeReservationsPourLivreIdResponse>(_GetNombreDeReservationsPourLivreIdResponse_QNAME, GetNombreDeReservationsPourLivreIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationsByUserIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getReservationsByUserIdResponse")
    public JAXBElement<GetReservationsByUserIdResponse> createGetReservationsByUserIdResponse(GetReservationsByUserIdResponse value) {
        return new JAXBElement<GetReservationsByUserIdResponse>(_GetReservationsByUserIdResponse_QNAME, GetReservationsByUserIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlaceDansListeReservationsBookUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getPlaceDansListeReservationsBookUser")
    public JAXBElement<GetPlaceDansListeReservationsBookUser> createGetPlaceDansListeReservationsBookUser(GetPlaceDansListeReservationsBookUser value) {
        return new JAXBElement<GetPlaceDansListeReservationsBookUser>(_GetPlaceDansListeReservationsBookUser_QNAME, GetPlaceDansListeReservationsBookUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNombreDeReservationsPourLivreId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getNombreDeReservationsPourLivreId")
    public JAXBElement<GetNombreDeReservationsPourLivreId> createGetNombreDeReservationsPourLivreId(GetNombreDeReservationsPourLivreId value) {
        return new JAXBElement<GetNombreDeReservationsPourLivreId>(_GetNombreDeReservationsPourLivreId_QNAME, GetNombreDeReservationsPourLivreId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReservationByBookIdByUserId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getReservationByBookIdByUserId")
    public JAXBElement<GetReservationByBookIdByUserId> createGetReservationByBookIdByUserId(GetReservationByBookIdByUserId value) {
        return new JAXBElement<GetReservationByBookIdByUserId>(_GetReservationByBookIdByUserId_QNAME, GetReservationByBookIdByUserId.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "supprimerReservation")
    public JAXBElement<SupprimerReservation> createSupprimerReservation(SupprimerReservation value) {
        return new JAXBElement<SupprimerReservation>(_SupprimerReservation_QNAME, SupprimerReservation.class, null, value);
    }

}
