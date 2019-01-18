package org.webservice.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Classe Java pour auteur complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="auteur">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="livres" type="{http://services.webservice.org/}livre" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "auteur", propOrder = {
        "id",
        "livres",
        "nom",
        "prenom"
})
public class Auteur {

    protected int id;
    @XmlElement(nillable = true)
    protected List<Livre> livres;
    protected String nom;
    protected String prenom;

    /**
     * Obtient la valeur de la propriété id.
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the livres property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the livres property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLivres().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Livre }
     */
    public List<Livre> getLivres() {
        if (livres == null) {
            livres = new ArrayList<Livre>();
        }
        return this.livres;
    }

    /**
     * Obtient la valeur de la propriété nom.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit la valeur de la propriété nom.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propriété prenom.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Définit la valeur de la propriété prenom.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPrenom(String value) {
        this.prenom = value;
    }

}
