
package org.webservice.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="anneeSortie" type="{http://services.webservice.org/}date" minOccurs="0"/>
 *         &lt;element name="auteur" type="{http://services.webservice.org/}auteur" minOccurs="0"/>
 *         &lt;element name="disponible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idAuteur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbExemplaires" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nbRestant" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "id",
    "idAuteur",
    "nbExemplaires",
    "nbRestant",
    "titre"
})
public class Livre {

    protected Date anneeSortie;
    protected Auteur auteur;
    protected boolean disponible;
    protected int id;
    protected int idAuteur;
    protected int nbExemplaires;
    protected int nbRestant;
    protected String titre;

    /**
     * Obtient la valeur de la propriété anneeSortie.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getAnneeSortie() {
        return anneeSortie;
    }

    /**
     * Définit la valeur de la propriété anneeSortie.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setAnneeSortie(Date value) {
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
