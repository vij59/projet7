
package org.webservice.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour validerLogin complex type.
 *
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 *
 * <pre>
 * &lt;complexType name="validerLogin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://services.webservice.org/}utilisateur" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validerLogin", propOrder = {
        "arg0",
        "arg1"
})
public class ValiderLogin {

    protected Utilisateur arg0;
    protected String arg1;

    /**
     * Obtient la valeur de la propriété arg0.
     *
     * @return possible object is
     * {@link Utilisateur }
     */
    public Utilisateur getArg0() {
        return arg0;
    }

    /**
     * Définit la valeur de la propriété arg0.
     *
     * @param value allowed object is
     *              {@link Utilisateur }
     */
    public void setArg0(Utilisateur value) {
        this.arg0 = value;
    }

    /**
     * Obtient la valeur de la propriété arg1.
     *
     * @return possible object is
     * {@link String }
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * Définit la valeur de la propriété arg1.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setArg1(String value) {
        this.arg1 = value;
    }

}
