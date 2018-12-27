
package org.webservice.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour livre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="livre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anneeSortie" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="auteur" type="{http://services.webservice.org/}auteur" minOccurs="0"/>
 *         &lt;element name="disponible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="empruntable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idAuteur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="livreEmprunteByUserId" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="livreReserveByUserId" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nbExemplaires" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbRestant" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="reservable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "livre", propOrder = {
    "anneeSortie",
    "auteur",
    "disponible",
    "empruntable",
    "id",
    "idAuteur",
    "livreEmprunteByUserId",
    "livreReserveByUserId",
    "nbExemplaires",
    "nbRestant",
    "reservable",
    "titre"
})
public class Livre {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar anneeSortie;
    protected Auteur auteur;
    protected boolean disponible;
    protected boolean empruntable;
    protected int id;
    protected int idAuteur;
    protected boolean livreEmprunteByUserId;
    protected boolean livreReserveByUserId;
    protected int nbExemplaires;
    protected int nbRestant;
    protected boolean reservable;
    protected String titre;

    /**
     * Obtient la valeur de la propriété anneeSortie.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnneeSortie() {
        return anneeSortie;
    }

    /**
     * Définit la valeur de la propriété anneeSortie.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnneeSortie(XMLGregorianCalendar value) {
        this.anneeSortie = value;
    }

    /**
     * Obtient la valeur de la propriété auteur.
     * 
     * @return
     *     possible object is
     *     {@link Auteur }
     *     
     */
    public Auteur getAuteur() {
        return auteur;
    }

    /**
     * Définit la valeur de la propriété auteur.
     * 
     * @param value
     *     allowed object is
     *     {@link Auteur }
     *     
     */
    public void setAuteur(Auteur value) {
        this.auteur = value;
    }

    /**
     * Obtient la valeur de la propriété disponible.
     * 
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * Définit la valeur de la propriété disponible.
     * 
     */
    public void setDisponible(boolean value) {
        this.disponible = value;
    }

    /**
     * Obtient la valeur de la propriété empruntable.
     * 
     */
    public boolean isEmpruntable() {
        return empruntable;
    }

    /**
     * Définit la valeur de la propriété empruntable.
     * 
     */
    public void setEmpruntable(boolean value) {
        this.empruntable = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété idAuteur.
     * 
     */
    public int getIdAuteur() {
        return idAuteur;
    }

    /**
     * Définit la valeur de la propriété idAuteur.
     * 
     */
    public void setIdAuteur(int value) {
        this.idAuteur = value;
    }

    /**
     * Obtient la valeur de la propriété livreEmprunteByUserId.
     * 
     */
    public boolean isLivreEmprunteByUserId() {
        return livreEmprunteByUserId;
    }

    /**
     * Définit la valeur de la propriété livreEmprunteByUserId.
     * 
     */
    public void setLivreEmprunteByUserId(boolean value) {
        this.livreEmprunteByUserId = value;
    }

    /**
     * Obtient la valeur de la propriété livreReserveByUserId.
     * 
     */
    public boolean isLivreReserveByUserId() {
        return livreReserveByUserId;
    }

    /**
     * Définit la valeur de la propriété livreReserveByUserId.
     * 
     */
    public void setLivreReserveByUserId(boolean value) {
        this.livreReserveByUserId = value;
    }

    /**
     * Obtient la valeur de la propriété nbExemplaires.
     * 
     */
    public int getNbExemplaires() {
        return nbExemplaires;
    }

    /**
     * Définit la valeur de la propriété nbExemplaires.
     * 
     */
    public void setNbExemplaires(int value) {
        this.nbExemplaires = value;
    }

    /**
     * Obtient la valeur de la propriété nbRestant.
     * 
     */
    public int getNbRestant() {
        return nbRestant;
    }

    /**
     * Définit la valeur de la propriété nbRestant.
     * 
     */
    public void setNbRestant(int value) {
        this.nbRestant = value;
    }

    /**
     * Obtient la valeur de la propriété reservable.
     * 
     */
    public boolean isReservable() {
        return reservable;
    }

    /**
     * Définit la valeur de la propriété reservable.
     * 
     */
    public void setReservable(boolean value) {
        this.reservable = value;
    }

    /**
     * Obtient la valeur de la propriété titre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Définit la valeur de la propriété titre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitre(String value) {
        this.titre = value;
    }

}
