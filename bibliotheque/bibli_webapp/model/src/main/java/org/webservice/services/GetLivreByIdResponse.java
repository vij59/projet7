package org.webservice.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getLivreByIdResponse complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="getLivreByIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://services.webservice.org/}livre" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLivreByIdResponse", propOrder = {
        "_return"
})
public class GetLivreByIdResponse {

    @XmlElement(name = "return")
    protected Livre _return;

    /**
     * Obtient la valeur de la propriété return.
     *
     * @return possible object is
     * {@link Livre }
     */
    public Livre getReturn() {
        return _return;
    }

    /**
     * Définit la valeur de la propriété return.
     *
     * @param value allowed object is
     *              {@link Livre }
     */
    public void setReturn(Livre value) {
        this._return = value;
    }

}
