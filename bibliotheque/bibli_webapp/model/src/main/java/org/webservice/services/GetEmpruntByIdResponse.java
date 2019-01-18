package org.webservice.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getEmpruntByIdResponse complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="getEmpruntByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://services.webservice.org/}emprunt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEmpruntByIdResponse", propOrder = {
        "_return"
})
public class GetEmpruntByIdResponse {

    @XmlElement(name = "return")
    protected Emprunt _return;

    /**
     * Obtient la valeur de la propriété return.
     *
     * @return possible object is
     * {@link Emprunt }
     */
    public Emprunt getReturn() {
        return _return;
    }

    /**
     * Définit la valeur de la propriété return.
     *
     * @param value allowed object is
     *              {@link Emprunt }
     */
    public void setReturn(Emprunt value) {
        this._return = value;
    }

}
