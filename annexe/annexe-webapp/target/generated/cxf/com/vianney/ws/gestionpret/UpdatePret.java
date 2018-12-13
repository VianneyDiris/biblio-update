
package com.vianney.ws.gestionpret;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour updatePret complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="updatePret"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pret" type="{http://gestionpret.ws.vianney.com/}Pret" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updatePret", propOrder = {
    "pret"
})
public class UpdatePret {

    protected Pret pret;

    /**
     * Obtient la valeur de la propriété pret.
     * 
     * @return
     *     possible object is
     *     {@link Pret }
     *     
     */
    public Pret getPret() {
        return pret;
    }

    /**
     * Définit la valeur de la propriété pret.
     * 
     * @param value
     *     allowed object is
     *     {@link Pret }
     *     
     */
    public void setPret(Pret value) {
        this.pret = value;
    }

}
