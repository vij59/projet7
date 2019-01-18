package org.webservice.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getReservationByBookIdByUserIdResponse complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="getReservationByBookIdByUserIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://services.webservice.org/}reservation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getReservationByBookIdByUserIdResponse", propOrder = {
        "_return"
})
public class GetReservationByBookIdByUserIdResponse {

    @XmlElement(name = "return")
    protected Reservation _return;

    /**
     * Obtient la valeur de la propriété return.
     *
     * @return possible object is
     * {@link Reservation }
     */
    public Reservation getReturn() {
        return _return;
    }

    /**
     * Définit la valeur de la propriété return.
     *
     * @param value allowed object is
     *              {@link Reservation }
     */
    public void setReturn(Reservation value) {
        this._return = value;
    }

}
