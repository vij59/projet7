
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

    private final static QName _GetLivreByRecherche_QNAME = new QName("http://services.webservice.org/", "getLivreByRecherche");
    private final static QName _GetByIdResponse_QNAME = new QName("http://services.webservice.org/", "getByIdResponse");
    private final static QName _GetById_QNAME = new QName("http://services.webservice.org/", "getById");
    private final static QName _GetByNom_QNAME = new QName("http://services.webservice.org/", "getByNom");
    private final static QName _GetLivresResponse_QNAME = new QName("http://services.webservice.org/", "getLivresResponse");
    private final static QName _GetLivreByRechercheResponse_QNAME = new QName("http://services.webservice.org/", "getLivreByRechercheResponse");
    private final static QName _GetByNomResponse_QNAME = new QName("http://services.webservice.org/", "getByNomResponse");
    private final static QName _GetLivres_QNAME = new QName("http://services.webservice.org/", "getLivres");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.webservice.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLivreByRecherche }
     * 
     */
    public GetLivreByRecherche createGetLivreByRecherche() {
        return new GetLivreByRecherche();
    }

    /**
     * Create an instance of {@link GetByIdResponse }
     * 
     */
    public GetByIdResponse createGetByIdResponse() {
        return new GetByIdResponse();
    }

    /**
     * Create an instance of {@link GetById }
     * 
     */
    public GetById createGetById() {
        return new GetById();
    }

    /**
     * Create an instance of {@link GetByNom }
     * 
     */
    public GetByNom createGetByNom() {
        return new GetByNom();
    }

    /**
     * Create an instance of {@link GetLivresResponse }
     * 
     */
    public GetLivresResponse createGetLivresResponse() {
        return new GetLivresResponse();
    }

    /**
     * Create an instance of {@link GetLivreByRechercheResponse }
     * 
     */
    public GetLivreByRechercheResponse createGetLivreByRechercheResponse() {
        return new GetLivreByRechercheResponse();
    }

    /**
     * Create an instance of {@link GetByNomResponse }
     * 
     */
    public GetByNomResponse createGetByNomResponse() {
        return new GetByNomResponse();
    }

    /**
     * Create an instance of {@link GetLivres }
     * 
     */
    public GetLivres createGetLivres() {
        return new GetLivres();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Livre }
     * 
     */
    public Livre createLivre() {
        return new Livre();
    }

    /**
     * Create an instance of {@link Auteur }
     * 
     */
    public Auteur createAuteur() {
        return new Auteur();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivreByRecherche }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getLivreByRecherche")
    public JAXBElement<GetLivreByRecherche> createGetLivreByRecherche(GetLivreByRecherche value) {
        return new JAXBElement<GetLivreByRecherche>(_GetLivreByRecherche_QNAME, GetLivreByRecherche.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getByIdResponse")
    public JAXBElement<GetByIdResponse> createGetByIdResponse(GetByIdResponse value) {
        return new JAXBElement<GetByIdResponse>(_GetByIdResponse_QNAME, GetByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getById")
    public JAXBElement<GetById> createGetById(GetById value) {
        return new JAXBElement<GetById>(_GetById_QNAME, GetById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByNom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getByNom")
    public JAXBElement<GetByNom> createGetByNom(GetByNom value) {
        return new JAXBElement<GetByNom>(_GetByNom_QNAME, GetByNom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getLivresResponse")
    public JAXBElement<GetLivresResponse> createGetLivresResponse(GetLivresResponse value) {
        return new JAXBElement<GetLivresResponse>(_GetLivresResponse_QNAME, GetLivresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivreByRechercheResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getLivreByRechercheResponse")
    public JAXBElement<GetLivreByRechercheResponse> createGetLivreByRechercheResponse(GetLivreByRechercheResponse value) {
        return new JAXBElement<GetLivreByRechercheResponse>(_GetLivreByRechercheResponse_QNAME, GetLivreByRechercheResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetByNomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getByNomResponse")
    public JAXBElement<GetByNomResponse> createGetByNomResponse(GetByNomResponse value) {
        return new JAXBElement<GetByNomResponse>(_GetByNomResponse_QNAME, GetByNomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLivres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.webservice.org/", name = "getLivres")
    public JAXBElement<GetLivres> createGetLivres(GetLivres value) {
        return new JAXBElement<GetLivres>(_GetLivres_QNAME, GetLivres.class, null, value);
    }

}
