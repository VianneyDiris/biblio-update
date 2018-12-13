
package com.vianney.ws.gestionpret;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Ouvrage complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Ouvrage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="editeur" type="{http://gestionpret.ws.vianney.com/}Editeur" minOccurs="0"/&gt;
 *         &lt;element name="exemplaire" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="langue" type="{http://gestionpret.ws.vianney.com/}Langue" minOccurs="0"/&gt;
 *         &lt;element name="listAuteur" type="{http://gestionpret.ws.vianney.com/}Auteur" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listGenre" type="{http://gestionpret.ws.vianney.com/}Genre" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="photos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="titre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ouvrage", propOrder = {
    "editeur",
    "exemplaire",
    "isbn",
    "id",
    "langue",
    "listAuteur",
    "listGenre",
    "photos",
    "resume",
    "titre"
})
public class Ouvrage {

    protected Editeur editeur;
    protected Integer exemplaire;
    @XmlElement(name = "ISBN")
    protected long isbn;
    protected Integer id;
    protected Langue langue;
    @XmlElement(nillable = true)
    protected List<Auteur> listAuteur;
    @XmlElement(nillable = true)
    protected List<Genre> listGenre;
    protected String photos;
    protected String resume;
    protected String titre;

    /**
     * Obtient la valeur de la propriété editeur.
     * 
     * @return
     *     possible object is
     *     {@link Editeur }
     *     
     */
    public Editeur getEditeur() {
        return editeur;
    }

    /**
     * Définit la valeur de la propriété editeur.
     * 
     * @param value
     *     allowed object is
     *     {@link Editeur }
     *     
     */
    public void setEditeur(Editeur value) {
        this.editeur = value;
    }

    /**
     * Obtient la valeur de la propriété exemplaire.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExemplaire() {
        return exemplaire;
    }

    /**
     * Définit la valeur de la propriété exemplaire.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExemplaire(Integer value) {
        this.exemplaire = value;
    }

    /**
     * Obtient la valeur de la propriété isbn.
     * 
     */
    public long getISBN() {
        return isbn;
    }

    /**
     * Définit la valeur de la propriété isbn.
     * 
     */
    public void setISBN(long value) {
        this.isbn = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété langue.
     * 
     * @return
     *     possible object is
     *     {@link Langue }
     *     
     */
    public Langue getLangue() {
        return langue;
    }

    /**
     * Définit la valeur de la propriété langue.
     * 
     * @param value
     *     allowed object is
     *     {@link Langue }
     *     
     */
    public void setLangue(Langue value) {
        this.langue = value;
    }

    /**
     * Gets the value of the listAuteur property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listAuteur property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListAuteur().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Auteur }
     * 
     * 
     */
    public List<Auteur> getListAuteur() {
        if (listAuteur == null) {
            listAuteur = new ArrayList<Auteur>();
        }
        return this.listAuteur;
    }

    /**
     * Gets the value of the listGenre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listGenre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListGenre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Genre }
     * 
     * 
     */
    public List<Genre> getListGenre() {
        if (listGenre == null) {
            listGenre = new ArrayList<Genre>();
        }
        return this.listGenre;
    }

    /**
     * Obtient la valeur de la propriété photos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhotos() {
        return photos;
    }

    /**
     * Définit la valeur de la propriété photos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhotos(String value) {
        this.photos = value;
    }

    /**
     * Obtient la valeur de la propriété resume.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResume() {
        return resume;
    }

    /**
     * Définit la valeur de la propriété resume.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResume(String value) {
        this.resume = value;
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
